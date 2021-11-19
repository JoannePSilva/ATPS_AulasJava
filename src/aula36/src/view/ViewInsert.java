package aula36.src.view;

import java.sql.Connection;
import java.sql.SQLException;

import aula36.src.dao.CategoriaDao;
import aula36.src.dao.ConnectionFactory;
import aula36.src.model.Categoria;

public class ViewInsert {
    public static void main(String[] args) {       
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat1 = new Categoria("Test1Dao");
            Categoria cat2 = new Categoria("Test2Dao");

            dao.create(cat1);
            dao.create(cat2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
