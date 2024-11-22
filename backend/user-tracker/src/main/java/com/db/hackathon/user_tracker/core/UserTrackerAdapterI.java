package com.db.hackathon.user_tracker.core;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.models.RouteStep;
import com.db.hackathon.user_tracker.port.model.PatientData;

import java.util.List;

public interface UserTrackerAdapterI {

    public PatientTrackingInfo getPatientPreviousLocation(String id);
    public void saveLastLocation(PatientData patientData, PatientTrackingInfo patientTrackingInfo);
    public void resetPatientCurrentRoute(String userId);

    List<RouteStep> getRoutesDetail(String userId);
}
