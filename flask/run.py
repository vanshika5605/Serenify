from flask import Flask
from api1 import api1
from api2 import api2
from api3 import api3
import os

def create_app():
    app = Flask(__name__)

    # Ensure the uploads directory exists
    os.makedirs('uploads', exist_ok=True)

    # Register blueprints
    app.register_blueprint(api1)
    app.register_blueprint(api2)
    app.register_blueprint(api3)

    return app

app = create_app()

if __name__ == "__main__":
    app.run(host='0.0.0.0',port=8080)