package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.controllers.dtos.QuizDto;
import com.exercicios.exercicio.services.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private final QuizService service;

    public QuizController(QuizService quizService){
        this.service = quizService;
    }
    @GetMapping
    public List<QuizDto> listarQuiz(){
        return service.buscarQuiz();
    }

    @GetMapping("/{id}")
    public QuizDto listarQuiz(@PathVariable Long id){
        return service.buscarQuizById(id);
    }
}
