package com.db.hackathon.user_tracker.port.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReminder {
    private String type;
    private String time;
}
