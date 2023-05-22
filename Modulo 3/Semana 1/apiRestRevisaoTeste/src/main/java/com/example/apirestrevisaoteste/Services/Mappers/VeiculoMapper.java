package com.example.apirestrevisaoteste.Services.Mappers;

import com.example.apirestrevisaoteste.Controllers.dtos.RequestCriarVeiculo;
import com.example.apirestrevisaoteste.Models.Veiculo;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface VeiculoMapper {
    Veiculo map(RequestCriarVeiculo source);
    void update(@MappingTarget Veiculo target, RequestCriarVeiculo source);
}
