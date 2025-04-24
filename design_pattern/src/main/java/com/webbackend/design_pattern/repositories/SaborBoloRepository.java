package com.webbackend.design_pattern.repositories;

import com.webbackend.design_pattern.models.SaborBolo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaborBoloRepository extends JpaRepository<SaborBolo, Long> {
    List<SaborBolo> findByNomeContainingIgnoreCase(String nome);

}
