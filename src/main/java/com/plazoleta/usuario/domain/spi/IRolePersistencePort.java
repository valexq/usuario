package com.plazoleta.usuario.domain.spi;

import com.plazoleta.usuario.adapters.driven.entity.RoleEntity;
import com.plazoleta.usuario.domain.model.Role;

public interface IRolePersistencePort {
    Role findByName(String name);
}
