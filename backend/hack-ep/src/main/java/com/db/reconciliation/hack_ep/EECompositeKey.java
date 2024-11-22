package com.db.reconciliation.hack_ep;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EECompositeKey implements Serializable {

    private String eventType;
    private String patientId;
    private LocalDateTime eventTime;

}
