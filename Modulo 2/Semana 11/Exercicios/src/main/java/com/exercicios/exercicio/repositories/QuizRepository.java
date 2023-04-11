package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.models.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<QuizEntity,Long> {
}
