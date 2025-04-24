package com.jonathan.demo.application.mapper;

import com.jonathan.demo.application.dto.ReservationDto;
import com.jonathan.demo.domain.entity.Reservation;

public class ReservationMapper {
    public static ReservationDto toDto(Reservation reservation){
        return new ReservationDto(
                reservation.getId(),
                reservation.getId_user(),
                reservation.getId_vehicle(),
                reservation.getOrigin(),
                reservation.getDestination()
        );
    }

    public static Reservation toDomain(ReservationDto reservation){
        return new Reservation(
                reservation.getId(),
                reservation.getUserId(),
                reservation.getVehicleId(),
                reservation.getOrigin(),
                reservation.getDestination()
        );
    }
}
