package com.db.hackathon.user_tracker.adapters.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
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
@Entity
@Table(name = "PATIENT_PROFILE")
public class PatientProfile {
    @Id
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Column(name = "HOME_LATITUDE")
    private float homeLatitude;
    @Column(name = "HOME_LONGITUDE")
    private float homeLongitude;
    @Column(name = "DANGER_ZONES")
    private String dangerZones;
    @Column(name = "REMINDERS", columnDefinition = "json")
    private String reminders;

    @Column(name = "CURRENT_ROUTE_ID")
    private String currentRouteId;

    public JsonElement getReminders() {
        return JsonParser.parseString(reminders);
    }

    public void setReminders(JsonElement reminders) {
        this.reminders = new Gson().toJson(reminders);
    }
}
