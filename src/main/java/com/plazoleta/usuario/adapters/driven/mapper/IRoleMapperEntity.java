package com.plazoleta.usuario.adapters.driven.mapper;

import com.plazoleta.usuario.adapters.driven.entity.RoleEntity;
import com.plazoleta.usuario.domain.model.Role;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = org.mapstruct.ReportingPolicy.IGNORE,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)


public interface IRoleMapperEntity {
    Role RoleEntityToRole(RoleEntity roleEntity);
}



