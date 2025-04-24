package com.webbackend.design_pattern.controllers;

import com.webbackend.design_pattern.models.SaborBolo;
import com.webbackend.design_pattern.services.SaborBoloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sabores")
public class SaborBoloController {

    private final SaborBoloService saborBoloService;

    public SaborBoloController(SaborBoloService saborBoloService) {
        this.saborBoloService = saborBoloService;
    }

    @GetMapping
    public List<SaborBolo> listarTodos() {
        return saborBoloService.listarTodos();
    }

    @PostMapping
    public SaborBolo salvar(@RequestBody SaborBolo saborBolo) {
        return saborBoloService.salvar(saborBolo);
    }

    @GetMapping("/nome/{nome}")
    public List<SaborBolo> buscarPorNome(@PathVariable String nome) {
        return saborBoloService.buscarPorNome(nome);
    }
}
