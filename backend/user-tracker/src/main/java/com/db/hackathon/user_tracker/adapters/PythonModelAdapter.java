package com.db.hackathon.user_tracker.adapters;

import com.db.hackathon.user_tracker.adapters.models.CheckLocationModel;
import com.db.hackathon.user_tracker.adapters.models.FeedbackModel;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Service
public class PythonModelAdapter {

    public Boolean checkDeviation(CheckLocationModel location){
        try{
            UriComponentsBuilder uribuilder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/check_deviation");
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders httpHeadersToPass = new HttpHeaders();
            httpHeadersToPass.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            httpHeadersToPass.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<CheckLocationModel> requestEntity = new HttpEntity<>(location, httpHeadersToPass);

            ResponseEntity<Boolean> result = restTemplate.exchange(uribuilder.build().encode().toUri(), HttpMethod.POST,requestEntity,Boolean.class);
            return result.getBody();
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public Boolean addFeedback(FeedbackModel feedbackModel){
        try{
            UriComponentsBuilder uribuilder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/add_route_feedback");
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders httpHeadersToPass = new HttpHeaders();
            httpHeadersToPass.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            httpHeadersToPass.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<FeedbackModel> requestEntity = new HttpEntity<>(feedbackModel, httpHeadersToPass);

            ResponseEntity<Boolean> result = restTemplate.exchange(uribuilder.build().encode().toUri(), HttpMethod.POST,requestEntity,Boolean.class);
            return result.getBody();
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

}
