package com.plazoleta.usuario.adapters.driving.mapper;
// Interfaz que convierte de Dtos a modelos y de modelos a Dtos

import com.plazoleta.usuario.adapters.driving.dto.request.UserRequest;
import com.plazoleta.usuario.adapters.driving.dto.response.UserResponseSave;
import com.plazoleta.usuario.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = org.mapstruct.ReportingPolicy.IGNORE,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
//El mapper hace los datos excluyentes los unos del otro siendo ignorados

public interface IUserMapperDto {
    @Mapping(target = "id", ignore = true)
    User userRequestToUser(UserRequest userRequest);
    UserResponseSave userToUserResponseSave(User user);
}
