package com.webbackend.projeto_escola.repositories;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import com.webbackend.projeto_escola.models.Curso;

@Repository
public class CursoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Curso inserir(Curso curso) {
        return entityManager.merge(curso);
    }

    @Transactional
    public Curso editar(Curso curso) {
        return entityManager.merge(curso);
    }

    @Transactional
    public void excluir(Curso curso) {
        entityManager.remove(entityManager.contains(curso) ? curso : entityManager.merge(curso));
    }

    public List<Curso> obterTodos() {
        String jpql = "SELECT c FROM Curso c";
        TypedQuery<Curso> query = entityManager.createQuery(jpql, Curso.class);
        return query.getResultList();
    }
}
