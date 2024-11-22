package com.db.hackathon.user_tracker.adapters.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PATIENT_CARER_MAPPING")
@Entity
@IdClass(value = PCCompositeKey.class)
public class PatientCarerMapping {
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Id
    @Column(name = "CARER_ID")
    private String carerId;
}
