package com.webbackend.design_pattern.services;

import com.webbackend.design_pattern.models.Cliente;
import com.webbackend.design_pattern.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarPorCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }

    public Optional<Cliente> buscarPorNome(String nome) {
        return clienteRepository.findByNome(nome);
    }

    public Optional<Cliente> buscarPorTelefone(String telefone) {
        return clienteRepository.findByTelefone(telefone);
    }

    public List<Cliente> buscarPorNomeContendo(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }
}
