package com.db.hackathon.user_tracker.port;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.core.SosCreateEventI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class SosController {

    @Autowired
    SosCreateEventI sosCreateEvent;

    @PostMapping(value = "/sos",produces = {MediaType.APPLICATION_JSON_VALUE})
    public void createSOSEvent(@RequestParam String userID){
        sosCreateEvent.createSOSEvent(userID);
    }

    @GetMapping(value = "/current-patient-tracking",produces = {MediaType.APPLICATION_JSON_VALUE})
    public PatientTrackingInfo currentPatientTracking(@RequestParam String patientID){
        return sosCreateEvent.currentPatientTracking(patientID);
    }
}
