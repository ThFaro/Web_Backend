package com.webbackend.gerenciamento_academia.services;

import com.webbackend.gerenciamento_academia.models.Funcionario;
import com.webbackend.gerenciamento_academia.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario criarFuncionario(Funcionario funcionario) {
        funcionario.setDataContratacao(LocalDate.now());
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario buscarPorId(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public Funcionario atualizarFuncionario(Long id, Funcionario funcionarioAtualizado) {
        return funcionarioRepository.findById(id).map(funcionario -> {
            funcionario.setNome(funcionarioAtualizado.getNome());
            funcionario.setCargo(funcionarioAtualizado.getCargo());
            return funcionarioRepository.save(funcionario);
        }).orElse(null);
    }

    public void deletarFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
