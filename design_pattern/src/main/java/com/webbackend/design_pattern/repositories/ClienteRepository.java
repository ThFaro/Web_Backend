package com.webbackend.design_pattern.repositories;

import com.webbackend.design_pattern.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf(String cpf);
    Optional<Cliente> findByNome(String nome);
    Optional<Cliente> findByTelefone(String telefone);
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}
