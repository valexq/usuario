package com.plazoleta.usuario.configuration.exceptionhandler;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor

//Personaliza la salida de errores
public class ExceptionCodeResponse {
    private final int code;
    private final String message;
    private final String status;
    private final LocalDateTime timestamp;
}
