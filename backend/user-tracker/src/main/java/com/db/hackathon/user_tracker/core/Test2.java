package com.db.hackathon.user_tracker.core;

import static java.lang.Math.*;

class Test2 {

    private static final double EARTH_RADIUS = 6371000;

    public static double calculateDistance(double lat1,double lon1,double lat2,double lon2){
        double latRad1 = toRadians(lat1);
        double lonRad1 = toRadians(lon1);
        double latRad2 = toRadians(lat2);
        double lonRad2 = toRadians(lon2);

        double deltaLat = latRad2 - latRad1;
        double deltaLon = lonRad2 - lonRad1;

        double a = sin(deltaLat / 2) * sin(deltaLat / 2) + cos(latRad1) * cos(latRad2) * sin(deltaLon / 2) * sin(deltaLon / 2);
        double c = 2 * atan2(sqrt(a),sqrt(1-a));

        double distance = EARTH_RADIUS * c;

        return distance;
    }

/*    public static void main(String[] args) {

        double lat1 = 47.5;
        double lon1 = -87;
        double lat2 = 48;
        double lon2 = -86.5;

        double distance = calculateDistance(lat1,lon1,lat2,lon2);

        long distanceInt = Math.round(distance);

        System.out.println("Distance Between two points is: "+distanceInt+" meters");

    }*/
}