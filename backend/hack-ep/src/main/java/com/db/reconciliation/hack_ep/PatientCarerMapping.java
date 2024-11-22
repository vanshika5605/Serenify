package com.db.reconciliation.hack_ep;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "PATIENT_CARER_MAPPING")
@Data
@IdClass(PCCompositeKey.class)
public class PatientCarerMapping {

    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;

    @Id
    @Column(name = "CARER_ID")
    private String carerId;

}
