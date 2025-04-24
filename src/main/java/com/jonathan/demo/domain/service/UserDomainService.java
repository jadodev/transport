package com.jonathan.demo.domain.service;

import com.jonathan.demo.domain.entity.User;
import com.jonathan.demo.domain.port.in.UserServicePortIn;
import com.jonathan.demo.domain.port.out.UserRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDomainService implements UserServicePortIn {
    private UserRepositoryPort userRepositoryPort;

    public UserDomainService( UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User create(User user) {
        User newUser = this.userRepositoryPort.save(user);
        return  newUser;
    }

    @Override
    public Optional<User> getById(long id) {
        Optional<User> user = this.userRepositoryPort.getById(id);
        return user;
    }
}
