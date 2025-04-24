package com.webbackend.design_pattern.services;

import com.webbackend.design_pattern.models.SaborBolo;
import com.webbackend.design_pattern.repositories.SaborBoloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaborBoloService {

    private final SaborBoloRepository saborBoloRepository;

    public SaborBoloService(SaborBoloRepository saborBoloRepository) {
        this.saborBoloRepository = saborBoloRepository;
    }

    public List<SaborBolo> listarTodos() {
        return saborBoloRepository.findAll();
    }

    public SaborBolo salvar(SaborBolo saborBolo) {
        return saborBoloRepository.save(saborBolo);
    }

    public List<SaborBolo> buscarPorNome(String nome) {
        return saborBoloRepository.findByNomeContainingIgnoreCase(nome);
    }
}
