package com.webbackend.supermercado.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id", nullable = false)
    private Long clienteId;

    @Column(name = "produto_id", nullable = false)
    private Long produtoId;

    @Column(name = "descricao_produto", nullable = false, length = 200)
    private String descricaoProduto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(name = "preco_produto", nullable = false)
    private Double precoProduto;

    @Column(name = "valor_total", nullable = false)
    private Double valorTotal;

    @Column(name = "data_venda", nullable = false)
    private LocalDateTime dataVenda;

    public Venda() {
        this.dataVenda = LocalDateTime.now();
    }

    public Venda(Long clienteId, Long produtoId, String descricaoProduto, Integer quantidade, Double precoProduto) {
        this.clienteId = clienteId;
        this.produtoId = produtoId;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoProduto = precoProduto;
        this.valorTotal = precoProduto * quantidade;
        this.dataVenda = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
}
