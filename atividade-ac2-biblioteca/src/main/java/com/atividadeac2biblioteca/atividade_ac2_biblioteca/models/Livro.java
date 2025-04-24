package com.atividadeac2biblioteca.atividade_ac2_biblioteca.models;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "livros")
@Table(name = "livros")
public class Livro {
    @Id
    @Column(name = "id_livro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "livro_autor",
        joinColumns = @JoinColumn(name = "id_livro"),
        inverseJoinColumns = @JoinColumn(name = "id_autor")
    )
    private List<Autor> autores;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private LocalDate dataPublicacao;

    @Column(nullable = false)
    private String editora;

    @Column(nullable = false)
    private String sinopse;

    @Column(nullable = false)
    private int quantidadePaginas;

    @Column(nullable = false)
    private boolean disponivel = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Livro() {
    }

    public Livro(Long id, List<Autor> autores, String titulo, LocalDate dataPublicacao, String editora, String sinopse,
            int quantidadePaginas, boolean disponivel) {
        this.id = id;
        this.autores = autores;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
        this.sinopse = sinopse;
        this.quantidadePaginas = quantidadePaginas;
        this.disponivel = disponivel;
    }
}
