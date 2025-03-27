package com.webbackend.gerenciamento_academia.repositories;

import com.webbackend.gerenciamento_academia.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findBySalarioGreaterThan(Double salario);

    List<Pessoa> findBySalarioLessThanEqual(Double salario);

    List<Pessoa> findByNomeStartingWith(String nome);
}
