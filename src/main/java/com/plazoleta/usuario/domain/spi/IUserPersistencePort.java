package com.plazoleta.usuario.domain.spi;

import com.plazoleta.usuario.adapters.driven.repository.UserRepository;
import com.plazoleta.usuario.domain.model.User;
import lombok.RequiredArgsConstructor;
//Capa de persistencia ayuda a salir del dominio para usar librerías que no sean de java



public interface IUserPersistencePort {
    User saveUser(User user);
    Boolean existsUserByEmail(String email);
}
