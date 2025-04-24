package com.jonathan.demo.domain.port.out;

import com.jonathan.demo.domain.entity.User;

import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> getById(long id);
}
