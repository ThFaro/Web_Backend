package com.webbackend.design_pattern.controllers;

import com.webbackend.design_pattern.models.Pedido;
import com.webbackend.design_pattern.services.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoService.listarTodos();
    }

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    @GetMapping("/status/{status}")
    public List<Pedido> buscarPorStatus(@PathVariable String status) {
        return pedidoService.buscarPorStatus(status);
    }

    @GetMapping("/cliente/{nome}")
    public List<Pedido> buscarPorNomeCliente(@PathVariable String nome) {
        return pedidoService.buscarPorNomeCliente(nome);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Pedido> atualizarStatus(@PathVariable Long id, @RequestParam String status) {
        Pedido atualizado = pedidoService.atualizarStatus(id, status);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }
}
