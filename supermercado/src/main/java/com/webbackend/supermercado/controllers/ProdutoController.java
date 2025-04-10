package com.webbackend.supermercado.controllers;

import com.webbackend.supermercado.models.Produto;
import com.webbackend.supermercado.services.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public Produto cadastrar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @GetMapping("/preco/maior/{preco}")
    public List<Produto> buscarPorPrecoMaiorQue(@PathVariable Double preco) {
        return produtoService.buscarPorPrecoMaiorQue(preco);
    }

    @GetMapping("/setor/{setor}")
    public List<Produto> buscarPorSetor(@PathVariable String setor) {
        return produtoService.buscarPorSetor(setor);
    }

    @GetMapping("/validade/depois/{data}")
    public List<Produto> buscarPorValidadeDepoisDe(@PathVariable String data) {
        LocalDate dataConvertida = LocalDate.parse(data);
        return produtoService.buscarPorValidadeDepoisDe(dataConvertida);
    }
}
