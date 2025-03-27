package com.webbackend.gerenciamento_academia.controllers;

import com.webbackend.gerenciamento_academia.models.Funcionario;
import com.webbackend.gerenciamento_academia.services.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping
    public Funcionario criarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.criarFuncionario(funcionario);
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarFuncionarioPorId(@PathVariable Long id) {
        Funcionario funcionario = funcionarioService.buscarPorId(id);
        if (funcionario != null) {
            return ResponseEntity.ok(funcionario);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizarFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        Funcionario atualizado = funcionarioService.atualizarFuncionario(id, funcionario);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFuncionario(@PathVariable Long id) {
        funcionarioService.deletarFuncionario(id);
        return ResponseEntity.noContent().build();
    }
}
