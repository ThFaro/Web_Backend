package com.atividadeac2biblioteca.atividade_ac2_biblioteca.controllers;

import java.util.List;

import org.hibernate.sql.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Cliente;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public String inserir(@RequestBody Cliente command) {
        var cliente = new Cliente();
        cliente.setNome(command.getNome());
        cliente.setCpf(command.getCpf());
        cliente.setDataNascimento(command.getDataNascimento());
        cliente.setCelular(command.getCelular());
        cliente.setEmail(command.getEmail());

        service.inserirCliente(cliente);
        return "Cliente inserido com sucesso!";
    }

    @PutMapping
    public Cliente editar(@RequestBody Cliente cliente) {
        return service.editarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluirCliente(id);
        return "Cliente excluido com sucesso!";
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id) {
        return service.buscarClientePorId(id);
    }

    @GetMapping("/cpf/{cpf}")
    public List<Cliente> buscarClientesPorId(@PathVariable String cpf) {
        return service.buscarClientesPorCpf(cpf);
    }

    @GetMapping("/nome/{nome}")
    public List<Cliente> buscarClientesPorNome(@PathVariable String nome) {
        return service.buscarClientesPorNome(nome);
    }

    @GetMapping("/celular/{celular}")
    public List<Cliente> buscarClientesPorCelular(@PathVariable String celular) {
        return service.buscarClientesPorCelular(celular);
    }

    @GetMapping("/email/{email}")
    public List<Cliente> buscarClientesPorEmail(@PathVariable String email) {
        return service.buscarClientesPorEmail(email);
    }

}