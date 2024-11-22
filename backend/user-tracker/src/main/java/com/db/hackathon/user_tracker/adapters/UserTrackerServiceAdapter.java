package com.db.hackathon.user_tracker.adapters;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.models.PatientProfile;
import com.db.hackathon.user_tracker.adapters.models.RouteStep;
import com.db.hackathon.user_tracker.adapters.repositories.PatientProfileRepository;
import com.db.hackathon.user_tracker.adapters.repository.PatientTrackingRepository;
import com.db.hackathon.user_tracker.core.UserTrackerAdapterI;
import com.db.hackathon.user_tracker.port.model.PatientData;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.RouteMatcher;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserTrackerServiceAdapter implements UserTrackerAdapterI {

    @Autowired
    private DataSource dataSource;


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PatientTrackingRepository patientTrackingRepository;

    @Autowired
    public PatientProfileRepository patientProfileRepository;

    @Override
    public PatientTrackingInfo getPatientPreviousLocation(String id) {
        try {
            return  patientTrackingRepository.findPatientTrackingInfoOrderByLogTimeDesc(id);
        } catch (Exception ex) {
            System.out.print(ex);
            return null;
        }
    }

    @Override
    public void saveLastLocation(PatientData patientData, PatientTrackingInfo patientTrackingInfo) {
        PatientTrackingInfo patientTrackingInfo1 = new PatientTrackingInfo();
        patientTrackingInfo1.setPatientId(patientData.getPatientId());
        patientTrackingInfo1.setLatitude(patientData.getLatitude());
        patientTrackingInfo1.setLongitude(patientData.getLongitude());
        patientTrackingInfo1.setLogTime(LocalDateTime.now());

        PatientProfile patientProfile = patientProfileRepository.findByPatientId(patientData.getPatientId());
        if(patientProfile.getCurrentRouteId()!=null) {
            patientTrackingInfo1.setRouteId(patientProfile.getCurrentRouteId());
        } else {
            System.out.println(patientProfile.getReminders());
            JsonElement reminders = patientProfile.getReminders();
           String maxCurrentRouteId =  patientTrackingRepository.findMaxCurrentRouteId();
           String routeId = String.valueOf(Integer.parseInt(maxCurrentRouteId)+1);
           // setting route id
//           patientProfile.setCurrentRouteId(routeId);

           jdbcTemplate.update("UPDATE patient_profile set current_route_id=? where patient_id=?", routeId, patientData.getPatientId());
//           patientProfile.setReminders(reminders);
//           patientProfileRepository.save(patientProfile);

           patientTrackingInfo1.setRouteId(routeId);
        }

        patientTrackingRepository.save(patientTrackingInfo1);
    }

    @Override
    public void resetPatientCurrentRoute(String userId) {
        jdbcTemplate.update("UPDATE patient_profile set current_route_id=null where patient_id=?", userId);
       // patientProfileRepository.save(findByPatientId);
    }

    @Override
    public List<RouteStep> getRoutesDetail(String userId){
       List<Object[]> objectList = patientTrackingRepository.getRoutesStepInfo(userId);
       List<RouteStep> routeStepsList = new ArrayList<>();
       objectList.forEach(object -> {
           routeStepsList.add(new RouteStep((float)object[0],(float)object[1]));
       });

       return routeStepsList;
    }
}
