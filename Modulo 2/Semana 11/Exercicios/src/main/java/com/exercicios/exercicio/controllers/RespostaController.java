package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.PerguntaDto;
import com.exercicios.exercicio.controllers.dtos.RespostaDto;
import com.exercicios.exercicio.models.RespostaEntity;
import com.exercicios.exercicio.services.RespostaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {
    RespostaService service;

    public RespostaController(RespostaService respostaService){
        this.service = respostaService;
    }
    @GetMapping
    public List<RespostaDto> listarRespostas(){
        return service.buscarRespostas();
    }

    @GetMapping("/{id}")
    public RespostaDto listarRespostaById(@PathVariable Long id){
        return service.buscarRepostasById(id);
    }

    @GetMapping("/porPergunta")
    public RespostaDto listarPerguntasByQuiz(@RequestParam Long idPergunta){
        return service.buscarRespostasByPerguntas(idPergunta);
    }
}
