package com.atividadeac2biblioteca.atividade_ac2_biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Autor;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories.IAutorRepository;

@Service
public class AutorService {
    @Autowired
    private IAutorRepository repository;

    public List<Autor> listarAutores() {
        return repository.findAll();
    }

    public Autor buscarAutorPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Autor inserirAutor(Autor autor) {
        return repository.save(autor);
    }

    public Autor editarAutor(Autor autor) {
        return repository.save(autor);
    }

    public void excluirAutor(Long id) {
        repository.deleteById(id);
    }
}
