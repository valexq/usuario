package com.plazoleta.usuario.configuration.exceptionhandler;

import com.plazoleta.usuario.domain.exception.EmailAlreadyExistsException;
import com.plazoleta.usuario.domain.exception.UserNullException;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
@RequiredArgsConstructor

public class ControllerAdvisor {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionCodeResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        FieldError fieldError = ex.getFieldErrors().get(0);
        return ResponseEntity.badRequest().body(new ExceptionCodeResponse(HttpStatus.BAD_REQUEST.value(), fieldError.getDefaultMessage(), HttpStatus.BAD_REQUEST.name(), LocalDateTime.now()));
    }

    @ExceptionHandler(UserNullException.class)
    public ResponseEntity<ExceptionCodeResponse> handleUserNullException(UserNullException ex){
        return ResponseEntity.badRequest().body(new ExceptionCodeResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), HttpStatus.BAD_REQUEST.name(), LocalDateTime.now()));
    }
    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ExceptionCodeResponse> handleEmailAlreadyExistsException(EmailAlreadyExistsException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ExceptionCodeResponse(HttpStatus.CONFLICT.value(), ex.getMessage(), HttpStatus.CONFLICT.name(), LocalDateTime.now()));
    }
}
