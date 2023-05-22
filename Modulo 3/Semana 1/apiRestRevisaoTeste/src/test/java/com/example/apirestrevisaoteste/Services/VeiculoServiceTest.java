package com.example.apirestrevisaoteste.Services;

import com.example.apirestrevisaoteste.Controllers.dtos.RequestCriarVeiculo;
import com.example.apirestrevisaoteste.Models.Veiculo;
import com.example.apirestrevisaoteste.Repositories.VeiculoRepository;
import com.example.apirestrevisaoteste.Services.Mappers.VeiculoMapper;
import org.assertj.core.internal.Objects;
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
    @Mock
    private VeiculoMapper mapper;
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
        assertThrows(IllegalArgumentException.class, () -> service.buscarById(id));
    }

    @Test
    @DisplayName("Quando informado um RequestCriarVeiculo, deve retornar um Veiculo")
    void salvar() {
        //given
        RequestCriarVeiculo veiculo = new RequestCriarVeiculo();
        veiculo.setCor("Azul");
        veiculo.setTipo("Carro");
        veiculo.setAnoDeFabricacao("2000");
        veiculo.setQtdMultas(1);

        Mockito.when(mapper.map(Mockito.any(RequestCriarVeiculo.class))).thenReturn(new Veiculo());
        Mockito.when(repository.save(Mockito.any(Veiculo.class))).thenReturn(new Veiculo());
        //when
        Veiculo resultado = service.salvar(veiculo);
        //then
        assertNotNull(resultado);
        assertTrue(resultado instanceof Veiculo);//redundante
        assertInstanceOf(Veiculo.class, resultado);
    }

    @Test
    @DisplayName("Quando existir um veiculo com o id informado, deve retornar o veiculo alterado")
    void alterar() {
        //given
        RequestCriarVeiculo veiculoAntigo = new RequestCriarVeiculo();
        veiculoAntigo.setCor("Azul");
        veiculoAntigo.setTipo("Carro");
        veiculoAntigo.setAnoDeFabricacao("2000");
        veiculoAntigo.setQtdMultas(1);

        Veiculo veiculoNovo = new Veiculo();
        veiculoNovo.setPlaca(1L);
        veiculoNovo.setCor("Azul");
        veiculoNovo.setTipo("Carro");
        veiculoNovo.setAnoDeFabricacao("2000");
        veiculoNovo.setQtdMultas(1);

        Mockito.when(mapper.map(Mockito.any(RequestCriarVeiculo.class))).thenReturn(new Veiculo());
        Mockito.when(repository.save(Mockito.any(Veiculo.class))).thenReturn(veiculoNovo);

        //when
        Veiculo resultado = service.salvar(veiculoAntigo);

        //then
        assertNotNull(resultado);
        assertInstanceOf(Veiculo.class, resultado);
        assertEquals(resultado.getPlaca(), veiculoNovo.getPlaca());
    }

    @Test
    @DisplayName("Quando não existir veiculo com o Id informado, deve retornar um exception")
    void alterar_notFound() {
        //given
        Long id = 1L;
        RequestCriarVeiculo request = new RequestCriarVeiculo();
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> service.alterar(request, id));
    }

    @Test
    @DisplayName("Quando não existir veiculo com o Id informado, deve retornar um exception")
    void deletar_notFound() {
        //given
        Long id = 1L;
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> service.deletar(id));
    }

    @Test
    @DisplayName("Quando existir veiculo com o Id informado e a qtdMultas for menor que 0, não deve retornar exception")
    void deletar() {
        //given
        Long id = 1L;
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(1L);
        veiculo.setCor("Azul");
        veiculo.setTipo("Carro");
        veiculo.setAnoDeFabricacao("2000");
        veiculo.setQtdMultas(1);

        Mockito.when(repository.findById(Mockito.anyLong())).thenReturn(Optional.of(veiculo));
        //when
        //then
        assertDoesNotThrow(() -> service.deletar(id));
    }
}