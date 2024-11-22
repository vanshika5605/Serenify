from geopy.distance import geodesic
import database

def check_deviation(user_id, current_location):
    user_paths = database.fetch_user_paths(user_id)
    for path_id, path_info in user_paths.items():
        for step in path_info['steps']:
            step_location = (step['latitude'], step['longitude'])
            distance = geodesic(current_location, step_location).meters
            if distance < 10:  # within 10 meters of a known step
                return False  # not a deviation
    return True  # deviation detected

def handle_feedback(user_id, route_steps):
    source = route_steps[0]
    destination = route_steps[-1]
    path_id = database.insert_path(user_id, source[0], source[1], destination[0], destination[1])
    for step_order, step in enumerate(route_steps, start=1):
        database.insert_path_step(path_id, step_order, step[0], step[1])