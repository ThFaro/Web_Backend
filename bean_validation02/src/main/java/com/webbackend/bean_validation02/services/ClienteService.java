package com.webbackend.bean_validation02.services;

import com.webbackend.bean_validation02.dtos.ClienteDTO;

import java.util.List;

public interface ClienteService {
    ClienteDTO criar(ClienteDTO dto);
    List<ClienteDTO> listarTodos();
    ClienteDTO obterPorId(Long id);
    ClienteDTO editar(Long id, ClienteDTO dto);
    void excluir(Long id);
}
