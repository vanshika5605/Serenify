package com.db.hackathon.user_tracker.port;

import com.db.hackathon.user_tracker.adapters.models.CarerProfile;
import com.db.hackathon.user_tracker.adapters.models.PatientCarerMapping;
import com.db.hackathon.user_tracker.adapters.models.PatientProfile;
import com.db.hackathon.user_tracker.adapters.models.UserInfo;
import com.db.hackathon.user_tracker.adapters.repositories.CarerProfileRepository;
import com.db.hackathon.user_tracker.adapters.repositories.PatientCarerMappingRepository;
import com.db.hackathon.user_tracker.adapters.repositories.PatientProfileRepository;
import com.db.hackathon.user_tracker.adapters.repositories.UserRepository;
import com.db.hackathon.user_tracker.port.models.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(value = "*")
public class PatientCarerController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarerProfileRepository carerProfileRepository;

    @Autowired
    private PatientProfileRepository patientProfileRepository;

    @Autowired
    private PatientCarerMappingRepository patientCarerMappingRepository;

    @GetMapping("/user-info")
    public ResponseEntity<Object> getUserInfo(@RequestParam String userId){
        UserInfo user = userRepository.findByUserId(userId);
        if(user.getRole().equals("CARER")){
            CarerProfile carerProfile = carerProfileRepository.findByCarerId(user.getUserId());
            List<PatientCarerMapping> patientIds = patientCarerMappingRepository.findByCarerId(user.getUserId());
            List<PatientProfile> patientList = patientProfileRepository.findByPatientIdIn(patientIds.stream().map(PatientCarerMapping::getPatientId).toList());
            List<Patient> patients = new ArrayList<>();

            TypeToken<Map<String, Boolean>> typeReference = new TypeToken<>() {
            };
            System.out.printf(carerProfile.getReminders());
            Map<String, Boolean> carerReminderPreferences = new Gson().fromJson(carerProfile.getReminders(), typeReference);

            for(PatientProfile p: patientList){
                UserInfo patient = userRepository.findByUserId(p.getPatientId());
                TypeToken<Map<String, List<UserReminder>>> t = new TypeToken<Map<String, List<UserReminder>>>() {};
                Map<String, List<UserReminder>> userReminders = new Gson().fromJson(p.getReminders(), t);
                userReminders.entrySet().stream().filter(userReminder ->
                    carerReminderPreferences.get(userReminder.getKey()).equals(true)
                );
                patients.add(new Patient(p.getPatientId(), patient.getName(), p.getDangerZones(), new Gson().toJson(userReminders)));
            }
            CarerInfo carerInfo = new CarerInfo(user.getUserId(), user.getName(), user.getRole(), user.getInfo(), carerProfile.getCarerType(), carerProfile.getAlerts(), carerProfile.getReminders(), carerProfile.getInformation(), patients);
            return new ResponseEntity<>(carerInfo, HttpStatus.OK);
        } else{
            PatientProfile patientProfile = patientProfileRepository.findByPatientId(user.getUserId());
            List<PatientCarerMapping> carerIds = patientCarerMappingRepository.findByPatientId(user.getUserId());
            List<UserInfo> carers = userRepository.findByUserIdIn(carerIds.stream().map(PatientCarerMapping::getCarerId).toList());
            List<Carer> carerList = new ArrayList<>();
            for(UserInfo u: carers){
                carerList.add(new Carer(u.getUserId(), u.getName(), u.getInfo()));
            }
            PatientInfo patientInfo = new PatientInfo(user.getUserId(), user.getName(), user.getRole(), user.getInfo(), patientProfile.getHomeLatitude(), patientProfile.getHomeLongitude(), patientProfile.getDangerZones(), patientProfile.getReminders().toString(), carerList);
            return new ResponseEntity<>(patientInfo, HttpStatus.OK);
        }
    }


}
