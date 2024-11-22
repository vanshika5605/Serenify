package com.db.hackathon.user_tracker.core;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.repository.PatientTrackingRepository;

public interface SosCreateEventI {

    void createSOSEvent(String userID);

    PatientTrackingInfo currentPatientTracking(String patientID);
}
