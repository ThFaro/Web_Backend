package com.webbackend.bean_validation02.mappers;

import com.webbackend.bean_validation02.dtos.ClienteDTO;
import com.webbackend.bean_validation02.models.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cliente) {
        return ClienteDTO.builder()
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .cpf(cliente.getCpf())
                .dataNascimento(cliente.getDataNascimento())
                .telefone(cliente.getTelefone())
                .build();
    }
}
