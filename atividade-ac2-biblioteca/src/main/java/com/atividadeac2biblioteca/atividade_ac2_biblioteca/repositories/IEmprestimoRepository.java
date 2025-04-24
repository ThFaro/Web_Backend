package com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Emprestimo;

public interface IEmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    @Query("SELECT e FROM emprestimos e INNER JOIN e.cliente c WHERE c.nome = :nome")
    List<Emprestimo> buscarTodosOsEmprestimosDeCliente(String nome);

    @Query("SELECT e FROM emprestimos e INNER JOIN e.livro l WHERE l.titulo = :titulo")
    List<Emprestimo> buscarTodosOsEmprestimosDeLivro(String titulo);

    @Query("SELECT e FROM emprestimos e WHERE e.dataDevolucao IS NULL AND e.dataEmprestimo < CURRENT_DATE")
    List<Emprestimo> buscarTodosOsEmprestimosEmAtraso();
}
