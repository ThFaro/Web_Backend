package com.webbackend.supermercado.repositories;

import com.webbackend.supermercado.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByPrecoGreaterThan(Double preco);

    List<Produto> findBySetor(String setor);

    List<Produto> findByValidadeAfter(LocalDate data);
}
