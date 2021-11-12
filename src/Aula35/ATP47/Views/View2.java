package Aula35.ATP47.Views;

/*Altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View2{
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");

            Statement statement = conn.createStatement();
            String sql = "update categoria SET nome  = 'esporte' where id = 1 or id = 2";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
