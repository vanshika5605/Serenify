package com.db.reconciliation.hack_ep;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "EVENTS")
@Data
@IdClass(EECompositeKey.class)
public class EventsEntity {

    @Column(name = "EVENT_ID", nullable = true)
    private long eventId;

    @Id
    @Column(name = "EVENT_TYPE")
    private String eventType;

    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    @Id
    @Column(name = "EVENT_TIME")
    private LocalDateTime eventTime;

    @Column(name = "EVENT_STATUS")
    private String eventStatus;

}
