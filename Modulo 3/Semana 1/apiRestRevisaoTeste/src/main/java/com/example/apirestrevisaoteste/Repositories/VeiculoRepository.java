package com.example.apirestrevisaoteste.Repositories;

import com.example.apirestrevisaoteste.Models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
