package Aula36.ATP48.Views;
//Altere a classe usada na 47 para prepareStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View{
    public static void main(String[] args) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");

            prepStatement.execute();
            ResultSet ids = prepStatement.getResultSet();

            //Impressão
            while(ids.next()){
                int id = ids.getInt("id");
                String nome = ids.getString("nome");
                System.out.printf("ID: %d | Nome: %s \n", id, nome);
                System.out.println("--------------------------------");
            }

            conn.close(); //fechar conexão
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
