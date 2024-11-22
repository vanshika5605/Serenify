package com.db.hackathon.user_tracker.port;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.core.UserTrackerServiceI;
import com.db.hackathon.user_tracker.port.model.PatientData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*")
public class UserTrackerController {
    @Autowired
    private UserTrackerServiceI userTrackerServiceI;

    @PostMapping("/validateTrack")
    public ResponseEntity<PatientTrackingInfo> validateLocation(@RequestBody PatientData patientData) {
        PatientTrackingInfo location = userTrackerServiceI.trackPatient(patientData);
        return new ResponseEntity<>(location, HttpStatus.OK);
    }

    @PutMapping("/deviation-feedback")
    public void deviationFeedback(@RequestParam String userId){
        userTrackerServiceI.deviationFeedback(userId);
    }


}
