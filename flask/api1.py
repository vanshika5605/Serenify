from flask import Flask, jsonify, request, Blueprint
import logic

# Initialize Flask app
# app = Flask(_name_)

api1 = Blueprint('api1', __name__)

# API endpoints
@api1.route('/check_deviation', methods=['POST'])
def check_deviation_api():
    data = request.get_json()
    user_id = data['user_id']
    current_location = (data['latitude'], data['longitude'])
    deviation = logic.check_deviation(user_id, current_location)
    return jsonify(deviation), 200

@api1.route('/add_route_feedback', methods=['POST'])
def add_route_feedback():
    data = request.get_json()
    user_id = data['user_id']
    route_steps = [(step['latitude'], step['longitude']) for step in data['route_steps']]
    logic.handle_feedback(user_id, route_steps)
    return jsonify({'message': 'Feedback processed successfully.'}), 200

# if _name_ == '_main_':
#     app.run(host='0.0.0.0',port=8080)
