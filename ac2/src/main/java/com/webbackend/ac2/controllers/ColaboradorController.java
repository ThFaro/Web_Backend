package com.webbackend.ac2.controllers;

import com.webbackend.ac2.models.Colaborador;
import com.webbackend.ac2.services.ColaboradorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @GetMapping
    public List<Colaborador> listarTodos() {
        return colaboradorService.listarTodos();
    }

    @PostMapping
    public Colaborador salvar(@RequestBody Colaborador colaborador) {
        return colaboradorService.salvar(colaborador);
    }
}
