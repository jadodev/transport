package com.jonathan.demo.infrastructure.repository;

import com.jonathan.demo.domain.entity.User;
import com.jonathan.demo.domain.port.out.UserRepositoryPort;
import com.jonathan.demo.infrastructure.entity.UserEntity;
import com.jonathan.demo.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository implements UserRepositoryPort {
    private final UserJpaRepository jpaRepository;

    public UserRepository(UserJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public User save(User user) {
        UserEntity u = UserMapper.toEntity(user);
        UserEntity save = jpaRepository.save(u);
        return UserMapper.toDomain(save);
    }

    @Override
    public Optional<User> getById(long id) {
         return jpaRepository.findById(id).map(UserMapper::toDomain);
    }
}
