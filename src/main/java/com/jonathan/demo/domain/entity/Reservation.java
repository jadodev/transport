package com.jonathan.demo.domain.entity;

import com.jonathan.demo.domain.Status.VehicleStatus;

public class Reservation {
    private long id;
    private long id_user;
    private long id_vehicle;
    private String origin;
    private String destination;
    private VehicleStatus status;

    public Reservation(long id, long id_user, long id_vehicle, String origin, String destination) {
        this.id = id;
        this.id_user = id_user;
        this.id_vehicle = id_vehicle;
        this.origin = origin;
        this.destination = destination;
        this.status = VehicleStatus.AVAILABLE;
    }

    public long getId() {
        return id;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public long getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(long id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public VehicleStatus isReservated() {
        return status;
    }

    public void setReservated(VehicleStatus status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
