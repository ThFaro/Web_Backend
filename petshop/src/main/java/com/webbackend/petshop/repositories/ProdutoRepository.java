package com.webbackend.petshop.repositories;

import com.webbackend.petshop.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoria(String categoria);
    List<Produto> findByValidadeAfter(LocalDate data);
}
