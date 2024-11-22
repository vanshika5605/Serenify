from flask import Flask, request, jsonify, Blueprint
from geopy.distance import great_circle
import psycopg2
from psycopg2.extras import RealDictCursor
import json
from datetime import datetime

api3 = Blueprint('api3', __name__)

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


# Retrieve all personal places
def get_patient_danger_zones(patient_id):
    conn = connect_db()
    cur = conn.cursor(cursor_factory=RealDictCursor)
    cur.execute("SELECT danger_zones FROM PATIENT_PROFILE WHERE patient_id = %s", (patient_id,))
    danger_zones = cur.fetchall()
    cur.close()
    conn.close()
    for zones in danger_zones:
        return zones['danger_zones']

def generate_event(patient_id):
    conn = connect_db()
    cur = conn.cursor()
    cur.execute(
        "INSERT INTO EVENTS (event_type, patient_id, event_time, event_status) VALUES (%s, %s, %s, %s)",
        ("DANGER_ZONE", patient_id, datetime.now(), "NEW")
    )
    conn.commit()
    cur.close()
    conn.close()

def is_within_geofence(point, geofence_center):
    distance = great_circle(point, geofence_center).meters
    return distance <= 500

@api3.route('/detect-danger-zone', methods=['POST'])
def detect_danger_zone():
    patient_id = request.form['patient_id']
    patient_location = (request.form['patient_latitude'], request.form['patient_longitude'])
    danger_zones = json.loads(get_patient_danger_zones(patient_id))
    for zone in danger_zones:
        if is_within_geofence(patient_location, (zone['latitude'], zone['longitude'])):
            generate_event(patient_id)
            return jsonify({'message': 'danger zone detected'})
    return jsonify({'message': 'danger zone not detected'})