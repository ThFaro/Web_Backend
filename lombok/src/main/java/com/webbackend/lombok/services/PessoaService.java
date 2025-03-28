package com.webbackend.lombok.services;

import com.webbackend.lombok.models.Pessoa;
import com.webbackend.lombok.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> buscarPorSalarioMaiorQue(Double salario) {
        return pessoaRepository.findBySalarioGreaterThan(salario);
    }

    public List<Pessoa> buscarPorSalarioMenorIgual(Double salario) {
        return pessoaRepository.findBySalarioLessThanEqual(salario);
    }

    public List<Pessoa> buscarPorNomeComecandoCom(String nome) {
        return pessoaRepository.findByNomeStartingWith(nome);
    }
}
