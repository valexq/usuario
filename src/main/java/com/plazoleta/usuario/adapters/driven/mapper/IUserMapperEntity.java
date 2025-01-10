package com.plazoleta.usuario.adapters.driven.mapper;

import com.plazoleta.usuario.adapters.driven.entity.UserEntity;
import com.plazoleta.usuario.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = org.mapstruct.ReportingPolicy.IGNORE,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)

public interface IUserMapperEntity {
    UserEntity userToUserEntity(User user);
    User userEntityToUser(UserEntity userEntity);
}
