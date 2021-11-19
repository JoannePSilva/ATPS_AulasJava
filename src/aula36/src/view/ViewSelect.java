package aula36.src.view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import aula36.src.dao.CategoriaDao;
import aula36.src.dao.ConnectionFactory;
import aula36.src.model.Categoria;

public class ViewSelect {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            CategoriaDao dao = new CategoriaDao(conn);

            dao.list().forEach( c->System.out.println() );
              
            for (Categoria c : dao.list()) {
               System.out.println(c);
            }
            ArrayList<Categoria> lista = dao.list();
            for (int i=0; i< lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
