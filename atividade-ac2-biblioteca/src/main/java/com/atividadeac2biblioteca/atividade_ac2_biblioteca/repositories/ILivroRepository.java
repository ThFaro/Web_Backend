package com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Livro;
import java.util.List;


public interface ILivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByDisponivel(boolean disponivel);

    @Query("SELECT l FROM livros l INNER JOIN l.autores a WHERE a.nome = :nome")
    List<Livro> buscarLivrosPorAutor(String nome);

    List<Livro> findByEditora(String editora);
}
