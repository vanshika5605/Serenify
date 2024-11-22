package com.db.hackathon.user_tracker.adapters.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CARER_PROFILE")
@Entity
public class CarerProfile {
    @Id
    @Column(name = "CARER_ID")
    private String carerId;
    @Column(name = "CARER_TYPE")
    private String carerType;
    @Column(name = "ALERTS")
    private String alerts;
    @Column(name = "REMINDER")
    private String reminders;
    @Column(name = "INFORMATION")
    private Boolean information;
}
