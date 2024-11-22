package com.db.hackathon.user_tracker.adapters.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name="EVENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Events {

    @Id
    @Column(name="EVENT_ID")
    private int eventId;

    @Column(name="EVENT_TYPE")
    private String eventType;

    @Column(name="PATIENT_ID")
    private String patientId;

    @Column(name="EVENT_TIME")
    private LocalDateTime eventTime;

    @Column(name="EVENT_STATUS")
    private String status;
}
