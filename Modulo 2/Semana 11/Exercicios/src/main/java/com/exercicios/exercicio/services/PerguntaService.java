package com.exercicios.exercicio.services;

import com.exercicios.exercicio.controllers.dtos.PerguntaDto;
import com.exercicios.exercicio.models.PerguntaEntity;
import com.exercicios.exercicio.repositories.PerguntaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerguntaService {
    private final PerguntaRepository repository;

    public PerguntaService(PerguntaRepository perguntaRepository) {
        this.repository = perguntaRepository;
    }

    public List<PerguntaDto> buscarPerguntas() {
        return repository.findAll().stream().map(
                        perguntaEntity -> new PerguntaDto(perguntaEntity.getTitulo(), perguntaEntity.getTexto()))
                .collect(Collectors.toList());
    }

    public PerguntaDto buscarPerguntasById(Long id) {
        PerguntaDto perguntaDto = new PerguntaDto();
        PerguntaEntity perguntaEntity = repository.findById(id).orElse(null);
        //tratar Else null
        perguntaDto.setTitulo(perguntaEntity.getTexto());
        perguntaDto.setTexto(perguntaEntity.getTexto());

        return null;//perguntaDto;
    }

    public PerguntaDto buscarPerguntasByQuiz(Long idQuiz){
        PerguntaDto perguntaDto = new PerguntaDto();
        PerguntaEntity perguntaEntity = repository.findById_quiz(idQuiz);
        //tratar Else null
        perguntaDto.setTitulo(perguntaEntity.getTexto());
        perguntaDto.setTexto(perguntaEntity.getTexto());

        return perguntaDto;
    }

}
