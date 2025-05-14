package com.webbackend.tratamento_erros.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
