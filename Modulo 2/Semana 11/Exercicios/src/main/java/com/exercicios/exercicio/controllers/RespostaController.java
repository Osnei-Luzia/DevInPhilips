package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.RespostaRequest;
import com.exercicios.exercicio.controllers.dtos.RespostaResponse;
import com.exercicios.exercicio.services.RespostaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {
    private final RespostaService service;

    public RespostaController(RespostaService respostaService){
        this.service = respostaService;
    }
    @GetMapping
    public List<RespostaResponse> listarRespostas(){
        return service.buscarRespostas();
    }

    @GetMapping("/{id}")
    public RespostaResponse listarRespostaById(@PathVariable Long id){
        return service.buscarRepostasById(id);
    }

    @GetMapping("/porPergunta")
    public RespostaResponse listarPerguntasByQuiz(@RequestParam Long idPergunta){
        return service.buscarRespostasByPerguntas(idPergunta);
    }

    @PostMapping("/adicionar")
    public void criarResposta(@RequestBody RespostaRequest respostaRequest){
        service.salvarResposta(respostaRequest);
    }
}
