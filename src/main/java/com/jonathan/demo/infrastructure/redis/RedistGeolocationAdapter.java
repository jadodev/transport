package com.jonathan.demo.infrastructure.redis;

import ch.hsr.geohash.GeoHash;
import com.jonathan.demo.domain.port.in.GeolocationServicePort;
import org.springframework.data.geo.*;
import org.springframework.data.redis.connection.RedisGeoCommands;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RedistGeolocationAdapter implements GeolocationServicePort {

    private final RedisTemplate<String,String> redisTemplate;

    public RedistGeolocationAdapter(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void addVehicleLocation(String vehicleId, double lon, double lat) {
        String geoHash6 = GeoHash.withCharacterPrecision(lat, lon, 6).toBase32();
        String redisKey = "geo:vehicle:" + geoHash6;

        redisTemplate.opsForGeo().add(redisKey, new Point(lon, lat), vehicleId);
    }

    @Override
    public List<String> findNearby(double lon, double lat, double radiusKm) {
        String geoHash6 = GeoHash.withCharacterPrecision(lat, lon, 6).toBase32();
        String redisKey = "geo:vehicle:" + geoHash6;

        GeoResults<RedisGeoCommands.GeoLocation<String>> results =
                redisTemplate.opsForGeo().radius(redisKey, new Circle(new Point(lon, lat), new Distance(radiusKm, Metrics.KILOMETERS)));

        return results.getContent().stream()
                .map(GeoResult::getContent)
                .map(RedisGeoCommands.GeoLocation::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Point getVehiclePosition(String vehicleId){
        Set<String> keys = redisTemplate.keys("geo:vehicles:*");

        if (keys == null) return null;

        for (String key : keys) {
            List<Point> pos = redisTemplate.opsForGeo().position(key, vehicleId);
            if (pos != null && !pos.isEmpty() && pos.get(0) != null) {
                return pos.get(0);
            }
        }
        return null;
    }
}
