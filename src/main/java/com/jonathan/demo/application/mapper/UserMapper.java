package com.jonathan.demo.application.mapper;

import com.jonathan.demo.application.dto.user.RequestUserDto;
import com.jonathan.demo.application.dto.user.ResponseUserDto;
import com.jonathan.demo.domain.entity.User;

public class UserMapper {
    public static ResponseUserDto toDto(User user){
        return new ResponseUserDto(
                user.getId(),
                user.getName()
        );
    }

    public static  User toDomain(ResponseUserDto user){
        return new User(
                user.getId(),
                user.getName()
        );
    }

    public static User toDomain(RequestUserDto requestUserDto) {
        return new User(
                0L,
                requestUserDto.getName()
        );
    }
}
