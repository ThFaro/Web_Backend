package com.webbackend.design_pattern.services;

import com.webbackend.design_pattern.models.Pedido;
import com.webbackend.design_pattern.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> buscarPorStatus(String status) {
        return pedidoRepository.findByStatus(status);
    }

    public List<Pedido> buscarPorNomeCliente(String nome) {
        return pedidoRepository.findByClienteNomeContainingIgnoreCase(nome);
    }

    public Pedido atualizarStatus(Long id, String novoStatus) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        if (pedido.isPresent()) {
            Pedido p = pedido.get();
            p.setStatus(novoStatus);
            return pedidoRepository.save(p);
        }
        return null;
    }
}
