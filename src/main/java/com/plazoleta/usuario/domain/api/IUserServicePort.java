package com.plazoleta.usuario.domain.api;
import com.plazoleta.usuario.domain.model.User;
import com.plazoleta.usuario.domain.spi.IUserPersistencePort;

public interface IUserServicePort {
        User saveUserAdmin(User user);
}
