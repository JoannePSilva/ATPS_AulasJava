package com.joannesil.dao;

import java.util.List;
import javax.persistence.EntityManager;
import com.joannesil.model.Pessoa;



public class PessoaDao {
    private EntityManager entityManager;

    public PessoaDao() {
        this.entityManager = new ConnectionFactory().getConnection();    
    }

    public int create(Pessoa p){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(p);        
        this.entityManager.getTransaction().commit();
        return p.getId();
    }

    public List<Pessoa> read(){
        return this.entityManager
            .createQuery("SELECT p FROM Pessoa p", Pessoa.class)
            .getResultList();
    }

    public void update(Pessoa p){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(p);        
        this.entityManager.getTransaction().commit();
    }
    public void delete(int id){
        Pessoa p = this.entityManager.find(Pessoa.class, id);
        if(p != null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(p);        
            this.entityManager.getTransaction().commit();
        }        
    }
}

    
