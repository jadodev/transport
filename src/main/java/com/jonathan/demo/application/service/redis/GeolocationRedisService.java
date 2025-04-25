package com.jonathan.demo.application.service.redis;

import com.jonathan.demo.domain.port.in.GeolocationServicePort;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeolocationRedisService {
    private final GeolocationServicePort geolocationService;

    public GeolocationRedisService(GeolocationServicePort geolocationService) {
        this.geolocationService = geolocationService;
    }

    public void addVehicleLocation(String zoneKey, String id, double lon, double lat) {
        geolocationService.addVehicleLocation(id, lon, lat);
    }

    public List<String> searchNearby(double lon, double lat, double radius) {
        return geolocationService.findNearby(lon, lat, radius);
    }

    public Point getVehiclePosition(String vehicleId){
        return geolocationService.getVehiclePosition(vehicleId);
    }
}
