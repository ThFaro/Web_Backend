package com.webbackend.gerenciador_cursos.controllers;

import com.webbackend.gerenciador_cursos.models.Curso;
import com.webbackend.gerenciador_cursos.services.CursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarCursoPorId(@PathVariable Long id) {
        Curso curso = cursoService.buscarCursoPorId(id);
        return curso != null ? ResponseEntity.ok(curso) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoService.criarCurso(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> atualizarCurso(@PathVariable Long id, @RequestBody Curso cursoAtualizado) {
        Curso curso = cursoService.atualizarCurso(id, cursoAtualizado);
        return curso != null ? ResponseEntity.ok(curso) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCurso(@PathVariable Long id) {
        try {
            cursoService.removerCurso(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Curso> buscarPorNome(@PathVariable String nome) {
        return cursoService.buscarPorNome(nome);
    }

    @GetMapping("/buscar/carga-horaria/{cargaHoraria}")
    public List<Curso> buscarPorCargaHorariaMaiorQue(@PathVariable Integer cargaHoraria) {
        return cursoService.buscarPorCargaHorariaMaiorQue(cargaHoraria);
    }

    @GetMapping("/buscar/data-criacao/{data}")
    public List<Curso> buscarCursosCriadosAntesDe(@PathVariable String data) {
        LocalDate dataCriacao = LocalDate.parse(data);
        return cursoService.buscarCursosCriadosAntesDe(dataCriacao);
    }
}
