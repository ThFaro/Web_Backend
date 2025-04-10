package com.webbackend.supermercado.services;

import com.webbackend.supermercado.models.Venda;
import com.webbackend.supermercado.repositories.VendaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public List<Venda> listarTodas() {
        return vendaRepository.findAll();
    }

    public Venda salvar(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> buscarPorClienteId(Long clienteId) {
        return vendaRepository.findByClienteId(clienteId);
    }


    public List<Venda> buscarPorValorMaiorQue(Double valor) {
        return vendaRepository.findByValorTotalGreaterThan(valor);
    }

    public List<Venda> buscarEntreDatas(LocalDateTime inicio, LocalDateTime fim) {
        return vendaRepository.findByDataVendaBetween(inicio, fim);
    }

    public List<Venda> buscarPorProdutoId(Long produtoId) {
        return vendaRepository.findByProdutoId(produtoId);
    }
}
