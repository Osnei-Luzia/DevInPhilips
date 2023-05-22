package com.example.apirestrevisaoteste.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GenericHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public static ResponseEntity error404(IllegalArgumentException e){
        return ResponseEntity.status(404).build();
    }
}
