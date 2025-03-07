package com.webbackend.projeto_escola.repositories;

import com.webbackend.projeto_escola.models.CategoriaCurso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaCursoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<CategoriaCurso> obterTodos() {
        return entityManager.createQuery("SELECT c FROM CategoriaCurso c", CategoriaCurso.class).getResultList();
    }

    @Transactional
    public CategoriaCurso inserir(CategoriaCurso categoriaCurso) {
        entityManager.persist(categoriaCurso);
        return categoriaCurso;
    }

    public List<CategoriaCurso> obterPorNome(String nome) {
        return entityManager.createQuery("SELECT c FROM CategoriaCurso c WHERE c.nome = :nome", CategoriaCurso.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    @Transactional
    public CategoriaCurso editar(CategoriaCurso categoriaCurso) {
        return entityManager.merge(categoriaCurso);
    }

    @Transactional
    public void excluir(int id) {
        CategoriaCurso categoriaCurso = entityManager.find(CategoriaCurso.class, id);
        if (categoriaCurso != null) {
            entityManager.remove(categoriaCurso);
        }
    }

    @Transactional
    public void excluir(CategoriaCurso categoriaCurso) {
        if (entityManager.contains(categoriaCurso)) {
            entityManager.remove(categoriaCurso);
        } else {
            CategoriaCurso categoriaGerenciada = entityManager.find(CategoriaCurso.class, categoriaCurso.getId());
            if (categoriaGerenciada != null) {
                entityManager.remove(categoriaGerenciada);
            }
        }
    }
}