package com.webbackend.bean_validation01.services.impl;

import com.webbackend.bean_validation01.dtos.ProdutoDTO;
import com.webbackend.bean_validation01.mappers.ProdutoMapper;
import com.webbackend.bean_validation01.models.Produto;
import com.webbackend.bean_validation01.repositories.ProdutoRepository;
import com.webbackend.bean_validation01.services.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoDTO criar(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setQuantidadeEmEstoque(dto.getQuantidadeEmEstoque());
        produto.setCategoria(dto.getCategoria());

        Produto salvo = produtoRepository.save(produto);
        return ProdutoMapper.toDTO(salvo);
    }

    @Override
    public List<ProdutoDTO> listarTodos() {
        return produtoRepository.findAll()
                .stream()
                .map(ProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProdutoDTO obterPorId(Long id) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
        return ProdutoMapper.toDTO(produto);
    }

    @Override
    public ProdutoDTO editar(Long id, ProdutoDTO dto) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setQuantidadeEmEstoque(dto.getQuantidadeEmEstoque());
        produto.setCategoria(dto.getCategoria());

        return ProdutoMapper.toDTO(produtoRepository.save(produto));
    }

    @Override
    public void excluir(Long id) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
        produtoRepository.delete(produto);
    }
}
