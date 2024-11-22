package com.db.hackathon.user_tracker.port.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientInfo {
    private String userId;
    private String name;
    private String role;
    private String info;
    private float homeLatitude;
    private float homeLongitude;
    private String dangerZones;
    private String reminders;
    private List<Carer> carers;
}
