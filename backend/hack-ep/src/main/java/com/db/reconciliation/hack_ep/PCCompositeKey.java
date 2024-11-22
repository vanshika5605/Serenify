package com.db.reconciliation.hack_ep;

import lombok.Data;

import java.io.Serializable;

@Data
public class PCCompositeKey implements Serializable {

    private String patientId;
    private String carerId;

}
