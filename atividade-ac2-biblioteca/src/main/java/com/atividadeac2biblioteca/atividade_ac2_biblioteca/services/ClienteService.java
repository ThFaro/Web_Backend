package com.atividadeac2biblioteca.atividade_ac2_biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Cliente;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories.IClienteRepository;


@Service
public class ClienteService {
    @Autowired
    private IClienteRepository repository;

    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Cliente> buscarClientesPorCelular(String celular) {
        return repository.buscarClientePeloCelular(celular);
    }

    public List<Cliente> buscarClientesPorCpf(String cpf) {
        return repository.buscarClientePeloCpf(cpf);
    }

    public List<Cliente> buscarClientesPorEmail(String email) {
        return repository.buscarClientePeloEmail(email);
    }

    public List<Cliente> buscarClientesPorNome(String nome) {
        return repository.buscarClientePeloNome(nome);
    }

    public Cliente inserirCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente editarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public void excluirCliente(Long id) {
        repository.deleteById(id);
    }
}
