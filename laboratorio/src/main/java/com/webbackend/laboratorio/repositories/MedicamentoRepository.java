package com.webbackend.laboratorio.repositories;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;
import com.webbackend.laboratorio.models.Medicamento;

@Repository
public class MedicamentoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Medicamento> findByNomeContaining(String nome) {
        String jpql = "SELECT m FROM Medicamento m WHERE m.nome LIKE :nome";
        TypedQuery<Medicamento> query = entityManager.createQuery(jpql, Medicamento.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public List<Medicamento> findByLaboratorio(String laboratorio) {
        String jpql = "SELECT m FROM Medicamento m WHERE m.laboratorio = :laboratorio";
        TypedQuery<Medicamento> query = entityManager.createQuery(jpql, Medicamento.class);
        query.setParameter("laboratorio", laboratorio);
        return query.getResultList();
    }

    public List<Medicamento> findByDataValidadeBefore(LocalDate data) {
        String jpql = "SELECT m FROM Medicamento m WHERE m.dataValidade < :data";
        TypedQuery<Medicamento> query = entityManager.createQuery(jpql, Medicamento.class);
        query.setParameter("data", data);
        return query.getResultList();
    }
}

/*
•List<Medicamento> findByNomeContaining(String nome);
•List<Medicamento> findByLaboratorio(String laboratorio);
•List<Medicamento> findByDataValidadeBefore(LocalDate data);
 */