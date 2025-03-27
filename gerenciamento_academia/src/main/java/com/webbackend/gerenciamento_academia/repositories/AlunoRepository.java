package com.webbackend.gerenciamento_academia.repositories;

import com.webbackend.gerenciamento_academia.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
