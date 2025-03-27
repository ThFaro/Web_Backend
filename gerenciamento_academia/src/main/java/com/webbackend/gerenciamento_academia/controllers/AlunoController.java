package com.webbackend.gerenciamento_academia.controllers;

import com.webbackend.gerenciamento_academia.models.Aluno;
import com.webbackend.gerenciamento_academia.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.cadastrarAluno(aluno);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aluno>> buscarPorId(@PathVariable Long id) {
        Optional<Aluno> aluno = alunoService.buscarPorId(id);
        if (aluno != null) {
            return ResponseEntity.ok(aluno);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno alunoAtualizado = alunoService.atualizarAluno(id, aluno);
        if (alunoAtualizado != null) {
            return ResponseEntity.ok(alunoAtualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAluno(@PathVariable Long id) {
        if (alunoService.deletarAluno(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
