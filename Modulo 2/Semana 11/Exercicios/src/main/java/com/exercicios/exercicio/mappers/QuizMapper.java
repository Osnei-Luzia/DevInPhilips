package com.exercicios.exercicio.mappers;

import com.exercicios.exercicio.controllers.dtos.QuizRequest;
import com.exercicios.exercicio.controllers.dtos.QuizResponse;
import com.exercicios.exercicio.models.QuizEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuizMapper {
    QuizEntity map (QuizRequest source);
    QuizResponse map (QuizEntity source);
}
