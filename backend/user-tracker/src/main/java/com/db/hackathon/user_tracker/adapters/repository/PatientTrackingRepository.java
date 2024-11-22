package com.db.hackathon.user_tracker.adapters.repository;

import com.db.hackathon.user_tracker.adapters.model.PatientTrackingInfo;
import com.db.hackathon.user_tracker.adapters.models.RouteStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientTrackingRepository extends JpaRepository<PatientTrackingInfo, String>{

	@Query(value = "select * from patient_tracking where patient_id=? order by log_time desc limit 1", nativeQuery = true)
	public PatientTrackingInfo findPatientTrackingInfoOrderByLogTimeDesc(String id);

	@Query(value = "select max(route_id) from patient_tracking", nativeQuery = true)
	public String findMaxCurrentRouteId();

	@Query(value = "select latitude,longitude from patient_tracking where patient_id=?1 and route_id=(select MAX(route_id) from patient_tracking where patient_id=?1)", nativeQuery = true)
	public List<Object[]> getRoutesStepInfo(String userId);
}
