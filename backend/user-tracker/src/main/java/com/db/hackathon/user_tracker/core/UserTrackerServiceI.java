package com.db.hackathon.user_tracker.core;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.models.RouteStep;
import com.db.hackathon.user_tracker.port.model.PatientData;

import java.util.List;

public interface UserTrackerServiceI {

    public PatientTrackingInfo trackPatient(PatientData patientData);

    public void deviationFeedback(String userId);
}
