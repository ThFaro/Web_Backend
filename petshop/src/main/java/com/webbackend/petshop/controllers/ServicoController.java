package com.webbackend.petshop.controllers;

import com.webbackend.petshop.models.Servico;
import com.webbackend.petshop.services.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<Servico> listarTodos() {
        return servicoService.listarTodos();
    }

    @PostMapping
    public Servico salvar(@RequestBody Servico servico) {
        return servicoService.salvar(servico);
    }

    @GetMapping("/tipo/{tipo}")
    public List<Servico> buscarPorTipo(@PathVariable String tipo) {
        return servicoService.buscarPorTipo(tipo);
    }

    @GetMapping("/preco-menor-ou-igual/{preco}")
    public List<Servico> buscarPorPrecoMenorOuIgual(@PathVariable Double preco) {
        return servicoService.buscarPorPrecoMenorOuIgual(preco);
    }
}
