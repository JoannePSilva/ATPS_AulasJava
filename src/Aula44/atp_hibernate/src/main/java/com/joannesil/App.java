package com.joannesil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.joannesil.model.Categoria;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Banco" );
        Categoria model = new Categoria();
        model.setNome("Início JPA");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        EntityManager em = factory.createEntityManager();
        //nome da classe, não da tabela
        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList(); //gera uma lista de categoria
        
        for (Categoria categoria : lista) {
            System.out.printf("%d - %s", categoria.getId(), categoria.getNome());
        }
        em.getTransaction().begin(); // "startar"
        em.persist(model);// persistir o model
        em.getTransaction().commit();// uma forma de controlar a transação
    }
}
