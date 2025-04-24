package com.jonathan.demo.application.dto.vehicle;

import com.jonathan.demo.domain.Status.VehicleStatus;

public class ResponseVehicleDto {
    private Long id;
    private String brand;
    private VehicleStatus status;

    public ResponseVehicleDto() {}

    public ResponseVehicleDto(Long id, String brand, VehicleStatus status) {
        this.id = id;
        this.brand = brand;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
