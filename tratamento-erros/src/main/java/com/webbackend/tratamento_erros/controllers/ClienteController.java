package com.webbackend.tratamento_erros.controllers;

import com.webbackend.tratamento_erros.dto.ClienteDTO;
import com.webbackend.tratamento_erros.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ClienteDTO criar(@RequestBody ClienteDTO dto) {
        return clienteService.criar(dto);
    }

    @GetMapping
    public List<ClienteDTO> listarTodos() {
        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ClienteDTO obterPorId(@PathVariable Long id) {
        return clienteService.obterPorId(id);
    }

    @PutMapping("/{id}")
    public ClienteDTO editar(@PathVariable Long id, @RequestBody ClienteDTO dto) {
        return clienteService.editar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        clienteService.excluir(id);
    }
}
