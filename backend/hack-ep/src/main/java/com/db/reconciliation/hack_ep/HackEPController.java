package com.db.reconciliation.hack_ep;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class HackEPController {

    @Autowired
    private EventsHandler eventsHandler;

    @GetMapping("/get-status")
    public ResponseEntity<List<EventsEntity>> getStatus() {
        List<EventsEntity> eventsEntityList = eventsHandler.getEventsForType(Arrays.asList("SOS", "INACTIVITY", "DEVIATION"));
        return ResponseEntity.ok(eventsEntityList);

    }

}
