package com.webbackend.lombok.controllers;

import com.webbackend.lombok.models.Pessoa;
import com.webbackend.lombok.services.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listarTodas() {
        return pessoaService.listarTodas();
    }

    @PostMapping
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return pessoaService.salvar(pessoa);
    }

    @GetMapping("/salario/maior/{valor}")
    public List<Pessoa> buscarSalarioMaior(@PathVariable Double valor) {
        return pessoaService.buscarPorSalarioMaiorQue(valor);
    }

    @GetMapping("/salario/menor-ou-igual/{valor}")
    public List<Pessoa> buscarSalarioMenorOuIgual(@PathVariable Double valor) {
        return pessoaService.buscarPorSalarioMenorIgual(valor);
    }

    @GetMapping("/nome/{nome}")
    public List<Pessoa> buscarPorNome(@PathVariable String nome) {
        return pessoaService.buscarPorNomeComecandoCom(nome);
    }

}


