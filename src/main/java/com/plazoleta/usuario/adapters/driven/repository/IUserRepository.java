package com.plazoleta.usuario.adapters.driven.repository;

import com.plazoleta.usuario.adapters.driven.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, Long > {
    Optional<UserEntity> findByEmail(String email);
}
