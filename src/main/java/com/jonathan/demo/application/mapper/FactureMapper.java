//package com.jonathan.demo.application.mapper;
//
//import com.jonathan.demo.application.dto.FactureDto;
//import com.jonathan.demo.application.dto.ReservationDto;
//import com.jonathan.demo.domain.entity.Facture;
//
//public class FactureMapper {
//    public static FactureDto toDto(Facture facture){
//        return new FactureDto(
//                facture.getId(),
//                facture.getUserId(),
//                facture.getVehicle(),
//                facture.getCost(),
//                facture.getDistance(),
//                facture.getEstimatedTime(),
//                facture.getStatus(),
//                facture.getRequestedAt(),
//                facture.getConfirmedAt(),
//                facture.getCompletedAt()
//        );
//    }
//
//    public  static  Facture toDomain(FactureDto factureDto){
//        return new Facture(
//                factureDto.getId(),
//                factureDto.getUserId(),
//                factureDto.getVehicleId(),
//                factureDto.getCost(),
//                factureDto.getDistance(),
//                factureDto.getEstimatedTime(),
//                factureDto.getStatus(),
//                factureDto.getRequestedAt(),
//                factureDto.getConfirmedAt(),
//                factureDto.getCompletedAt()
//        );
//    }

//    public static FactureDto fromReservation(ReservationDto reservationDto){
//        return  new FactureDto(
//                reservationDto.getId(),
//                reservationDto.getUserId(),
//                reservationDto.getVehicleId(),
//                reservationDto.getOrigin(),
//                reservationDto.getDestination(),
//
//        );
//    }
//}
