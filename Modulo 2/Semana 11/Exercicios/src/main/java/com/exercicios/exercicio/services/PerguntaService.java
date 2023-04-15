package com.exercicios.exercicio.services;

import com.exercicios.exercicio.controllers.dtos.PerguntaAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaResponse;
import com.exercicios.exercicio.mappers.PerguntaMapper;
import com.exercicios.exercicio.models.PerguntaEntity;
import com.exercicios.exercicio.repositories.PerguntaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class PerguntaService {

    private final PerguntaRepository repository;
    private final PerguntaMapper mapper;

    public PerguntaService(PerguntaRepository perguntaRepository, PerguntaMapper mapper) {
        this.repository = perguntaRepository;
        this.mapper = mapper;
    }

    public List<PerguntaResponse> buscarPerguntas() {
        return repository.findAll().stream().map(
                        perguntaEntity -> new PerguntaResponse(perguntaEntity.getTitulo(), perguntaEntity.getTexto()))
                .collect(Collectors.toList());
    }

    public PerguntaResponse buscarPerguntasById(Long id) {
        PerguntaEntity perguntaEntity = repository.findById(id).orElse(null);
        //tratar Else null

        PerguntaResponse perguntaResponse = mapper.map(perguntaEntity);
        return perguntaResponse;
    }

    public List<PerguntaResponse> buscarPerguntasByQuiz(Long idQuiz) {
        return repository.findAllById_quiz(idQuiz).stream().map(
                        perguntaEntity -> mapper.map(perguntaEntity))
                .collect(Collectors.toList());
    }

    public void salvarPergunta(PerguntaRequest perguntaRequest) {
        PerguntaEntity perguntaEntity = mapper.map(perguntaRequest);

        repository.save(perguntaEntity);
    }

    public void alterarPergunta(PerguntaAlteracaoRequest perguntaRequest) {
        PerguntaEntity perguntaEntity = repository.findById(perguntaRequest.getId()).orElse(null);
        if (!Objects.isNull(perguntaEntity)) {
            perguntaEntity = mapper.map(perguntaRequest);
            repository.save(perguntaEntity);
        }else{
            System.out.println("Pergunta não encontrada");
        }
    }

    public void deletarPergunta(Long id){
        PerguntaEntity perguntaEntity = repository.findById(id).orElse(null);
        if(!Objects.isNull(perguntaEntity)){
            //fazer deleção de chaves estrangeiras

            repository.delete(perguntaEntity);
        }else{
            System.out.println("Pergunta não encontrada");
        }
    }
}
