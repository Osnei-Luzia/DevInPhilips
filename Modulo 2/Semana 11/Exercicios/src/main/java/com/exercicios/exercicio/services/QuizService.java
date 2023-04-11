package com.exercicios.exercicio.services;

import com.exercicios.exercicio.controllers.dtos.PerguntaDto;
import com.exercicios.exercicio.controllers.dtos.QuizDto;
import com.exercicios.exercicio.models.PerguntaEntity;
import com.exercicios.exercicio.models.QuizEntity;
import com.exercicios.exercicio.repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {
    private final QuizRepository repository;
    public QuizService(QuizRepository quizRepository){
        this.repository = quizRepository;
    }

    public List<QuizDto> buscarQuiz(){
        return repository.findAll().stream().map(
                        quizEntity -> new QuizDto(quizEntity.getNome(), quizEntity.getDescricao()))
                .collect(Collectors.toList());
    }
    public QuizDto buscarQuizById(Long id){
        QuizDto quizDto = new QuizDto();
        QuizEntity quizEntity = repository.findById(id).orElse(null);
        //tratar Else null
        quizDto.setNome(quizEntity.getNome());
        quizDto.setDescricao(quizEntity.getDescricao());

        return quizDto;
    }
}
