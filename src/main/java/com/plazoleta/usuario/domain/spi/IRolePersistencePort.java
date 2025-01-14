package com.plazoleta.usuario.domain.spi;

import com.plazoleta.usuario.domain.model.Role;

public class IRolePersistencePort {
    Role findByName(Long name);

}
