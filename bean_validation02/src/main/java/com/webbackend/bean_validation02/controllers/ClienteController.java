package com.webbackend.bean_validation02.controllers;

import com.webbackend.bean_validation02.dtos.ClienteDTO;
import com.webbackend.bean_validation02.services.ClienteService;
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
