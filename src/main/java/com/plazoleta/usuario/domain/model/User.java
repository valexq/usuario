package com.plazoleta.usuario.domain.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get y set
@AllArgsConstructor
@NoArgsConstructor  //Crea los constructores con los atributos

public class User {
    private String name;
    private String dni;
}
