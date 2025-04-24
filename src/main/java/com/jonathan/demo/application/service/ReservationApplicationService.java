//package com.jonathan.demo.application.service;
//
//import com.jonathan.demo.application.dto.FactureDto;
//import com.jonathan.demo.application.dto.ReservationDto;
//import com.jonathan.demo.application.mapper.FactureMapper;
//import com.jonathan.demo.domain.Status.VehicleStatus;
//import com.jonathan.demo.domain.entity.Vehicle;
//import com.jonathan.demo.application.port.in.ReservationServicePortIn;
//import com.jonathan.demo.domain.port.out.VehicleRepositoryPort;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class ReservationApplicationService implements ReservationServicePortIn{
//    private final VehicleRepositoryPort vehicleRepository;
//
//    public ReservationApplicationService(VehicleRepositoryPort vehicleRepository) {
//        this.vehicleRepository = vehicleRepository;
//    }
//
//    @Override
//    public FactureDto makeReservation(ReservationDto reservationDto) {
//        Optional<Vehicle> v = vehicleRepository.getById(reservationDto.getVehicleId());
//        Vehicle vehicle = v.get();
//
//        if (vehicle.getStatus() != VehicleStatus.AVAILABLE){
//            throw new RuntimeException("Vehiculo no disponible");
//        }
//
//        vehicle.setStatus(VehicleStatus.RESERVED);
//        vehicleRepository.update(vehicle);
//        reservationDto.setReservated(true);
//
//        FactureDto factureDto = FactureMapper.
//
//    }
//}
