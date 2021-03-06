package Aula35_to.ATP48.Views;
//Receber o id da categoria a ser deletada através da variável
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class View3{
    public static void main(String[] args) {
        try {
            int id = 4;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");
            PreparedStatement prepStatement = conn.prepareStatement("delete from categoria where id > ?", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setInt(1, id);

            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println("O número de linhas afetadas foi: " + linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
