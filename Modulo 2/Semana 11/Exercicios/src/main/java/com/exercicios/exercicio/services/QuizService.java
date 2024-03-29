package com.exercicios.exercicio.services;

import com.exercicios.exercicio.controllers.dtos.PerguntaAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.QuizAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.QuizRequest;
import com.exercicios.exercicio.controllers.dtos.QuizResponse;
import com.exercicios.exercicio.mappers.QuizMapper;
import com.exercicios.exercicio.models.PerguntaEntity;
import com.exercicios.exercicio.models.QuizEntity;
import com.exercicios.exercicio.repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class QuizService {
    private final QuizRepository repository;
    private final QuizMapper mapper;

    public QuizService(QuizRepository quizRepository, QuizMapper mapper) {
        this.repository = quizRepository;
        this.mapper = mapper;
    }

    public List<QuizResponse> buscarQuiz() {
        return repository.findAll().stream().map(
                        quizEntity -> new QuizResponse(quizEntity.getNome(), quizEntity.getDescricao()))
                .collect(Collectors.toList());
    }

    public QuizResponse buscarQuizById(Long id) {
        QuizResponse quizResponse = new QuizResponse();
        QuizEntity quizEntity = repository.findById(id).orElse(null);
        //tratar Else null
        quizResponse.setNome(quizEntity.getNome());
        quizResponse.setDescricao(quizEntity.getDescricao());

        return quizResponse;
    }

    public void salvarQuiz(QuizRequest quizRequest) {
        QuizEntity quizEntity = mapper.map(quizRequest);
        repository.save(quizEntity);
    }

    public void alterarQuiz(QuizAlteracaoRequest quizRequest) {
        QuizEntity quizEntity = repository.findById(quizRequest.getId()).orElse(null);
        if (!Objects.isNull(quizEntity)) {
            quizEntity = mapper.map(quizRequest);
            repository.save(quizEntity);
        } else {
            System.out.println("Quiz não encontrado");
        }
    }
    public void deletarQuiz(Long id) {
        QuizEntity quizEntity = repository.findById(id).orElse(null);
        if (!Objects.isNull(quizEntity)) {
            //fazer deleção de chaves estrangeiras

            repository.delete(quizEntity);
        } else {
            System.out.println("Quiz não encontrado");
        }
    }
}