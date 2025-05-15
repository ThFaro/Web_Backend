package com.webbackend.bean_validation01.repositories;

import com.webbackend.bean_validation01.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
