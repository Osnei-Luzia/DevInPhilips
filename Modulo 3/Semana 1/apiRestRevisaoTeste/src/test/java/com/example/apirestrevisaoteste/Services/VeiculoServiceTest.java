package com.example.apirestrevisaoteste.Services;

import com.example.apirestrevisaoteste.Models.Veiculo;
import com.example.apirestrevisaoteste.Repositories.VeiculoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class VeiculoServiceTest {
    @Mock
    private VeiculoRepository repository;
    //retorno de injeções padrão é o objeto vazio e optional vem empty
    @InjectMocks
    private VeiculoService service;
    //@BeforeEach
    /*
    void setup(){
        o mesmo given para todos os testes
    }
    */
    @Test
    @DisplayName("Quando existir veiculo com o Id informado, deve retornar o veiculo")
    void buscarById() {
        //given
        Long id = 1L;
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(id);
        veiculo.setCor("Azul");
        veiculo.setTipo("Carro");
        veiculo.setAnoDeFabricacao("2000");
        veiculo.setQtdMultas(1);

        Mockito.when(repository.findById((Mockito.anyLong())))
                .thenReturn(Optional.of(veiculo));
        //when
        Veiculo resultado = service.buscarById(id);

        //then
        assertNotNull(resultado);
        assertEquals(id, resultado.getPlaca());
    }
    @Test
    @DisplayName("Quando não existir veiculo com o Id informado, deve retornar um exception")
    void buscarById_notFound() {
        //given
        Long id = 1L;
        //when
        //then
        assertThrows(IllegalArgumentException.class, ()->service.buscarById(id));
    }
}