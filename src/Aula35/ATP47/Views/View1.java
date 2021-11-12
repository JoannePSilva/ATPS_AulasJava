package Aula35.ATP47.Views;

/*Insira uma nova Categoria e imprima o id gerado.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View1 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");

            Statement statement = conn.createStatement();
            String sql = "insert into categoria(nome, descricao)values('frios', 'alimentos sob baixa temperatura')";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();

            //Impressão
            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

