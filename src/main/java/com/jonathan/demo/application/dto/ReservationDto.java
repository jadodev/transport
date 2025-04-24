package com.jonathan.demo.application.dto;

public class ReservationDto {
    private long id;
    private long userId;
    private long vehicleId;
    private String origin;
    private String destination;
    private boolean reservated;

    public ReservationDto() {}

    public ReservationDto(long id, long userId, long vehicleId, String origin, String destination) {
        this.id = id;
        this.userId = userId;
        this.origin = origin;
        this.destination = destination;
        this.vehicleId = vehicleId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public boolean isReservated() {
        return reservated;
    }

    public void setReservated(boolean reservated) {
        this.reservated = reservated;
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
}