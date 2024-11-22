package com.db.hackathon.user_tracker.port.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientData {

    private String patientId;
    private LocalDateTime logTime;
    private float latitude;
	private float longitude;


}
