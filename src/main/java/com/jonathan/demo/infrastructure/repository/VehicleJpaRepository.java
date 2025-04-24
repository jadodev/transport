package com.jonathan.demo.infrastructure.repository;

import com.jonathan.demo.infrastructure.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleJpaRepository extends JpaRepository<VehicleEntity, Long> {
}
