package com.webbackend.gerenciador_cursos.repositories;

import com.webbackend.gerenciador_cursos.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    List<Curso> findByNomeContaining(String nome);

    List<Curso> findByCargaHorariaGreaterThan(Integer cargaHorariaMinima);

    @Query("SELECT c FROM Curso c WHERE c.dataCriacao < :data")
    List<Curso> findCursosCriadosAntesDe(LocalDate data);
}
