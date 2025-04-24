package com.atividadeac2biblioteca.atividade_ac2_biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
}
