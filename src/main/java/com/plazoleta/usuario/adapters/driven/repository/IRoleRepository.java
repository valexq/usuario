package com.plazoleta.usuario.adapters.driven.repository;

import com.plazoleta.usuario.adapters.driven.entity.RoleEntity;
import com.plazoleta.usuario.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity,Long > {
    Role findByName(String name);
}
