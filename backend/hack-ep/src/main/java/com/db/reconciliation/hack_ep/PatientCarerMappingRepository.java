package com.db.reconciliation.hack_ep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientCarerMappingRepository extends JpaRepository<PatientCarerMapping, PCCompositeKey> {

    public List<PatientCarerMapping> findByPatientId(String patientId);

}
