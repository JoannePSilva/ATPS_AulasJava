package aula36.src.view;

import java.sql.Connection;
import java.sql.SQLException;

import aula36.src.dao.CategoriaDao;
import aula36.src.dao.ConnectionFactory;
import aula36.src.model.Categoria;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao  = new CategoriaDao(conn);
            Categoria model = new Categoria(30, "TesteAlteracaoDao");
            System.out.println(dao.update(model));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
