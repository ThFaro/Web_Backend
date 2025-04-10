package com.webbackend.petshop.controllers;

import com.webbackend.petshop.models.Produto;
import com.webbackend.petshop.services.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarPorCategoria(@PathVariable String categoria) {
        return produtoService.buscarPorCategoria(categoria);
    }
}
