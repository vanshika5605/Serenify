CREATE TABLE USERS (
  user_id TEXT PRIMARY KEY  NOT NULL,
  name TEXT    NOT NULL,
  role TEXT    NOT NULL,
  info JSON
);

CREATE TABLE PATIENT_CARER_MAPPING (
  PATIENT_id TEXT NOT NULL,
  CARER_id TEXT NOT NULL,
  PRIMARY KEY(PATIENT_id, CARER_id)
);

CREATE TABLE CARER_PROFILE (
  CARER_id TEXT PRIMARY KEY  NOT NULL,
  CARER_TYPE TEXT    NOT NULL,
  alerts JSON,
  reminder JSON,
  information BOOLEAN
);

CREATE TABLE EVENTS (
  event_id int PRIMARY KEY  NOT NULL,
  EVENT_TYPE TEXT    NOT NULL,
  PATIENT_id TEXT NOT NULL,
  event_time TIMESTAMP not null,
  event_status text 
);

CREATE TABLE PATIENT_PROFILE (
  PATIENT_id TEXT PRIMARY KEY  NOT NULL,
home_latitude real,
home_longitude real,
  danger_zones text,
  reminders json
);

CREATE TABLE PATHS (
  path_id int PRIMARY KEY  NOT NULL,
user_id TEXT NOT NULL,
source_latitude real,
source_longitude real,
dest_latitude real,
dest_longitude real
);

CREATE TABLE STEPS (
  path_id int NOT NULL,
step_order int NOT NULL,
latitude real,
longitude real,
PRIMARY KEY(path_id, step_order)
);