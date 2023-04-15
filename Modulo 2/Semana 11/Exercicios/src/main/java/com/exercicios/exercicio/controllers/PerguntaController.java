package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.PerguntaRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaResponse;

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
    public List<PerguntaResponse> listarPerguntas(){
        return service.buscarPerguntas();
    }
    @GetMapping("/{id}")
    public PerguntaResponse listarPerguntasById(@PathVariable Long id){
        return service.buscarPerguntasById(id);
    }

    @GetMapping("/porQuiz")
    public List<PerguntaResponse> listarPerguntasByQuiz(@RequestParam Long idQuiz){
        return service.buscarPerguntasByQuiz(idQuiz);
    }
    @PostMapping("/adicionar")
    public void criarPergunta(@RequestBody PerguntaRequest perguntaRequest){
        service.salvarPergunta(perguntaRequest);
    }
}
