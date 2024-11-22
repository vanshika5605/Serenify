package com.db.hackathon.user_tracker.port.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carer {
    private String carerId;
    private String carerName;
    private String info;
}
