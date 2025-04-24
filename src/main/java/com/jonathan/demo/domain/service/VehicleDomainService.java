package com.jonathan.demo.domain.service;

import com.jonathan.demo.domain.entity.Vehicle;
import com.jonathan.demo.domain.port.in.VehicleServicePortIn;
import com.jonathan.demo.domain.port.out.VehicleRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleDomainService implements VehicleServicePortIn {
    private VehicleRepositoryPort vehicleRepository;

    public VehicleDomainService( VehicleRepositoryPort vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        Vehicle newVehicle = this.vehicleRepository.save(vehicle);
        return newVehicle;
    }

    @Override
    public List<Vehicle> GetAll() {
        return this.vehicleRepository.getAll();
    }

    @Override
    public Optional<Vehicle> GetById(long id) {
        Optional<Vehicle> vehicle = this.vehicleRepository.getById(id);
        return vehicle;
    }
}
