package com.webbackend.supermercado.controllers;

import com.webbackend.supermercado.models.Venda;
import com.webbackend.supermercado.services.VendaService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @GetMapping
    public List<Venda> listarTodas() {
        return vendaService.listarTodas();
    }

    @PostMapping
    public Venda salvar(@RequestBody Venda venda) {
        return vendaService.salvar(venda);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Venda> buscarPorCliente(@PathVariable Long clienteId) {
        return vendaService.buscarPorClienteId(clienteId);
    }

    @GetMapping("/valor-maior/{valor}")
    public List<Venda> buscarPorValorMaior(@PathVariable Double valor) {
        return vendaService.buscarPorValorMaiorQue(valor);
    }

    @GetMapping("/entre-datas")
    public List<Venda> buscarEntreDatas(
            @RequestParam("inicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime inicio,
            @RequestParam("fim") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fim) {
        return vendaService.buscarEntreDatas(inicio, fim);
    }

    @GetMapping("/produto/{produtoId}")
    public List<Venda> buscarPorProdutoId(@PathVariable Long produtoId) {
        return vendaService.buscarPorProdutoId(produtoId);
    }
}
