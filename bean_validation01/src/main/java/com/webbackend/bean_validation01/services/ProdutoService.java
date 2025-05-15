package com.webbackend.bean_validation01.services;

import com.webbackend.bean_validation01.dtos.ProdutoDTO;

import java.util.List;

public interface ProdutoService {
    ProdutoDTO criar(ProdutoDTO dto);
    List<ProdutoDTO> listarTodos();
    ProdutoDTO obterPorId(Long id);
    ProdutoDTO editar(Long id, ProdutoDTO dto);
    void excluir(Long id);
}
