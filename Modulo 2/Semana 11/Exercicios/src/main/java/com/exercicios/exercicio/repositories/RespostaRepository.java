package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity,Long> {
    @Query("SELECT r FROM RespostaEntity r WHERE r.id_pergunta.id = :idPergunta")
    RespostaEntity findByPergunta_id(@Param("idPergunta")Long idPergunta);
}
