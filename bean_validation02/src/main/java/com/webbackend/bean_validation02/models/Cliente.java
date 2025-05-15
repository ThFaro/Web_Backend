package com.webbackend.bean_validation02.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 80)
    private String nome;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos numéricos")
    private String cpf;

    @Past(message = "A data de nascimento deve estar no passado")
    private LocalDate dataNascimento;

    @Size(min = 10, max = 15, message = "O telefone deve conter entre 10 e 15 caracteres")
    private String telefone;
}
