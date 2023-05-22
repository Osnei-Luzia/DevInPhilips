package com.example.apirestrevisaoteste.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class VeiculoRepositoryTest {
    @Autowired
    private TestEntityManager em;

    @Autowired
    private VeiculoRepository repository;

    //exemplo de mock para repositorio
}