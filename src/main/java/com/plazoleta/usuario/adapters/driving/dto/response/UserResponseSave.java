package com.plazoleta.usuario.adapters.driving.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DATOS DE SALIDA (que se le van a mostrar al usuario)
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserResponseSave {
    private Long id;   //Identificador
    private String firstName;
    private String lastName;
    private String email;
}
