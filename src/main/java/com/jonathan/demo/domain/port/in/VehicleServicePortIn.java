package com.jonathan.demo.domain.port.in;

import com.jonathan.demo.domain.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleServicePortIn {
    Vehicle createVehicle (Vehicle vehicle);
    List<Vehicle> GetAll();
    Optional<Vehicle> GetById(long id);
}
