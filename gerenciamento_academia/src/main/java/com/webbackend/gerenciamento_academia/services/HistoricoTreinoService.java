package com.webbackend.gerenciamento_academia.services;

import com.webbackend.gerenciamento_academia.models.Aluno;
import com.webbackend.gerenciamento_academia.models.HistoricoTreino;
import com.webbackend.gerenciamento_academia.repositories.AlunoRepository;
import com.webbackend.gerenciamento_academia.repositories.HistoricoTreinoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoTreinoService {

    private final HistoricoTreinoRepository historicoTreinoRepository;
    private final AlunoRepository alunoRepository;

    public HistoricoTreinoService(HistoricoTreinoRepository historicoTreinoRepository, AlunoRepository alunoRepository) {
        this.historicoTreinoRepository = historicoTreinoRepository;
        this.alunoRepository = alunoRepository;
    }

    public HistoricoTreino cadastrarTreino(Long alunoId, HistoricoTreino treino) {
        Aluno aluno = alunoRepository.findById(alunoId).orElse(null);
        if (aluno != null) {
            treino.setAluno(aluno);
            return historicoTreinoRepository.save(treino);
        }
        return null;
    }

    public List<HistoricoTreino> listarTreinosPorAluno(Long alunoId) {
        return historicoTreinoRepository.findByAlunoId(alunoId);
    }

    public List<HistoricoTreino> listarTodosOsTreinos() {
        return historicoTreinoRepository.findAll();
    }
}
