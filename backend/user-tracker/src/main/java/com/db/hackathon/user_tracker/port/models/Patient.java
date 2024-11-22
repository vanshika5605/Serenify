package com.db.hackathon.user_tracker.port.models;

import com.db.hackathon.user_tracker.core.models.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private String patientId;
    private String patientName;
    private String dangerZones;
    private String reminders;
}
