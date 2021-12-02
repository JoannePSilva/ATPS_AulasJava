package com.josilva.atp_spring.model;

public class Agencia {
    private String nome;
    private String numeroCC;
    private int id;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroCC() {
        return numeroCC;
    }
    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
