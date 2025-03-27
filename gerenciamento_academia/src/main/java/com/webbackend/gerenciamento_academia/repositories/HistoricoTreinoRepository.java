package com.webbackend.gerenciamento_academia.repositories;

import com.webbackend.gerenciamento_academia.models.HistoricoTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoTreinoRepository extends JpaRepository<HistoricoTreino, Long> {
    List<HistoricoTreino> findByAlunoId(Long alunoId);
}
