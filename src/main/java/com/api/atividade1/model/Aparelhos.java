
package com.api.atividade1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Aparelhos")
public class Aparelhos {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private double custoCompra;
    private String tempoPresente;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCustoCompra() {
        return custoCompra;
    }

    public void setCustoCompra(double custoCompra) {
        this.custoCompra = custoCompra;
    }

    public String getTempoPresente() {
        return tempoPresente;
    }

    public void setTempoPresente(String tempoPresente) {
        this.tempoPresente = tempoPresente;
    }
}