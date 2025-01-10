package com.plazoleta.usuario.adapters.driven.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;   //Identificador de la tabla
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    private String lastName;
    @Column(unique = true , nullable = false)
    private String email;
    private String password;
    private String phone;
    private String address;
    private LocalDate birthDate;
    private String role;
    @Column(unique = true , nullable = false)
    private String dni;
    @ManyToOne //Relación de muchos a uno
    @JoinColumn(name = "role_id", nullable = false)
    private RoleEntity roleEntity;
}


