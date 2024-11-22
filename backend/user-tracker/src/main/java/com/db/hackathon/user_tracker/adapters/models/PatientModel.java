package com.db.hackathon.user_tracker.adapters.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientModel {
    String patient_id;
    float patient_latitude;
    float patient_longitude;
}
