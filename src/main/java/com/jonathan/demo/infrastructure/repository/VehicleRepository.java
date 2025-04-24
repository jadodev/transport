package com.jonathan.demo.infrastructure.repository;

import com.jonathan.demo.domain.entity.Vehicle;
import com.jonathan.demo.domain.port.out.VehicleRepositoryPort;
import com.jonathan.demo.infrastructure.entity.VehicleEntity;
import com.jonathan.demo.infrastructure.mapper.VehicleMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class VehicleRepository implements VehicleRepositoryPort {
    private  final VehicleJpaRepository jpaRepository;

    public VehicleRepository(VehicleJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


    @Override
    public Vehicle save(Vehicle vehicle) {
        VehicleEntity vehicleEntity = VehicleMapper.toEntity(vehicle);
        VehicleEntity save = jpaRepository.save(vehicleEntity);
        return VehicleMapper.toDomain(save);
    }

    @Override
    public List<Vehicle> getAll() {
        return jpaRepository.findAll().stream()
                .map(VehicleMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Vehicle> getById(long id) {
        return jpaRepository.findById(id).map(VehicleMapper::toDomain);
    }

    @Override
    public void update(Vehicle vehicle) {
        if (!jpaRepository.existsById(vehicle.getId())) {
            throw new IllegalArgumentException("Vehicle with ID " + vehicle.getId() + " does not exist");
        }

        VehicleEntity vehicleEntity = VehicleMapper.toEntity(vehicle);
        jpaRepository.save(vehicleEntity);
    }
}
