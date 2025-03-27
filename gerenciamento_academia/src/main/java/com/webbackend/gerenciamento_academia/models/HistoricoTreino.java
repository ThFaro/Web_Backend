package com.webbackend.gerenciamento_academia.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "historico_treinos")
public class HistoricoTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String descricao;

    @Column(nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    public HistoricoTreino() {
        this.data = LocalDate.now();
    }

    public HistoricoTreino(String descricao, Aluno aluno) {
        this.descricao = descricao;
        this.data = LocalDate.now();
        this.aluno = aluno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
