package com.webbackend.gerenciador_tarefas.services;

import com.webbackend.gerenciador_tarefas.models.Tarefa;
import com.webbackend.gerenciador_tarefas.repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.salvar(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.listarTodas();
    }

    public Tarefa buscarTarefaPorId(Long id) {
        return tarefaRepository.buscarPorId(id);
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefaAtualizada) {
        Tarefa tarefaExistente = tarefaRepository.buscarPorId(id);
        if (tarefaExistente != null) {
            tarefaExistente.setDescricao(tarefaAtualizada.getDescricao());
            tarefaExistente.setConcluida(tarefaAtualizada.isConcluida());
            return tarefaRepository.salvar(tarefaExistente);
        }
        return null;
    }

    public boolean deletarTarefa(Long id) {
        Tarefa tarefa = tarefaRepository.buscarPorId(id);
        if (tarefa != null) {
            tarefaRepository.deletar(id);
            return true;
        }
        return false;
    }
}
