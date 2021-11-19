package Aula35_to.ATP50.Views;
//Receber parâmetros - nome e descrição através de variáveis e troca do Statement para preparedStatemente
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View1 {
    public static void main(String[] args) {
        try {
            String nome = "Caribe";
            String descricao = "Praias";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");

            PreparedStatement prepStatement = conn.prepareStatement("insert into categoria(nome, descricao)values(?,?)", Statement.RETURN_GENERATED_KEYS);

            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);

            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();


            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println("Categoria com id " + id + " inserido com sucesso!");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
