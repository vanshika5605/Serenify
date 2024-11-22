package com.db.hackathon.user_tracker.adapters.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckLocationModel {
    String user_id;
    Float latitude;
    Float longitude;
}
