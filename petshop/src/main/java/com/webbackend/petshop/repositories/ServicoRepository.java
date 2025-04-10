package com.webbackend.petshop.repositories;

import com.webbackend.petshop.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    List<Servico> findByTipo(String tipo);
    List<Servico> findByPrecoLessThanEqual(Double preco);
}
