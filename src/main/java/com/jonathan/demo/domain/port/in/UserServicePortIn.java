package com.jonathan.demo.domain.port.in;

import com.jonathan.demo.domain.entity.User;

import java.util.Optional;

public interface UserServicePortIn {
    User create(User user);
    Optional<User> getById(long id);
}
