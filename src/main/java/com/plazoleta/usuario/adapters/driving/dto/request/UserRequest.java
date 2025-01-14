package com.plazoleta.usuario.adapters.driving.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

//Request es la entrada de datos
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "First name is required")
    @Size(max= 50, message ="First name must be less than 50 characters")
    private String firstName;
    private String lastName;
    @Email(message= "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "password is required")
    private String password;
    private String phone;
    private String address;
    @NotNull(message = "Birth date is required")
    @Past(message ="Birth date must be in the past" )
    private LocalDate birthDate;
    @NotBlank(message = "DNI is required")
    @Pattern(regexp = "^[0-9]{8}[A-Z]$", message = "Invalid DNI format ")
    private String dni;
}
