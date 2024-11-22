package com.db.hackathon.user_tracker.core;

public interface SosCreateEventAdapterI {

    void createSOSEventAdapter(String userID);

    void createInactivityEventAdapter(String userID);

    void createDeviatedEventAdapter(String userID);
}
