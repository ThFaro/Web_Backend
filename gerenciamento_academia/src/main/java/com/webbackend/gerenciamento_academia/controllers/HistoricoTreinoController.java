package com.webbackend.gerenciamento_academia.controllers;

import com.webbackend.gerenciamento_academia.models.HistoricoTreino;
import com.webbackend.gerenciamento_academia.services.HistoricoTreinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historico-treinos")
public class HistoricoTreinoController {

    private final HistoricoTreinoService historicoTreinoService;

    public HistoricoTreinoController(HistoricoTreinoService historicoTreinoService) {
        this.historicoTreinoService = historicoTreinoService;
    }

    @PostMapping("/{alunoId}")
    public ResponseEntity<HistoricoTreino> cadastrarTreino(@PathVariable Long alunoId, @RequestBody HistoricoTreino treino) {
        HistoricoTreino treinoSalvo = historicoTreinoService.cadastrarTreino(alunoId, treino);
        if (treinoSalvo != null) {
            return ResponseEntity.ok(treinoSalvo);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/aluno/{alunoId}")
    public List<HistoricoTreino> listarTreinosPorAluno(@PathVariable Long alunoId) {
        return historicoTreinoService.listarTreinosPorAluno(alunoId);
    }

    @GetMapping
    public List<HistoricoTreino> listarTodosOsTreinos() {
        return historicoTreinoService.listarTodosOsTreinos();
    }
}
