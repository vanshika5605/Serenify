package com.db.hackathon.user_tracker.adapters.repositories;

import com.db.hackathon.user_tracker.adapters.models.CarerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarerProfileRepository extends JpaRepository<CarerProfile, String> {
    public CarerProfile findByCarerId(String carerId);
}
