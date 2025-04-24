package com.jonathan.demo.application.mapper;

import com.jonathan.demo.application.dto.vehicle.RequestVehicleDto;
import com.jonathan.demo.application.dto.vehicle.ResponseVehicleDto;
import com.jonathan.demo.domain.entity.Vehicle;

public class VehicleMapper {
    public static ResponseVehicleDto toDto(Vehicle vehicle){
        return new ResponseVehicleDto(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getStatus());

    }

    public static Vehicle toDomain(RequestVehicleDto vehicle) {
        return new Vehicle(
                null,
                vehicle.getBrand(),
                vehicle.getStatus()
        );
    }

}
