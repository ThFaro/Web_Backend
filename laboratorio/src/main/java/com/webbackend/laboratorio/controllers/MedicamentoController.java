package com.webbackend.laboratorio.controllers;

import com.webbackend.laboratorio.models.Medicamento;
import com.webbackend.laboratorio.repositories.MedicamentoRepository;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    private final MedicamentoRepository medicamentoRepository;

    public MedicamentoController(MedicamentoRepository medicamentoRepository) {
        this.medicamentoRepository = medicamentoRepository;
    }

    @GetMapping("/nome/{nome}")
    public List<Medicamento> buscarPorNome(@PathVariable String nome) {
        return medicamentoRepository.findByNomeContaining(nome);
    }

    @GetMapping("/laboratorio/{laboratorio}")
    public List<Medicamento> buscarPorLaboratorio(@PathVariable String laboratorio) {
        return medicamentoRepository.findByLaboratorio(laboratorio);
    }

    @GetMapping("/validade/{data}")
    public List<Medicamento> buscarPorDataValidade(@PathVariable String data) {
        LocalDate dataValidade = LocalDate.parse(data);
        return medicamentoRepository.findByDataValidadeBefore(dataValidade);
    }
}
