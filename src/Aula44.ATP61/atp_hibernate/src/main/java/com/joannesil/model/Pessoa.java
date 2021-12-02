package com.joannesil.model;

public class Pessoa {

    private String nome;
    private int id;
   
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String cpf;
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
    
}
