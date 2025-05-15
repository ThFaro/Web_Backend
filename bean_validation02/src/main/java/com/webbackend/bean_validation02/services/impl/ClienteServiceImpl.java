package com.webbackend.bean_validation02.services.impl;

import com.webbackend.bean_validation02.dtos.ClienteDTO;
import com.webbackend.bean_validation02.mappers.ClienteMapper;
import com.webbackend.bean_validation02.models.Cliente;
import com.webbackend.bean_validation02.repositories.ClienteRepository;
import com.webbackend.bean_validation02.services.ClienteService;
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
        cliente.setCpf(dto.getCpf());
        cliente.setDataNascimento(dto.getDataNascimento());
        cliente.setTelefone(dto.getTelefone());

        return ClienteMapper.toDTO(clienteRepository.save(cliente));
    }

    @Override
    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll()
                .stream()
                .map(ClienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDTO obterPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        return ClienteMapper.toDTO(cliente);
    }

    @Override
    public ClienteDTO editar(Long id, ClienteDTO dto) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));

        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setCpf(dto.getCpf());
        cliente.setDataNascimento(dto.getDataNascimento());
        cliente.setTelefone(dto.getTelefone());

        return ClienteMapper.toDTO(clienteRepository.save(cliente));
    }

    @Override
    public void excluir(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        clienteRepository.delete(cliente);
    }
}
