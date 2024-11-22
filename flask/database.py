import psycopg2

# Database connection details
DB_HOST = '104.154.52.166'
DB_PORT = '5432'
DB_NAME = 'postgres'
DB_USER = 'postgres'
DB_PASSWORD = 'Mind-Menders'

def fetch_user_paths(user_id):
    conn = psycopg2.connect(
        dbname=DB_NAME,
        user=DB_USER,
        password=DB_PASSWORD,
        host=DB_HOST,
        port=DB_PORT
    )
    cursor = conn.cursor()
    
    query = """
        SELECT path_id, source_latitude, source_longitude, dest_latitude, dest_longitude
        FROM paths
        WHERE user_id = %s
    """
    
    cursor.execute(query, (user_id,))
    user_paths = {}
    for row in cursor.fetchall():
        path_id, source_lat, source_lon, dest_lat, dest_lon = row
        user_paths[path_id] = {
            'source': (source_lat, source_lon),
            'destination': (dest_lat, dest_lon),
            'steps': fetch_path_steps(path_id)
        }
    
    cursor.close()
    conn.close()
    
    return user_paths

def fetch_path_steps(path_id):
    conn = psycopg2.connect(
        dbname=DB_NAME,
        user=DB_USER,
        password=DB_PASSWORD,
        host=DB_HOST,
        port=DB_PORT
    )
    cursor = conn.cursor()
    
    query = """
        SELECT step_order, latitude, longitude
        FROM steps
        WHERE path_id = %s
        ORDER BY step_order
    """
    
    cursor.execute(query, (path_id,))
    path_steps = [{'step_order': row[0], 'latitude': row[1], 'longitude': row[2]} for row in cursor.fetchall()]
    
    cursor.close()
    conn.close()
    
    return path_steps

def insert_path(user_id, source_lat, source_lon, dest_lat, dest_lon):
    conn = psycopg2.connect(
        dbname=DB_NAME,
        user=DB_USER,
        password=DB_PASSWORD,
        host=DB_HOST,
        port=DB_PORT
    )
    cursor = conn.cursor()
    
    query = """
        INSERT INTO paths (path_id, user_id, source_latitude, source_longitude, dest_latitude, dest_longitude)
        VALUES (nextval('path_id_seq'), %s, %s, %s, %s, %s)
        RETURNING path_id
    """
    cursor.execute(query, (user_id, source_lat, source_lon, dest_lat, dest_lon))
    path_id = cursor.fetchone()[0]
    
    conn.commit()
    cursor.close()
    conn.close()
    
    return path_id

def insert_path_step(path_id, step_order, latitude, longitude):
    conn = psycopg2.connect(
        dbname=DB_NAME,
        user=DB_USER,
        password=DB_PASSWORD,
        host=DB_HOST,
        port=DB_PORT
    )
    cursor = conn.cursor()
    
    query = """
        INSERT INTO steps (path_id, step_order, latitude, longitude)
        VALUES (%s, %s, %s, %s)
    """
    cursor.execute(query, (path_id, step_order, latitude, longitude))
    
    conn.commit()
    cursor.close()
    conn.close()