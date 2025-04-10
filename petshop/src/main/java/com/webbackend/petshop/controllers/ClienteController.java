package com.webbackend.petshop.controllers;

import com.webbackend.petshop.models.Cliente;
import com.webbackend.petshop.services.ClienteService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

@GetMapping("/cpf/{cpf}")
public ResponseEntity<Cliente> buscarPorCpf(@PathVariable String cpf) {
    return clienteService.buscarPorCpf(cpf)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
}

@GetMapping("/celular/{celular}")
public ResponseEntity<Cliente> buscarPorCelular(@PathVariable String celular) {
    return clienteService.buscarPorCelular(celular)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
}

}
