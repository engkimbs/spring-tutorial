package com.example.springtutorial.handler;

import com.example.springtutorial.exception.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value=AuthException.class)
    public ResponseEntity authException() {
        System.out.println("auth exception");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
