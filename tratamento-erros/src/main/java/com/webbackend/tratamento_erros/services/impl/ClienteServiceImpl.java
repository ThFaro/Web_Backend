package com.webbackend.tratamento_erros.services.impl;

import com.webbackend.tratamento_erros.dto.ClienteDTO;
import com.webbackend.tratamento_erros.models.Cliente;
import com.webbackend.tratamento_erros.repositories.ClienteRepository;
import com.webbackend.tratamento_erros.services.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteDTO criar(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        return toDTO(clienteRepository.save(cliente));
    }

    @Override
    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDTO obterPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        return toDTO(cliente);
    }

    @Override
    public ClienteDTO editar(Long id, ClienteDTO dto) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));

        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());

        return toDTO(clienteRepository.save(cliente));
    }

    @Override
    public void excluir(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        clienteRepository.delete(cliente);
    }

    private ClienteDTO toDTO(Cliente cliente) {
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .telefone(cliente.getTelefone())
                .build();
    }
}
