package com.webbackend.ac2.controllers;

import com.webbackend.ac2.models.Projeto;
import com.webbackend.ac2.services.ProjetoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping
    public List<Projeto> listarTodos() {
        return projetoService.listarTodos();
    }

    @PostMapping
    public Projeto salvar(@RequestBody Projeto projeto) {
        return projetoService.salvar(projeto);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Projeto> atualizarStatus(@PathVariable Long id, @RequestParam String status) {
        Projeto atualizado = projetoService.atualizarStatus(id, status);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/{id}/colaboradores")
    public ResponseEntity<Projeto> adicionarColaboradores(@PathVariable Long id, @RequestBody List<Long> colaboradoresIds) {
        Projeto projeto = projetoService.atribuirColaboradores(id, colaboradoresIds);
        if (projeto != null) {
            return ResponseEntity.ok(projeto);
        }
        return ResponseEntity.notFound().build();
    }
}
