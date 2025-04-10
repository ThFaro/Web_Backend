package com.webbackend.petshop.services;

import com.webbackend.petshop.models.Servico;
import com.webbackend.petshop.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> listarTodos() {
        return servicoRepository.findAll();
    }

    public Servico salvar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public List<Servico> buscarPorTipo(String tipo) {
        return servicoRepository.findByTipo(tipo);
    }

    public List<Servico> buscarPorPrecoMenorOuIgual(Double preco) {
        return servicoRepository.findByPrecoLessThanEqual(preco);
    }
}
