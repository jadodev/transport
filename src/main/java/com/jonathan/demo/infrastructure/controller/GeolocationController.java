//package com.jonathan.demo.infrastructure.controller;
//
//import com.jonathan.demo.application.service.VehicleApplicationService;
//import com.jonathan.demo.application.service.redis.GeolocationRedisService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/geo")
//public class GeolocationController {
//    private final GeolocationRedisService geoService;
//    private final VehicleApplicationService vehicleService;
//
//    public GeolocationController(GeolocationRedisService geoService, VehicleApplicationService vehicleService) {
//        this.geoService = geoService;
//        this.vehicleService = vehicleService;
//    }
//
////    @GetMapping("/nearby")
////    public ResponseEntity<List<String>> nearby(@RequestParam double lon, @RequestParam double lat, @RequestParam double radius) {
////        return ResponseEntity.ok(vehicleService.findVehicleNear(lon, lat, radius));
////    }
//}
