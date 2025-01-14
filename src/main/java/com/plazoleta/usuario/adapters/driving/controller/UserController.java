package com.plazoleta.usuario.adapters.driving.controller;

import com.plazoleta.usuario.adapters.driving.dto.request.UserRequest;
import com.plazoleta.usuario.adapters.driving.dto.response.UserResponseSave;
import com.plazoleta.usuario.adapters.driving.mapper.IUserMapperDto;
import com.plazoleta.usuario.domain.api.IUserServicePort;
import com.plazoleta.usuario.domain.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserServicePort userServicePort;
    private final IUserMapperDto userMapperDto;
    // El responseEntity hace retornar una dirección http
    @PostMapping("/")

    public ResponseEntity<UserResponseSave> saveUserAdmin(@RequestBody
                                                              @Valid UserRequest userRequest){
        User user = userServicePort.saveUserAdmin(userMapperDto.userRequestToUser(userRequest));
        return ResponseEntity.ok(userMapperDto.userToUserResponseSave(user));
    }
}
