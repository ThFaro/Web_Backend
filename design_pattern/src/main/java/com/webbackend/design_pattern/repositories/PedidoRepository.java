package com.webbackend.design_pattern.repositories;

import com.webbackend.design_pattern.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(String status);
    List<Pedido> findByClienteNomeContainingIgnoreCase(String nome);
}
