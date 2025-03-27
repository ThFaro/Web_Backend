package com.webbackend.gerenciamento_academia.services;

import com.webbackend.gerenciamento_academia.models.Aluno;
import com.webbackend.gerenciamento_academia.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno cadastrarAluno(Aluno aluno) {
        aluno.setDataMatricula(LocalDate.now());
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAluno(Long id, Aluno alunoAtualizado) {
        return alunoRepository.findById(id).map(aluno -> {
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setIdade(alunoAtualizado.getIdade());
            aluno.setPlano(alunoAtualizado.getPlano());
            aluno.setFuncionarios(alunoAtualizado.getFuncionarios());
            return alunoRepository.save(aluno);
        }).orElse(null);
    }

    public boolean deletarAluno(Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
