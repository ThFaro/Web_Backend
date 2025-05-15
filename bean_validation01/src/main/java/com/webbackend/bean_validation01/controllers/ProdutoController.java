package com.webbackend.bean_validation01.controllers;

import com.webbackend.bean_validation01.dtos.ProdutoDTO;
import com.webbackend.bean_validation01.services.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoDTO criar(@RequestBody ProdutoDTO dto) {
        return produtoService.criar(dto);
    }

    @GetMapping
    public List<ProdutoDTO> listarTodos() {
        return produtoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ProdutoDTO obterPorId(@PathVariable Long id) {
        return produtoService.obterPorId(id);
    }

    @PutMapping("/{id}")
    public ProdutoDTO editar(@PathVariable Long id, @RequestBody ProdutoDTO dto) {
        return produtoService.editar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        produtoService.excluir(id);
    }
}
