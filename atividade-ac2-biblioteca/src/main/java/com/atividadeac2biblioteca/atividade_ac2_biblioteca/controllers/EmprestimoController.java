package com.atividadeac2biblioteca.atividade_ac2_biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividadeac2biblioteca.atividade_ac2_biblioteca.dtos.InsertEmprestimoDto;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.models.Emprestimo;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.EmprestimoService;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.LivroService;
import com.atividadeac2biblioteca.atividade_ac2_biblioteca.services.ClienteService;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoService service;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private LivroService livroService;

    @PostMapping
    public String inserir(@RequestBody InsertEmprestimoDto dto) {
        var cliente = clienteService.buscarClientePorId(dto.getClienteId());
        if (cliente == null)
            return "Cliente não encontrado!";

        var livro = livroService.buscarLivroPorId(dto.getLivroId());
        if (livro == null)
            return "Livro não encontrado!";

        var emprestimo = new Emprestimo();
        emprestimo.setCliente(cliente);
        emprestimo.setLivro(livro);
        emprestimo.setDataEmprestimo(dto.getDataEmprestimo());
        emprestimo.setDataPrevista(dto.getDataPrevista());
        emprestimo.setDataDevolucao(dto.getDataDevolucao());

        service.inserirEmprestimo(emprestimo);
        return "Emprestimo inserido com sucesso!";
    }

    @PutMapping
    public Emprestimo editar(@RequestBody Emprestimo emprestimo) {
        return service.editarEmprestimo(emprestimo);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluirEmprestimo(id);
        return "Emprestimo excluido com sucesso!";
    }

    @GetMapping
    public List<Emprestimo> listarEmprestimos() {
        return service.listarEmprestimos();
    }

    @GetMapping("/{id}")
    public Emprestimo buscarEmprestimoPorId(@PathVariable Long id) {
        return service.buscarEmprestimoPorId(id);
    }

    @GetMapping("/cliente/{nome}")
    public List<Emprestimo> buscarTodosOsEmprestimosDeCliente(@PathVariable String nome) {
        return service.buscarTodosOsEmprestimosDeCliente(nome);
    }

    @GetMapping("/livro/{nome}")
    public List<Emprestimo> buscarTodosOsEmprestimosDeLivro(@PathVariable String nome) {
        return service.buscarTodosOsEmprestimosDeLivro(nome);
    }

    @GetMapping("/atraso")
    public List<Emprestimo> buscarTodosOsEmprestimosEmAtraso(@PathVariable String nome) {
        return service.buscarTodosOsEmprestimosEmAtraso();
    }
}