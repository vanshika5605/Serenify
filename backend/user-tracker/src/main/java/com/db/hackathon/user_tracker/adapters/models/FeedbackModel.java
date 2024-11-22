package com.db.hackathon.user_tracker.adapters.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackModel {
    String user_id;
    List<RouteStep> route_steps;
}
