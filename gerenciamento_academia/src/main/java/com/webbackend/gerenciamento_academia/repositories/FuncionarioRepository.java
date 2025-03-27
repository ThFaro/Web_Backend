package com.webbackend.gerenciamento_academia.repositories;

import com.webbackend.gerenciamento_academia.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
