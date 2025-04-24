package com.webbackend.ac2.services;

import com.webbackend.ac2.models.Colaborador;
import com.webbackend.ac2.models.Projeto;
import com.webbackend.ac2.repositories.ClienteRepository;
import com.webbackend.ac2.repositories.ColaboradorRepository;
import com.webbackend.ac2.repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository projetoRepository;
    private final ClienteRepository clienteRepository;
    private final ColaboradorRepository colaboradorRepository;

    public ProjetoService(ProjetoRepository projetoRepository, ClienteRepository clienteRepository, ColaboradorRepository colaboradorRepository) {
        this.projetoRepository = projetoRepository;
        this.clienteRepository = clienteRepository;
        this.colaboradorRepository = colaboradorRepository;
    }

    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }

    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public Projeto atualizarStatus(Long id, String status) {
        Optional<Projeto> projetoOptional = projetoRepository.findById(id);
        if (projetoOptional.isPresent()) {
            Projeto projeto = projetoOptional.get();
            projeto.setStatus(status);
            return projetoRepository.save(projeto);
        }
        return null;
    }

    public Projeto atribuirColaboradores(Long projetoId, List<Long> colaboradoresIds) {
        Projeto projeto = projetoRepository.findById(projetoId).orElse(null);
        if (projeto != null) {
            List<Colaborador> colaboradores = colaboradorRepository.findAllById(colaboradoresIds);
            projeto.getColaboradores().addAll(colaboradores);
            return projetoRepository.save(projeto);
        }
        return null;
    }
}
