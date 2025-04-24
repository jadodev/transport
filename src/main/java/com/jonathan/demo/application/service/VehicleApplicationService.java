package com.jonathan.demo.application.service;

import com.jonathan.demo.application.dto.vehicle.RequestVehicleDto;
import com.jonathan.demo.application.dto.vehicle.ResponseVehicleDto;
import com.jonathan.demo.application.mapper.VehicleMapper;
import com.jonathan.demo.domain.entity.Vehicle;
import com.jonathan.demo.domain.service.VehicleDomainService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleApplicationService {
    private VehicleDomainService vehicleService;

    public VehicleApplicationService(VehicleDomainService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public ResponseVehicleDto create(RequestVehicleDto requestVehicleDto){
        Vehicle vehicle = VehicleMapper.toDomain(requestVehicleDto);
        Vehicle save = this.vehicleService.createVehicle(vehicle);
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
}
