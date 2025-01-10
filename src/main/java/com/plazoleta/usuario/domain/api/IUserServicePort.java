package com.plazoleta.usuario.domain.api;
import com.plazoleta.usuario.domain.model.User;

public interface IUserServicePort {
        User saveUser(User user);
}
