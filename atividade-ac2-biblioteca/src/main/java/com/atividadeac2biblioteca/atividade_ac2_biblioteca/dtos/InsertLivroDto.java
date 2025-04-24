package com.atividadeac2biblioteca.atividade_ac2_biblioteca.dtos;

import java.time.LocalDate;
import java.util.List;

public class InsertLivroDto {
    private String titulo;
    private String editora;
    private LocalDate dataPublicacao;
    private boolean disponivel;
    private List<Long> autoresId;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Long> getAutoresId() {
        return autoresId;
    }

    public void setAutoresId(List<Long> autoresId) {
        this.autoresId = autoresId;
    }

    public InsertLivroDto() {
    }

    public InsertLivroDto(String titulo, String editora, LocalDate dataPublicacao, boolean disponivel,
            List<Long> autoresId) {
        this.titulo = titulo;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.disponivel = disponivel;
        this.autoresId = autoresId;
    }

}