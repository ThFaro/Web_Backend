package com.webbackend.supermercado.services;

import com.webbackend.supermercado.models.Produto;
import com.webbackend.supermercado.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> buscarPorPrecoMaiorQue(Double preco) {
        return produtoRepository.findByPrecoGreaterThan(preco);
    }

    public List<Produto> buscarPorSetor(String setor) {
        return produtoRepository.findBySetor(setor);
    }

    public List<Produto> buscarPorValidadeDepoisDe(LocalDate data) {
        return produtoRepository.findByValidadeAfter(data);
    }
}
