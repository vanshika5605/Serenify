package com.db.hackathon.user_tracker.adapters.repositories;

import com.db.hackathon.user_tracker.adapters.models.PatientProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientProfileRepository extends JpaRepository<PatientProfile, String> {
    public PatientProfile findByPatientId(String patientId);

    public List<PatientProfile> findByPatientIdIn(List<String> patientIds);

    @Query(value = "update patient_profile set current_route_id=null where patient_id='joey.tribbiani@gmail.com'", nativeQuery = true)
    public String resetPatientCurrentRoute(String id);

    PatientProfile findPatientProfileByPatientId(String patientId);


//    @Query(nativeQuery = true, value = "select a.* from patient_profile a left join user b where a.patient_id in ?1")
//    public List<PatientProfile> findPatients(List<String> patientIds);
}
