package com.plazoleta.usuario.domain.spi;

import com.plazoleta.usuario.domain.model.User;

import java.util.Optional;
//Capa de persistencia ayuda a salir del dominio para usar librerías que no sean de java



public interface IUserPersistencePort {
    User saveUser(User user);
    Optional<User> existsUserByEmail(String email);
}
