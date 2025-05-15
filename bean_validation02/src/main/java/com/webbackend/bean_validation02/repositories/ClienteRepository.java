package com.webbackend.bean_validation02.repositories;

import com.webbackend.bean_validation02.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
