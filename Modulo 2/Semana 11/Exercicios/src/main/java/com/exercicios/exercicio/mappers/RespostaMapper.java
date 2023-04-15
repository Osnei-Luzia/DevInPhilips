package com.exercicios.exercicio.mappers;

import com.exercicios.exercicio.controllers.dtos.RespostaRequest;
import com.exercicios.exercicio.controllers.dtos.RespostaResponse;
import com.exercicios.exercicio.models.RespostaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RespostaMapper {
    RespostaEntity map (RespostaRequest source);
    RespostaResponse map (RespostaEntity source);
}
