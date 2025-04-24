//package com.jonathan.demo.infrastructure.controller;
//
//import com.jonathan.demo.application.service.FactureApplicationService;
//import com.jonathan.demo.application.service.ReservationApplicationService;
//import com.jonathan.demo.domain.entity.Reservation;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin(origins = "*")
//@RequestMapping("/reservation")
//public class ReservationController {
//    private final ReservationApplicationService reservationService;
//    private final FactureApplicationService factureService;
//
//    public ReservationController(
//            ReservationApplicationService reservationService,
//            FactureApplicationService factureService
//    ) {
//        this.reservationService = reservationService;
//        this.factureService = factureService;
//    }
//
//    @PostMapping("/new_reservation")
//    public void create(@RequestBody Reservation reservation){
//        reservationService.makeReservation(reservation);
//        factureService.create();
//    }
//}
