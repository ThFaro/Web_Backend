package com.atividadeac2biblioteca.atividade_ac2_biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Autor;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService service;

    @PostMapping
    public String inserir(@RequestBody Autor autor) {
        service.inserirAutor(autor);
        return "Autor inserido com sucesso!";
    }

    @PutMapping
    public Autor editar(@RequestBody Autor autor) {
        return service.editarAutor(autor);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluirAutor(id);
        return "Autor excluido com sucesso!";
    }

    @GetMapping
    public List<Autor> listarAutors() {
        return service.listarAutores();
    }

    @GetMapping("/{id}")
    public Autor buscarAutorPorId(@PathVariable Long id) {
        return service.buscarAutorPorId(id);
    }
}