package com.plazoleta.usuario.domain.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data // get y set
@AllArgsConstructor
@NoArgsConstructor  //Crea los constructores con los atributos

public class User {
    private Long id;   //Identificador
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private LocalDate birthDate;
    private String role;
    private String dni;
}
