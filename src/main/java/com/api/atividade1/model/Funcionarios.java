package com.api.atividade1.model;

public class Funcionarios {

    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String CTPS;

   
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCarteiraTrabalho() {
        return CTPS;
    }

    public void setCarteiraTrabalho(String CTPS) {
        this.CTPS = CTPS;
    }
}