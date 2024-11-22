package com.db.reconciliation.hack_ep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsEntityRepository extends JpaRepository<EventsEntity, String> {

    public List<EventsEntity> findByEventTypeInIgnoreCaseAndEventStatusIgnoreCase(List<String> eventType, String eventStatus);

}
