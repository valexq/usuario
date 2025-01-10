package com.plazoleta.usuario.adapters.driven.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name= "role")
@NoArgsConstructor
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    //Esta tabla está relacionada con la tabla User
    //Donde un rol puede tener muchos usuarios pero un usuario solo puede tener un rol
}
