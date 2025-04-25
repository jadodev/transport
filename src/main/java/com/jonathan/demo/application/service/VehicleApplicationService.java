package com.jonathan.demo.application.service;

import ch.hsr.geohash.GeoHash;
import com.jonathan.demo.application.dto.vehicle.RequestVehicleDto;
import com.jonathan.demo.application.dto.vehicle.ResponseVehicleDto;
import com.jonathan.demo.application.mapper.VehicleMapper;
import com.jonathan.demo.application.service.redis.GeolocationRedisService;
import com.jonathan.demo.domain.Status.VehicleStatus;
import com.jonathan.demo.domain.entity.Vehicle;
import com.jonathan.demo.domain.service.VehicleDomainService;
import com.jonathan.demo.util.DistanceCalculator;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class VehicleApplicationService {
    private final VehicleDomainService vehicleService;
    private final GeolocationRedisService geolocationService;

    public VehicleApplicationService(VehicleDomainService vehicleService, GeolocationRedisService geolocationService) {
        this.vehicleService = vehicleService;
        this.geolocationService =  geolocationService;
    }

    double lat = 4.60 + Math.random() * 0.1;
    double lon = -74.07 + Math.random() * 0.1;

    public ResponseVehicleDto create(RequestVehicleDto requestVehicleDto){
        Vehicle vehicle = VehicleMapper.toDomain(requestVehicleDto);
        Vehicle save = this.vehicleService.createVehicle(vehicle);
        geolocationService.addVehicleLocation(null, save.getId().toString(),lon, lat);
        return  VehicleMapper.toDto(save);
    }

    public List<ResponseVehicleDto> getAll(){
        List<Vehicle> vehicles = this.vehicleService.GetAll();
        return vehicles.stream()
                .map(VehicleMapper::toDto)
                .collect(Collectors.toList());
    }

    public ResponseVehicleDto getById(long id){
        Optional<Vehicle> vehicle = this.vehicleService.GetById(id);
        return vehicle.map(VehicleMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Vehiculo no encontrado"));
    }

    public CompletableFuture<ResponseVehicleDto> findVehicleNear(double lat, double lon, double radiusKm){
        return CompletableFuture.supplyAsync(()->{
            List<String> nearByIds = geolocationService.searchNearby(lat, lon, radiusKm);

            for (String id: nearByIds){
                Optional<Vehicle> vehicleOpt = vehicleService.GetById(Long.parseLong(id));
                if (vehicleOpt.isPresent()){
                    Vehicle vehicle = vehicleOpt.get();
                    if (vehicle.getStatus() == VehicleStatus.AVAILABLE){
                        Point vehiclePosition = geolocationService.getVehiclePosition(vehicle.getId().toString());
                        System.out.println("se ejecuta");
                        if (vehiclePosition != null){
                            double distance = DistanceCalculator.haversine(
                                    lat, lon,
                                    vehiclePosition.getY(), vehiclePosition.getX()
                            );

                            System.out.println("User: (" + lat + ", " + lon + ")");
                            System.out.println("Vehicle: (" + vehiclePosition.getY() + ", " + vehiclePosition.getX() + ")");

                            ResponseVehicleDto dto = VehicleMapper.toDto(vehicle);
                            dto.setDistance(distance);
                            return dto;
                        }
                        return  VehicleMapper.toDto(vehicle);
                    }
                }
            }
            throw new RuntimeException("No hay vehículos disponibles cerca.");
        });
    }
}
