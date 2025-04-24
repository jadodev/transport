package com.jonathan.demo.domain.entity;

import com.jonathan.demo.domain.Status.VehicleStatus;

public class Vehicle {
    private Long id;
    private String brand;
    private VehicleStatus status;

    public Vehicle(Long id, String brand, VehicleStatus status) {
        this.id = id;
        this.brand = brand;
        this.status = VehicleStatus.AVAILABLE;
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
