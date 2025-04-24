package com.jonathan.demo.application.dto.vehicle;

import com.jonathan.demo.domain.Status.VehicleStatus;

public class RequestVehicleDto {
    private String brand;
    private VehicleStatus status;

    public RequestVehicleDto() {}

    public RequestVehicleDto(String brand, VehicleStatus status) {
        this.brand = brand;
        this.status = status;
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
