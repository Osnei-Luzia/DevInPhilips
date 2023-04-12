package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.PerguntaDto;

import com.exercicios.exercicio.services.PerguntaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {
    private final PerguntaService service;

    public PerguntaController(PerguntaService perguntaService){
        this.service = perguntaService;
    }

    @GetMapping
    public List<PerguntaDto> listarPerguntas(){
        return service.buscarPerguntas();
    }
    @GetMapping("/{id}")
    public PerguntaDto listarPerguntasById(@PathVariable Long id){
        return service.buscarPerguntasById(id);
    }

    @GetMapping("/porQuiz")
    public PerguntaDto listarPerguntasByQuiz(@RequestParam Long idQuiz){
        return service.buscarPerguntasByQuiz(idQuiz);
    }
}
