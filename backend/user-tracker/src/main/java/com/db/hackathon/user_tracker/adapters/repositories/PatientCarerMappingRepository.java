package com.db.hackathon.user_tracker.adapters.repositories;

import com.db.hackathon.user_tracker.adapters.models.PCCompositeKey;
import com.db.hackathon.user_tracker.adapters.models.PatientCarerMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientCarerMappingRepository extends JpaRepository<PatientCarerMapping, PCCompositeKey> {

    public List<PatientCarerMapping> findByCarerId(String carerId);
    public List<PatientCarerMapping> findByPatientId(String patientId);
}
