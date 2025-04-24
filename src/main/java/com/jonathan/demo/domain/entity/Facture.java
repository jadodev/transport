package com.jonathan.demo.domain.entity;

import java.time.LocalDateTime;

public class Facture {
    private long id;
    private User user;
    private Vehicle vehicle;
    private double cost;
    private double distance;
    private double estimatedTime;
    private String status;
    private LocalDateTime requestedAt;
    private LocalDateTime confirmedAt;
    private LocalDateTime completedAt;

    public Facture(
            Long id,
            User user,
            Vehicle vehicle,
            double cost,
            double distance,
            double estimatedTime,
            String status,
            LocalDateTime requestedAt,
            LocalDateTime confirmedAt,
            LocalDateTime completedAt
    ) {
        this.id = id;
        this.user = user;
        this.vehicle = vehicle;
        this.cost = cost;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
        this.status = status;
        this.requestedAt = requestedAt;
        this.confirmedAt = confirmedAt;
        this.completedAt = completedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(LocalDateTime requestedAt) {
        this.requestedAt = requestedAt;
    }

    public LocalDateTime getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(LocalDateTime confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }
}
