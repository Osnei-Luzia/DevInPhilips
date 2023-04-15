package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.QuizAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.QuizRequest;
import com.exercicios.exercicio.controllers.dtos.QuizResponse;
import com.exercicios.exercicio.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private final QuizService service;

    public QuizController(QuizService quizService){
        this.service = quizService;
    }
    @GetMapping
    public List<QuizResponse> listarQuiz(){
        return service.buscarQuiz();
    }

    @GetMapping("/{id}")
    public QuizResponse listarQuiz(@PathVariable Long id){
        return service.buscarQuizById(id);
    }

    @PostMapping("/adicionar")
    public void criarQuiz(@RequestBody QuizRequest quizRequest){
        service.salvarQuiz(quizRequest);
    }

    @PutMapping("/alterar")
    public void alterarQuiz(@RequestBody QuizAlteracaoRequest quizRequest){
        service.alterarQuiz(quizRequest);
    }
}
