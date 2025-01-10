package com.plazoleta.usuario.domain.exception;

//Todas las excepciones creadas se heredan(extends) de un RuntimeException
public class UserNullException extends RuntimeException{
    public UserNullException(String message) {
        super(message);
    }
}
