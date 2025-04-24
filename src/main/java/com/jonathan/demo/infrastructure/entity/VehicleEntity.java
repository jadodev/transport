package com.jonathan.demo.infrastructure.entity;

import com.jonathan.demo.domain.Status.VehicleStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    public VehicleEntity() {}

    public VehicleEntity(Long id, String brand, VehicleStatus status) {
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
