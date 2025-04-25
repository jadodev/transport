package com.jonathan.demo.infrastructure.controller;

import com.jonathan.demo.application.dto.vehicle.RequestVehicleDto;
import com.jonathan.demo.application.dto.vehicle.ResponseVehicleDto;
import com.jonathan.demo.application.service.VehicleApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleApplicationService vehicleApplication;

    public VehicleController(VehicleApplicationService vehicleApplication) {
        this.vehicleApplication = vehicleApplication;
    }

    @PostMapping("/new_vehicle")
    public ResponseEntity<ResponseVehicleDto> create(@RequestBody RequestVehicleDto requestVehicleDto){
        return ResponseEntity.ok(vehicleApplication.create(requestVehicleDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseVehicleDto> getById(@PathVariable("id") long id){
        ResponseVehicleDto vehicle = vehicleApplication.getById(id);
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseVehicleDto>> getAllVehicles(){
        return  ResponseEntity.ok(vehicleApplication.getAll());
    }

    @GetMapping("/nearby")
    public CompletableFuture<ResponseEntity<ResponseVehicleDto>> nearby(@RequestParam double lon, @RequestParam double lat, @RequestParam double radius) {
        return vehicleApplication.findVehicleNear(lon, lat, radius)
                .thenApply(ResponseEntity::ok);
    }
}
