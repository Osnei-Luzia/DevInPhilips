package com.exercicios.exercicio.services;

import com.exercicios.exercicio.controllers.dtos.RespostaRequest;
import com.exercicios.exercicio.controllers.dtos.RespostaResponse;
import com.exercicios.exercicio.mappers.RespostaMapper;
import com.exercicios.exercicio.models.RespostaEntity;
import com.exercicios.exercicio.repositories.RespostaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RespostaService {
    private final RespostaRepository repository;
    private final RespostaMapper mapper;
    public RespostaService(RespostaRepository respostaRepository, RespostaMapper respostaMapper){
        this.repository = respostaRepository;
        this.mapper = respostaMapper;
    }

    public List<RespostaResponse> buscarRespostas(){
        return repository.findAll().stream().map(
                respostaEntity -> mapper.map(respostaEntity))
                .collect(Collectors.toList());
    }

    public RespostaResponse buscarRepostasById(Long id){
        RespostaEntity respostaEntity = repository.findById(id).orElse(null);
        RespostaResponse respostaResponse = mapper.map(respostaEntity);

        return respostaResponse;
    }
    public RespostaResponse buscarRespostasByPerguntas(Long idPergunta){
        RespostaEntity respostaEntity = repository.findByPergunta_id(idPergunta);
        RespostaResponse respostaResponse = mapper.map(respostaEntity);
        //tratar Else null
        return respostaResponse;
    }

    public void salvarResposta(RespostaRequest respostaRequest){
        RespostaEntity respostaEntity = mapper.map(respostaRequest);

        repository.save(respostaEntity);
    }
}
