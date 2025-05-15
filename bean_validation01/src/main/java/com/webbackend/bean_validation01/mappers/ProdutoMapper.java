package com.webbackend.bean_validation01.mappers;

import com.webbackend.bean_validation01.dtos.ProdutoDTO;
import com.webbackend.bean_validation01.models.Produto;

public class ProdutoMapper {

    public static ProdutoDTO toDTO(Produto produto) {
        return ProdutoDTO.builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .preco(produto.getPreco())
                .quantidadeEmEstoque(produto.getQuantidadeEmEstoque())
                .categoria(produto.getCategoria())
                .build();
    }
}
