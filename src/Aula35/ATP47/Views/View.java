/*
_  Crie uma conexão com o banco de dados postgresql utilizando JDBC(java.sql.*).
_  Liste id e nome de todas as linhas da tabela Categoria.*/
package Aula35.ATP47.Views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View{
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");

            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM categoria");
            ResultSet result = statement.getResultSet();

            //Imprimir resultado
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("%d - %s \n", id, nome);
            }

            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
