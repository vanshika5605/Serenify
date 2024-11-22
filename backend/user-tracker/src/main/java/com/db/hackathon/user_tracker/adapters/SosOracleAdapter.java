package com.db.hackathon.user_tracker.adapters;

import com.db.hackathon.user_tracker.adapters.model.Events;
import com.db.hackathon.user_tracker.core.SosCreateEventAdapterI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class SosOracleAdapter implements SosCreateEventAdapterI {

    @Autowired
    private SosRepositoryI sosRepository;

    @Override
    public void createSOSEventAdapter(String userID) {
        Events events = new Events();
        Random random = new Random();
        events.setEventId(random.nextInt(100-1)+1);
        events.setEventType("SOS");
        events.setStatus("New");
        events.setPatientId(userID);
        events.setEventTime(LocalDateTime.now());
        sosRepository.save(events);
    }
    @Override
    public void createInactivityEventAdapter(String userID) {
        Events events = new Events();
        Random random = new Random();
        events.setEventId(random.nextInt(100-1)+1);
        events.setEventType("INACTIVITY");
        events.setStatus("New");
        events.setPatientId(userID);
        events.setEventTime(LocalDateTime.now());
        sosRepository.save(events);
    }

    @Override
    public void createDeviatedEventAdapter(String userID) {
        Events events = new Events();
        Random random = new Random();
        events.setEventId(random.nextInt(100-1)+1);
        events.setEventType("Deviation");
        events.setStatus("New");
        events.setPatientId(userID);
        events.setEventTime(LocalDateTime.now());
        sosRepository.save(events);
    }


}
