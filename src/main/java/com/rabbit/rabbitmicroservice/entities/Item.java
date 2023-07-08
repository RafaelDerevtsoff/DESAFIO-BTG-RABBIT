package com.rabbit.rabbitmicroservice.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produto;
    private Long quantidade;
    private Double preco;
    @Formula("quantidade * preco")
    private Double total;

    public Double getTotal() {
        return total;
    }


    public Item() {
    }

    public Item(Long id, String produto, Long quantidade, Double preco) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
