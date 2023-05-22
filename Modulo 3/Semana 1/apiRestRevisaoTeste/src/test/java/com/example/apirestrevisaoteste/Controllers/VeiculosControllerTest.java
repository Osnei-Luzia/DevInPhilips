package com.example.apirestrevisaoteste.Controllers;

import com.example.apirestrevisaoteste.Controllers.dtos.RequestCriarVeiculo;
import com.example.apirestrevisaoteste.Models.Veiculo;
import com.example.apirestrevisaoteste.Services.VeiculoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@WebMvcTest
class VeiculosControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; //java objeto para json

    @MockBean //mock classes para mvc
    private VeiculoService service;


    @Test
    @DisplayName("Quando não há registros, deve retornar lista vazia")
    void buscarTodos_vazio() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/veiculos")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.is(Matchers.empty())));
    }

    @Test
    @DisplayName("Quando há registros, deve retornar uma lista")
    void buscarTodos() throws Exception{
        //given
        List<Veiculo> carros = List.of(
                new Veiculo(1L,"Azul","Carro","2000",1),
                new Veiculo(2L,"Preto","Carro","2000",2),
                new Veiculo(3L,"Cinza","Carro","2000",2)
        );
        Mockito.when(service.buscar()).thenReturn(carros);
        //when
        //then
        mockMvc.perform(MockMvcRequestBuilders.get("/api/veiculos")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].tipo", Matchers.is(carros.get(0).getTipo())))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].qtdMultas", Matchers.is(carros.get(2).getQtdMultas())));
    }
    @Test
    @DisplayName("Quando não há registro no id informado, deve retornar exception")
    void buscarPorId_notFound() throws Exception{
        Mockito.when(service.buscarById(Mockito.anyLong())).thenThrow(IllegalArgumentException.class);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/veiculos/{id}",1L).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }
    @Test
    @DisplayName("Quando inserido corretamente, não deve retornar exceções")
    void inserir() throws  Exception{
        RequestCriarVeiculo request = new RequestCriarVeiculo();
        String requestJSON = objectMapper.writeValueAsString(request);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/veiculos").content(requestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
    @Test
    @DisplayName("Quando inserido corretamente, não deve retornar exceções")
    void alterar() throws  Exception{
        RequestCriarVeiculo request = new RequestCriarVeiculo();
        Long id = 1L;
        String requestJSON = objectMapper.writeValueAsString(request);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/veiculos/{id}/multas",id).content(requestJSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}