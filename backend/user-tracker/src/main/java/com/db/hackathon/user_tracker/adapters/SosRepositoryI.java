package com.db.hackathon.user_tracker.adapters;

import com.db.hackathon.user_tracker.adapters.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SosRepositoryI extends JpaRepository<Events,Integer> {
}
