package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.QuizAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.RespostaAlteracaoRequest;
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

    @PutMapping("/alterar")
    public void alterarResposta(@RequestBody RespostaAlteracaoRequest respostaRequest){
        service.alterarResposta(respostaRequest);
    }

    @DeleteMapping
    public void deletarResposta(@RequestParam Long id){
        service.deletarResposta(id);
    }
}
