package com.jonathan.demo.infrastructure.mapper;

import com.jonathan.demo.domain.entity.User;
import com.jonathan.demo.infrastructure.entity.UserEntity;

public class UserMapper {
    public static User toDomain(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getName()
        );
    }

    public static UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        if (user.getId() != 0) {
            entity.setId(user.getId());
        }
        entity.setName(user.getName());
        return entity;
    }
}
