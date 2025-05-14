package com.webbackend.tratamento_erros.repositories;

import com.webbackend.tratamento_erros.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
