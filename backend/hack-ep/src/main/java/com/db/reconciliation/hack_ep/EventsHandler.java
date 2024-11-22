package com.db.reconciliation.hack_ep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsHandler {

    @Autowired
    private EventsEntityRepository eventsEntityRepository;

    public List<EventsEntity> getEventsForType(List<String> types) {
        List<EventsEntity> entities = eventsEntityRepository.findByEventTypeInIgnoreCaseAndEventStatusIgnoreCase(types, "NEW");

        entities.forEach(entity-> {
            System.out.println(entity);
            entity.setEventStatus("NOTIFIED");
        });
        eventsEntityRepository.saveAll(entities);
        return entities;
    }


}
