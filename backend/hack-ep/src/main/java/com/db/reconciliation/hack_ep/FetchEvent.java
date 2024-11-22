package com.db.reconciliation.hack_ep;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Configuration
public class FetchEvent {

    @Autowired
    private EventsHandler eventsHandler;

//    @Autowired
//    @Qualifier("recOperationStatusChannel")
//    private MessageChannel messageChannel;

    @Autowired
    private RecOperationStatusListener recOperationStatusListener;

    @Autowired
    private PatientCarerMappingRepository patientCarerMappingRepository;

    @Scheduled(fixedDelay = 30000)
    public void scheduleFetchEvent() {

        List<EventsEntity> entities = eventsHandler.getEventsForType(Arrays.asList("SOS", "Deviation", "Inactivity", "Danger_Zone"));

        entities.forEach(entity -> {
            List<PatientCarerMapping> mappings = patientCarerMappingRepository.findByPatientId(entity.getPatientId());
            List<String> mappingCarers = mappings.stream().map(PatientCarerMapping::getCarerId).toList();

            try {
//                System.out.println(entity.getEventId() + " " + entity.getEventTime());
//                new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'")
                if(!"SOS".equals(entity.getEventType()))
                    recOperationStatusListener.handleStatus(new ObjectMapper().writeValueAsString(new ClientNotification(entity.getPatientId(), entity.getEventType(), entity.getEventTime().format(DateTimeFormatter.ISO_DATE_TIME), entity.getPatientId())));
                mappingCarers.forEach(c -> {
                    try {
                        recOperationStatusListener.handleStatus(new ObjectMapper().writeValueAsString(new ClientNotification(c, entity.getEventType(), entity.getEventTime().format(DateTimeFormatter.ISO_DATE_TIME), entity.getPatientId())));
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                });

            }
            catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        });
    }

}
