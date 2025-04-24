package com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    @Query("SELECT c FROM clientes c WHERE c.cpf = :cpf")
    List<Cliente> buscarClientePeloCpf(String cpf);

    @Query("SELECT c FROM clientes c WHERE c.celular = :celular")
    List<Cliente> buscarClientePeloCelular(String celular);

    @Query("SELECT c FROM clientes c WHERE c.email = :email")
    List<Cliente> buscarClientePeloEmail(String email);

    @Query("SELECT c FROM clientes c WHERE c.nome LIKE %:nome%")
    List<Cliente> buscarClientePeloNome(String nome);
}