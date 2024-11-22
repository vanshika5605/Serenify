package com.db.hackathon.user_tracker.core;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.repository.PatientTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SosCreateEventService implements SosCreateEventI{

    @Autowired
    SosCreateEventAdapterI sosCreateEventAdapter;

    @Autowired
    public PatientTrackingRepository patientTrackingRepository;

    @Override
    public void createSOSEvent(String userID) {
        sosCreateEventAdapter.createSOSEventAdapter(userID);
    }

    @Override
    public PatientTrackingInfo currentPatientTracking(String patientID) {
        return patientTrackingRepository.findPatientTrackingInfoOrderByLogTimeDesc(patientID);
    }
}
