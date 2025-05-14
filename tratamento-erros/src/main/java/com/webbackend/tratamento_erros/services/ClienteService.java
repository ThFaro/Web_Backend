package com.webbackend.tratamento_erros.services;

import com.webbackend.tratamento_erros.dto.ClienteDTO;
import java.util.List;

public interface ClienteService {
    ClienteDTO criar(ClienteDTO dto);
    List<ClienteDTO> listarTodos();
    ClienteDTO obterPorId(Long id);
    ClienteDTO editar(Long id, ClienteDTO dto);
    void excluir(Long id);
}

