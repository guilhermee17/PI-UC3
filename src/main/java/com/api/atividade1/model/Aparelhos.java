
package com.api.atividade1.model;

public class Aparelhos {

   
    private Long id;
    private String nome;
    private int quantidade;
    private double custoCompra;
    private int tempoPresente;

    
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

    public int getTempoPresente() {
        return tempoPresente;
    }

    public void setTempoPresente(int tempoPresente) {
        this.tempoPresente = tempoPresente;
    }
}