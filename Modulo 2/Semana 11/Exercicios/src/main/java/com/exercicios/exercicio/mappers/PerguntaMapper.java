package com.exercicios.exercicio.mappers;

import com.exercicios.exercicio.controllers.dtos.PerguntaRequest;
import com.exercicios.exercicio.controllers.dtos.PerguntaResponse;
import com.exercicios.exercicio.models.PerguntaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PerguntaMapper {
    PerguntaEntity map (PerguntaRequest source);
    PerguntaResponse map (PerguntaEntity source);
}
