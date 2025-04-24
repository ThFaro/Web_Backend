package com.webbackend.ac2.repositories;

import com.webbackend.ac2.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByStatus(String status);
    List<Projeto> findByClienteNomeEmpresaContainingIgnoreCase(String nome);
}
