package com.webbackend.gerenciador_cursos.services;

import com.webbackend.gerenciador_cursos.models.Curso;
import com.webbackend.gerenciador_cursos.repositories.CursoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso buscarCursoPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @Transactional
    public Curso criarCurso(Curso curso) {
        curso.setDataCriacao(LocalDate.now());
        return cursoRepository.save(curso);
    }

    @Transactional
    public Curso atualizarCurso(Long id, Curso cursoAtualizado) {
        Optional<Curso> cursoExistente = cursoRepository.findById(id);
        if (cursoExistente.isPresent()) {
            Curso curso = cursoExistente.get();
            curso.setNome(cursoAtualizado.getNome());
            curso.setCargaHoraria(cursoAtualizado.getCargaHoraria());
            return cursoRepository.save(curso);
        }
        return null;
    }

    @Transactional
    public void removerCurso(Long id) {
        if (!cursoRepository.existsById(id)) {
            throw new RuntimeException("Curso não encontrado.");
        }
        cursoRepository.deleteById(id);
    }

    public List<Curso> buscarPorNome(String nome) {
        return cursoRepository.findByNomeContaining(nome);
    }

    public List<Curso> buscarPorCargaHorariaMaiorQue(Integer cargaHorariaMinima) {
        return cursoRepository.findByCargaHorariaGreaterThan(cargaHorariaMinima);
    }

    public List<Curso> buscarCursosCriadosAntesDe(LocalDate data) {
        return cursoRepository.findCursosCriadosAntesDe(data);
    }
}
