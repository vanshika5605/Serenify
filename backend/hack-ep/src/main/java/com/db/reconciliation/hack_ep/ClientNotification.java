package com.db.reconciliation.hack_ep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientNotification {

    private String requestId;
    private String eventType;
    private String eventTime;
    private String patientId;
}