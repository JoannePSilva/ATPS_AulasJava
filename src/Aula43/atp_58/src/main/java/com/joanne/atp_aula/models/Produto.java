package com.joanne.atp_aula.models;

public class Produto {
    
    private String descricao;
    private String requisitosObrigatorios;
    private String requisitosDesejaveis;
    private String remuneracao;
    private String localDeTrabalho;
    private int id;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }


   public String getDescricao() {
       return this.descricao;
   }

   public void setDescricao(String descricao) {
       this.descricao = descricao;
   }

   public String getRequisitosObrigatorios() {
       return this.requisitosObrigatorios;
   }

   public void setRequisitosObrigatorios(String requisitosObrigatorios) {
       this.requisitosObrigatorios = requisitosObrigatorios;
   }

   public String getRequisitosDesejaveis() {
       return this.requisitosDesejaveis;
   }

   public void setRequisitosDesejaveis(String requisitosDesejaveis) {
       this.requisitosDesejaveis = requisitosDesejaveis;
   }

   public String getRemuneracao() {
       return this.remuneracao;
   }

   public void setRemuneracao(String remuneracao) {
       this.remuneracao = remuneracao;
   }

   public String getLocalDeTrabalho() {
       return this.localDeTrabalho;
   }

   public void setLocalDeTrabalho(String localDeTrabalho) {
       this.localDeTrabalho = localDeTrabalho;
   }

   }