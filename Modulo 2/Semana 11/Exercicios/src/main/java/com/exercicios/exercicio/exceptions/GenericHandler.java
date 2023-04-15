package com.exercicios.exercicio.exceptions;

import com.exercicios.exercicio.controllers.dtos.handler.ErroValidacao;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GenericHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Void> trataErro404() {

        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErroValidacao>> trataErro400(MethodArgumentNotValidException ex) {
        List<FieldError> erros = ex.getFieldErrors();

        return ResponseEntity.badRequest().body(
                erros.stream().map(ErroValidacao::new).collect(Collectors.toList()));
    }

    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<Void> trataErro500(HttpServerErrorException.InternalServerError e){
        return ResponseEntity.internalServerError().build();
    }

}
