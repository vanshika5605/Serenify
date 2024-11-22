from flask import Flask, request, jsonify, Blueprint
import cv2
import numpy as np
import psycopg2
from psycopg2.extras import RealDictCursor
from google.cloud import vision
import io
import os
from googlemaps import Client as GoogleMaps


# USER_LATITUDE = '18.5516'  # Replace with the user's current latitude
# USER_LONGITUDE = '73.8899'  # Replace with the user's current longitude

api2 = Blueprint('api2', __name__)


# app = Flask(__name__)
vision_client = vision.ImageAnnotatorClient()
gmaps = GoogleMaps(key='AIzaSyB6Qemr3YisG_2t55ToptadxDnK4NOEwYE') 

UPLOAD_FOLDER = 'uploads'  # You can change this to any directory
os.makedirs(UPLOAD_FOLDER, exist_ok=True)  # Create directory if it doesn't exist

# Database connection
def connect_db():
    conn = psycopg2.connect(
        dbname="postgres",    
        user="postgres",  
        password="Mind-Menders",
        host="104.154.52.166",
        port="5432"
    )
    return conn

# Create table
def create_table():
    conn = connect_db()
    cur = conn.cursor()
    cur.execute("""
        CREATE TABLE IF NOT EXISTS personal_places (
            id SERIAL PRIMARY KEY,
            name VARCHAR(255) NOT NULL,
            image_path VARCHAR(255) UNIQUE NOT NULL,
            address VARCHAR(255) NOT NULL,
            latitude FLOAT NOT NULL,
            longitude FLOAT NOT NULL,
            features BYTEA NOT NULL
        );
    """)
    conn.commit()
    cur.close()
    conn.close()

# Insert a personal place
def insert_personal_place(name, image_path, address, latitude, longitude):
    features = extract_features(image_path)
    conn = connect_db()
    cur = conn.cursor()
    cur.execute(
        "INSERT INTO personal_places (name, image_path, address, latitude, longitude, features) VALUES (%s, %s, %s, %s, %s, %s)",
        (name, image_path, address, latitude, longitude, psycopg2.Binary(features.tobytes()))
    )
    conn.commit()
    cur.close()
    conn.close()

# Retrieve all personal places
def get_all_personal_places():
    conn = connect_db()
    cur = conn.cursor(cursor_factory=RealDictCursor)
    cur.execute("SELECT * FROM personal_places")
    results = cur.fetchall()
    cur.close()
    conn.close()
    return results

# Compare features with the database
def compare_features(new_image_path):
    new_features = extract_features(new_image_path)
    bf = cv2.BFMatcher(cv2.NORM_HAMMING, crossCheck=True)
    personal_places = get_all_personal_places()
    
    best_match = None
    best_matches_count = 0

    for place in personal_places:
        db_features = np.frombuffer(place['features'], dtype=np.uint8).reshape(-1, 32)
        matches = bf.match(new_features, db_features)
        matches = sorted(matches, key=lambda x: x.distance)
        if len(matches) > best_matches_count:
            best_matches_count = len(matches)
            best_match = place

    return best_match


# Get place details using Google Places API
def get_place_details(place):
    # places_result = gmaps.places(query=place_name)
    # if places_result['results']:
        # place = places_result['results'][0]
    place_details = {
        'name': place['name'],
        'address': place['formatted_address'],
        'location': place['geometry']['location']
    }
    return place_details

# Calculate distance using Google Maps API
def calculate_distance(home_location, place_location):
    distance_result = gmaps.distance_matrix(origins=[home_location], destinations=[place_location])
    if distance_result['rows']:
        distance = distance_result['rows'][0]['elements'][0]['distance']['text']
        return distance
    return None

# Geocode home address to get latitude and longitude
def geocode_address(address):
    geocode_result = gmaps.geocode(address)
    if geocode_result:
        location = geocode_result[0]['geometry']['location']
        return location
    return None

def recognize_landmark(image_path):
    with open(image_path, 'rb') as image_file:
        content = image_file.read()
        image = vision.Image(content=content)

    response = vision_client.landmark_detection(image=image)
    landmarks = response.landmark_annotations

    if landmarks:
        return landmarks[0].description, landmarks[0].locations[0].lat_lng  # Return the first recognized landmark and its location
    return None, None

# Function to extract labels from an image
def extract_labels(image_path):
    with open(image_path, 'rb') as image_file:
        content = image_file.read()
        image = vision.Image(content=content)

    response = vision_client.label_detection(image=image)
    labels = response.label_annotations
    print("Labels:", labels)
    if labels:
        return [label.description for label in labels]
    return None

# Function to perform OCR on an image
def extract_text(image_path):
    with open(image_path, 'rb') as image_file:
        content = image_file.read()
        image = vision.Image(content=content)

    response = vision_client.text_detection(image=image)
    texts = response.text_annotations

    if texts:
        return texts[0].description  # Return the first detected text
    return None

# Function to perform place search using labels and current location
def search_places(query, location):
    places_result = gmaps.places_nearby(
        location=location,
        radius=1000,  # Search within 5km radius
        keyword=query
    )

    return places_result.get('results', [])


# Main function
def main(user_details):
    image_path = user_details['image_path']
    home_location = geocode_address(user_details['home_address'])
    user_latitude = user_details['user_latitude'];
    user_longitude = user_details['user_longitude'];
    if not home_location:
        return {'error': 'Unable to geocode home address'}

    # place_name, place_location = recognize_landmark(image_path)
    # if place_name:
    #     print(f"Recognized Landmark: {place_name}")
    #     address = get_place_details(place_location)
    #     print(f"Address: {address}")
    #     return

    # Extract labels from the image
    labels = extract_labels(image_path)
    if labels:
        print("Labels detected:", labels)

    # Extract text from the image
    text = extract_text(image_path)
    if text:
        print("Text detected:", text)
        labels = [text] + labels

    # User's current location
    user_location = (user_latitude, user_longitude)

    # Perform place search using labels and current location
    query = " ".join(labels[:3])  # Using the top 3 labels for search
    print(f"query: {query}")
    places = search_places(query, user_location)
    if places:
        place = places[0]
        print(place)
        distance = calculate_distance(home_location, place['geometry']['location'])
        return {
            'name': place['name'],
            'address': place['vicinity'],
            'distance': distance
        }
    else:
        personal_place = compare_features(image_path)
        if personal_place:
            place_location = {'lat': personal_place['latitude'], 'lng': personal_place['longitude']}
            distance = calculate_distance(home_location, place_location)
            return {
                'name': personal_place,
                'address': personal_place,
                'distance': distance
            }
        else:
            return {'error': 'Place not recognized'}




@api2.route('/identify-place', methods=['POST'])
def identify_place():
    if 'image' not in request.files:
        return jsonify({'error': 'No image file provided'}), 400

    image = request.files['image']
    image_path = os.path.join(UPLOAD_FOLDER, image.filename)
    image.save(image_path)
    image_path = os.path.abspath(image_path)
    user_id = request.form['user_id']
    home_address = request.form['home_address']
    user_latitude = request.form['user_latitude']
    user_longitude = request.form['user_longitude']
    user_details = {'user_id':user_id, 'home_address':home_address, 'user_latitude':user_latitude, 'user_longitude':user_longitude, 'image_path':image_path}
    print(user_details)
    # return jsonify(user_details)
    result = main(user_details)
    return jsonify(result)

# Example usage
# if __name__ == "__main__":
    # create_table()
    # # Insert sample data (uncomment to insert sample data)
    # # insert_personal_place('Alice Johnson\'s Home', 'alice_home.jpg', '789 Pine St, Sometown, USA', 40.7128, -74.0060)

    # # Process new image
    # image_path = 'path_to_image.jpg' 
    # home_address = 'HV2Q+MX2, Jayprakash Nagar, Yerawada, Pune, Maharashtra 411006' 
    # result = main(image_path, home_address)
    # # recognize_landmark(image_path)
    # print(result)
    # app.run(host='0.0.0.0', port=5000)
