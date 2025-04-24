package com.jonathan.demo.infrastructure.mapper;

import com.jonathan.demo.domain.entity.Vehicle;
import com.jonathan.demo.infrastructure.entity.VehicleEntity;

public class VehicleMapper {
    public static Vehicle toDomain(VehicleEntity entity) {

        return new Vehicle(
                entity.getId(),
                entity.getBrand(),
                entity.getStatus()
        );
    }

    public static VehicleEntity toEntity(Vehicle domain) {
        return new VehicleEntity(
                domain.getId(),
                domain.getBrand(),
                domain.getStatus()
        );
    }

}
