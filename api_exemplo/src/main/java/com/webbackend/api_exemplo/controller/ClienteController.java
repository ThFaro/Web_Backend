package com.webbackend.api_exemplo.controller;

import com.webbackend.api_exemplo.model.Cliente;
import com.webbackend.api_exemplo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/adicionar")
    public String adicionarCliente(@RequestBody Cliente cliente) {
        clienteService.adicionarCliente(cliente);
        return "Cliente adicionado com sucesso!";
    }

    @GetMapping("/listar")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
}
