package com.exercicios.exercicio.mappers;

import com.exercicios.exercicio.controllers.PerguntaController;
import com.exercicios.exercicio.controllers.dtos.PerguntaAlteracaoRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaResponse;
import com.exercicios.exercicio.models.PerguntaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PerguntaMapper {
    PerguntaEntity map (PerguntaRequest source);
    PerguntaResponse map (PerguntaEntity source);

    PerguntaEntity map (PerguntaAlteracaoRequest source);

    default Page<PerguntaResponse> map (Page<PerguntaEntity> source){
        return source.map(this::map);
    }
}
