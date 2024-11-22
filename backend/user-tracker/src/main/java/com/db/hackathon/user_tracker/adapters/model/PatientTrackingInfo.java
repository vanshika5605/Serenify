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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PATIENT_TRACKING")
public class PatientTrackingInfo {


	@Column(name = "PATIENT_ID")
    private String patientId;

	@Column(name = "LOG_TIME")
    private LocalDateTime logTime;

	@Column(name = "LATITUDE")
    private float latitude;

	@Column(name = "LONGITUDE")
	private float longitude;

	@Id
	@Column(name = "ROUTE_ID")
	private String routeId;

}
