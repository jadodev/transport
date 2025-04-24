package com.jonathan.demo.infrastructure.repository;

import com.jonathan.demo.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
