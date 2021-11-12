package Aula34.ATP46.View;
//Insira um novo produto na tabela e imprima o id gerado.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewInsert {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");

            Statement statement = conn.createStatement();
            String sql = "insert into produto(nome, descricao, preco, categoria_id)values('tela', 'apple', 800, 4)";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();

            //Imprimir resultado
            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println("Id gerado: " + id);
            }

            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

