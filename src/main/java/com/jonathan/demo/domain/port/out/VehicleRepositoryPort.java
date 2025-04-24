package com.jonathan.demo.domain.port.out;

import com.jonathan.demo.domain.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleRepositoryPort {
    Vehicle save (Vehicle vehicle);
    List<Vehicle> getAll();
    Optional<Vehicle> getById(long id);
    void update(Vehicle vehicle);
}
