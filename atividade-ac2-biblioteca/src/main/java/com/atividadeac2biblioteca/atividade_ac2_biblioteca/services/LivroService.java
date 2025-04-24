package com.atividadeac2biblioteca.atividade_ac2_biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Livro;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories.ILivroRepository;

@Service
public class LivroService {
    @Autowired
    private ILivroRepository repository;

    public List<Livro> listarLivros() {
        return repository.findAll();
    }

    public Livro buscarLivroPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Livro> buscarLivrosPorDisponibilidade(boolean disponibilidade) {
        return repository.findByDisponivel(disponibilidade);
    }

    public List<Livro> buscarLivrosPorAutor(String nome) {
        return repository.buscarLivrosPorAutor(nome);
    }

    public List<Livro> buscarLivrosPorEditora(String nome) {
        return repository.findByEditora(nome);
    }

    public Livro inserirLivro(Livro livro) {
        return repository.save(livro);
    }

    public Livro editarLivro(Livro livro) {
        return repository.save(livro);
    }

    public void excluirLivro(Long id) {
        repository.deleteById(id);
    }
}
