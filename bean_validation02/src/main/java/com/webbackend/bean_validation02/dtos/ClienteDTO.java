package com.webbackend.bean_validation02.dtos;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class ClienteDTO {
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
}
