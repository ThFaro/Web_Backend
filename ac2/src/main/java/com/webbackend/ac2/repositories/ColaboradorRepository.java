package com.webbackend.ac2.repositories;

import com.webbackend.ac2.models.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
    Optional<Colaborador> findByEmail(String email);
    Optional<Colaborador> findByCargo(String cargo);
}
