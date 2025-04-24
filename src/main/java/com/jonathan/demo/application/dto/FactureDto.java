package com.jonathan.demo.application.dto;

import com.jonathan.demo.domain.entity.User;
import com.jonathan.demo.domain.entity.Vehicle;

import java.time.LocalDateTime;

public class FactureDto {
    private long id;
    private User userId;
    private Vehicle vehicleId;
    private double cost;
    private double distance;
    private double estimatedTime;
    private String status;
    private LocalDateTime requestedAt;
    private LocalDateTime confirmedAt;
    private LocalDateTime completedAt;

    public FactureDto() {}

    public FactureDto(
            long id,
            User userId,
            Vehicle vehicleId,
            double cost,
            double distance,
            double estimatedTime,
            String status,
            LocalDateTime requestedAt,
            LocalDateTime confirmedAt,
            LocalDateTime completedAt
    ) {
        this.id = id;
        this.userId = userId;
        this.vehicleId = vehicleId;
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

    public void setId(long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Vehicle getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Vehicle vehicleId) {
        this.vehicleId = vehicleId;
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