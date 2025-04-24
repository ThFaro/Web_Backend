package com.webbackend.ac2.repositories;

import com.webbackend.ac2.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCnpj(String cnpj);
    Optional<Cliente> findByContato(String contato);
}
