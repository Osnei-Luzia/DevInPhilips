package com.exercicios.exercicio.services;

import com.exercicios.exercicio.controllers.dtos.PerguntaDto;
import com.exercicios.exercicio.controllers.dtos.QuizDto;
import com.exercicios.exercicio.controllers.dtos.RespostaDto;
import com.exercicios.exercicio.models.PerguntaEntity;
import com.exercicios.exercicio.models.RespostaEntity;
import com.exercicios.exercicio.repositories.RespostaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RespostaService {
    private final RespostaRepository repository;
    public RespostaService(RespostaRepository respostaRepository){
        this.repository = respostaRepository;
    }

    public List<RespostaDto> buscarRespostas(){
        return repository.findAll().stream().map(
                respostaEntity -> new RespostaDto(respostaEntity.getTexto()))
                .collect(Collectors.toList());
    }

    public RespostaDto buscarRepostasById(Long id){
        RespostaDto respostaDto = new RespostaDto();
        RespostaEntity respostaEntity = repository.findById(id).orElse(null);

        respostaDto.setTexto(respostaEntity.getTexto());

        return respostaDto;
    }
    public RespostaDto buscarRespostasByPerguntas(Long idPergunta){
        RespostaDto respostaDto = new RespostaDto();
        RespostaEntity respostaEntity = repository.findByPergunta_id(idPergunta);
        //tratar Else null
        respostaDto.setTexto(respostaEntity.getTexto());
        return respostaDto;
    }
}
