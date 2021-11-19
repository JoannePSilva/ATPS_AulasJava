package Aula35_to.ATP49.Views;
//Recebendo os nomes das categorias a serem alteradas através de variáveis e troca do statement para PreparedStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View2 {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){

            String nome = "UpdatePrepStatement";
            int id1 = 1;

        
           
            String sql = "UPDATE categoria SET nome  = ? where id = ? or id = ?";
            
            PreparedStatement prepStatement = conn.prepareStatement();
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