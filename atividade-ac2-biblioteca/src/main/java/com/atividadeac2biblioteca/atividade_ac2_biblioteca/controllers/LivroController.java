package com.atividadeac2biblioteca.atividade_ac2_biblioteca.controllers;

import java.util.List;

import org.hibernate.sql.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.dtos.InsertLivroDto;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Livro;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.LivroService;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.AutorService;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService service;

    @Autowired
    private AutorService autorService;

    @PostMapping
    public String inserir(@RequestBody InsertLivroDto command) {

        var livro = new Livro();

        for (var autorId : command.getAutoresId()) {
            var autor = autorService.buscarAutorPorId(autorId);
            if (autor == null)
                return String.format("Autor com id %d não encontrado!", autorId);

            livro.getAutores().add(autor);
        }

        livro.setTitulo(command.getTitulo());
        livro.setEditora(command.getEditora());
        livro.setDataPublicacao(command.getDataPublicacao());
        livro.setDisponivel(command.isDisponivel());

        service.inserirLivro(livro);
        return "Livro inserido com sucesso!";
    }

    @PutMapping
    public Livro editar(@RequestBody Livro livro) {
        return service.editarLivro(livro);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluirLivro(id);
        return "Livro excluido com sucesso!";
    }

    @GetMapping
    public List<Livro> listarLivros() {
        return service.listarLivros();
    }

    @GetMapping("/{id}")
    public Livro buscarLivroPorId(@PathVariable Long id) {
        return service.buscarLivroPorId(id);
    }

    @GetMapping("/disponibilidade/{disponibilidade}")
    public List<Livro> buscarLivrosPorDisponibilidade(@PathVariable boolean disponibilidade) {
        return service.buscarLivrosPorDisponibilidade(disponibilidade);
    }

    @GetMapping("/autor/{nome}")
    public List<Livro> buscarLivrosPorAutor(@PathVariable String nome) {
        return service.buscarLivrosPorAutor(nome);
    }

    @GetMapping("/editora/{nome}")
    public List<Livro> buscarLivrosPorEditora(@PathVariable String nome) {
        return service.buscarLivrosPorEditora(nome);
    }
}