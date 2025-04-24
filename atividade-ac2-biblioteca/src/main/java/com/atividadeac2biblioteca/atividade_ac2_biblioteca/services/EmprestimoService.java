package com.atividadeac2biblioteca.atividade_ac2_biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Emprestimo;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories.IEmprestimoRepository;

@Service
public class EmprestimoService {
    @Autowired
    private IEmprestimoRepository repository;

    public List<Emprestimo> listarEmprestimos() {
        return repository.findAll();
    }

    public Emprestimo buscarEmprestimoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Emprestimo> buscarTodosOsEmprestimosDeCliente(String nome) {
        return repository.buscarTodosOsEmprestimosDeCliente(nome);
    }

    public List<Emprestimo> buscarTodosOsEmprestimosDeLivro(String titulo) {
        return repository.buscarTodosOsEmprestimosDeLivro(titulo);
    }

    public List<Emprestimo> buscarTodosOsEmprestimosEmAtraso() {
        return repository.buscarTodosOsEmprestimosEmAtraso();
    }

    public Emprestimo inserirEmprestimo(Emprestimo emprestimo) {
        return repository.save(emprestimo);
    }

    public Emprestimo editarEmprestimo(Emprestimo emprestimo) {
        return repository.save(emprestimo);
    }

    public void excluirEmprestimo(Long id) {
        repository.deleteById(id);
    }
}
