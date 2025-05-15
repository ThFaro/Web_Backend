package com.webbackend.bean_validation01.dtos;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class ProdutoDTO {
    private Long id;
    private String nome;
    private BigDecimal preco;
    private Integer quantidadeEmEstoque;
    private String categoria;
}
