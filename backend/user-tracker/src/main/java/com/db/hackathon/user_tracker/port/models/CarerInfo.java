package com.db.hackathon.user_tracker.port.models;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarerInfo {
    private String userId;
    private String name;
    private String role;
    private String info;
    private String carerType;
    private String alerts;
    private String reminders;
    private Boolean information;
    private List<Patient> patients;
}
