package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.PerguntaAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaResponse;

import com.exercicios.exercicio.services.PerguntaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {
    private final PerguntaService service;

    public PerguntaController(PerguntaService perguntaService){
        this.service = perguntaService;
    }

    @GetMapping
    public ResponseEntity<Page<PerguntaResponse>> listarPerguntas(Pageable paginacao){
        return ResponseEntity.ok(service.buscarPerguntas(paginacao));
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
    public ResponseEntity<Void> criarPergunta(@RequestBody PerguntaRequest perguntaRequest){
        service.salvarPergunta(perguntaRequest);
        return ResponseEntity.badRequest().build();
                //created(URI.create("localhost:8080/perguntas")).build()
    }

    @PutMapping("/alterar")
    public void alterarPergunta(@RequestBody PerguntaAlteracaoRequest perguntaRequest){
        service.alterarPergunta(perguntaRequest);
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarPergunta(@RequestParam Long id){
        service.deletarPergunta(id);
        return ResponseEntity.noContent().build();
    }
}
