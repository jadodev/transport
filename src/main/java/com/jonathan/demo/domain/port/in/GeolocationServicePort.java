package com.jonathan.demo.domain.port.in;

import org.springframework.data.geo.Point;

import java.util.List;

public interface GeolocationServicePort {
    void addVehicleLocation(String vehicleId, double lon, double lat);
    List<String> findNearby(double lon, double lat, double radiusKm);
    Point getVehiclePosition(String vehicleId);
}
