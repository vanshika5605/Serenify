package com.db.hackathon.user_tracker.core;

import com.db.hackathon.user_tracker.adapters.PythonModelAdapter;
import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.models.CheckLocationModel;
import com.db.hackathon.user_tracker.adapters.models.FeedbackModel;
import com.db.hackathon.user_tracker.adapters.models.PatientModel;
import com.db.hackathon.user_tracker.adapters.models.RouteStep;
import com.db.hackathon.user_tracker.port.model.PatientData;
import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.RouteMatcher;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

@Service
public class UserTrackerService implements UserTrackerServiceI {

    @Autowired
    private UserTrackerAdapterI userTrackerServiceAdapter;

    @Autowired
    SosCreateEventAdapterI sosCreateEventAdapter;

    @Autowired
    PythonModelAdapter pythonModelAdapter;



    public PatientTrackingInfo trackPatient(PatientData patientData) {

        // if withing range
        // check the location range
        // if in same then check time
        // if time greater than 2 days generate event
        // if less than 2 then do nothing


        //else
        //if out side range then save last location
        callGeofence(patientData);

        PatientTrackingInfo patientTrackingInfo =  userTrackerServiceAdapter.getPatientPreviousLocation(patientData.getPatientId());
          Test2 test2 = new Test2();
        //calculateDistance(double lat1,double lon1,double lat2,double lon2)
        //if ((patientData.getLatitude() == patientTrackingInfo.getLatitude()) && (patientData.getLongitude() == patientTrackingInfo.getLongitude())) {

        System.out.println("value is "+test2.calculateDistance(patientData.getLatitude(), patientData.getLongitude(), patientTrackingInfo.getLatitude(), patientTrackingInfo.getLongitude()));
            if (test2.calculateDistance(patientData.getLatitude(), patientData.getLongitude(), patientTrackingInfo.getLatitude(), patientTrackingInfo.getLongitude()) < 200000) {
                LocalDateTime date1 = patientData.getLogTime();
                LocalDateTime date2 = patientTrackingInfo.getLogTime();
                // reset current route id
                userTrackerServiceAdapter.resetPatientCurrentRoute(patientData.getPatientId());
                if (ChronoUnit.DAYS.between(date2, date1)  >=2 ){
                    System.out.println("Inside More than 2 days");
                    sosCreateEventAdapter.createInactivityEventAdapter(patientData.getPatientId());
                } else {
                    System.out.println("Inside less than 2 days");
                }
            } else {
                System.out.println("Inside else");
                userTrackerServiceAdapter.saveLastLocation(patientData, patientTrackingInfo);
                CheckLocationModel locationModel = new CheckLocationModel(patientData.getPatientId(),patientData.getLatitude(),patientData.getLongitude());
                if(pythonModelAdapter.checkDeviation(locationModel)){
                    sosCreateEventAdapter.createDeviatedEventAdapter(patientData.getPatientId());
                }
            }
        //}

        return null;
    }

    @Override
    public void deviationFeedback(String userId) {
        List<RouteStep> routeSteps = userTrackerServiceAdapter.getRoutesDetail(userId);
        FeedbackModel feedbackModel = new FeedbackModel(userId,routeSteps);
        pythonModelAdapter.addFeedback(feedbackModel);

    }

/*
    public void callGeofence () {
        try {
            URL url = new URL("http://localhost:8080/detect-danger-zone");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // JSON body to send
            String jsonInputString = "{\"patient_id\":\"abc.xyz@db.com\",\"patient_latitude\":76,\"patient_longitude\":79}";

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode);

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/


    public void callGeofence(PatientData patientData){
        try{
         //   String jsonInputString = "{\"patient_id\":\"abc.xyz@db.com\",\"patient_latitude\":76,\"patient_longitude\":79}";

            PatientModel patientModel = new PatientModel();
            patientModel.setPatient_id(patientData.getPatientId());
            patientModel.setPatient_latitude(patientData.getLatitude());
            patientModel.setPatient_longitude(patientData.getLongitude());

            MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
            formData.add("patient_id", patientData.getPatientId());
            formData.add("patient_latitude", String.valueOf(patientData.getLatitude()));
            formData.add("patient_longitude", String.valueOf(patientData.getLongitude()));


            UriComponentsBuilder uribuilder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/detect-danger-zone");
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders httpHeadersToPass = new HttpHeaders();
            // httpHeadersToPass.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            httpHeadersToPass.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
           // HttpEntity<PatientModel> requestEntity = new HttpEntity<>(patientModel, httpHeadersToPass);
            HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(formData, httpHeadersToPass);

            ResponseEntity<String> result = restTemplate.exchange(uribuilder.build().encode().toUri(), HttpMethod.POST,requestEntity,String.class);


        } catch (Exception e){
            System.out.println(e);
        }
    }

}
