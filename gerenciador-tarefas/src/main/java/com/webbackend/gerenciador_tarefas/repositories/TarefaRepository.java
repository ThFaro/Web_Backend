package com.webbackend.gerenciador_tarefas.repositories;

import com.webbackend.gerenciador_tarefas.models.Tarefa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TarefaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Tarefa> listarTodas() {
        String jpql = "SELECT t FROM Tarefa t";
        TypedQuery<Tarefa> query = entityManager.createQuery(jpql, Tarefa.class);
        return query.getResultList();
    }

    public Tarefa buscarPorId(Long id) {
        return entityManager.find(Tarefa.class, id);
    }

    @Transactional
    public Tarefa salvar(Tarefa tarefa) {
        return entityManager.merge(tarefa);
    }

    @Transactional
    public void deletar(Long id) {
        Tarefa tarefa = entityManager.find(Tarefa.class, id);
        if (tarefa != null) {
            entityManager.remove(tarefa);
        }
    }
}
