package com.jonathan.demo.application.service;

import com.jonathan.demo.application.dto.user.RequestUserDto;
import com.jonathan.demo.application.dto.user.ResponseUserDto;
import com.jonathan.demo.application.mapper.UserMapper;
import com.jonathan.demo.domain.entity.User;
import com.jonathan.demo.domain.service.UserDomainService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserApplicationService {
    private UserDomainService userService;

    public UserApplicationService(UserDomainService userService) {
        this.userService = userService;
    }

    public ResponseUserDto create(RequestUserDto requestUserDto){
        User user = UserMapper.toDomain(requestUserDto);
        User saveUser = this.userService.create(user);
        return  UserMapper.toDto(saveUser);
    }

    public ResponseUserDto getUserById(long id){
        Optional<User> user = this.userService.getById(id);
        return user.map(UserMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}
