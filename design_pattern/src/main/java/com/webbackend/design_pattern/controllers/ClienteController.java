package com.webbackend.design_pattern.controllers;

import com.webbackend.design_pattern.models.Cliente;
import com.webbackend.design_pattern.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Cliente> buscarPorCpf(@PathVariable String cpf) {
        return clienteService.buscarPorCpf(cpf);
    }

    @GetMapping("/nome/{nome}")
    public Optional<Cliente> buscarPorNome(@PathVariable String nome) {
        return clienteService.buscarPorNome(nome);
    }

    @GetMapping("/telefone/{telefone}")
    public Optional<Cliente> buscarPorTelefone(@PathVariable String telefone) {
        return clienteService.buscarPorTelefone(telefone);
    }

    @GetMapping("/nome-contain/{nome}")
    public List<Cliente> buscarPorNomeContendo(@PathVariable String nome) {
        return clienteService.buscarPorNomeContendo(nome);
    }
}
