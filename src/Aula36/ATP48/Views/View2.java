package Aula36.ATP48.Views;
//Recebendo os nomes das categorias a serem alteradas através de variáveis e troca do statement para PreparedStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View2 {
    public static void main(String[] args) {
        try {
            String nome = "livros";
            int id1 = 1;
            int id2 = 2;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");
            PreparedStatement prepStatement = conn.prepareStatement("update categoria SET nome  = ? where id = ? or id = ?");
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id1);
            prepStatement.setInt(3, id2);

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