package Aula35_to.ATP50.Views;
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
            String sql = "DELETE FROM categoria where id > ?";
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2609");
           
                try(PreparedStatement prepStatement = conn.prepareStatement(sql)){
                    prepStatement.setInt(1, id);
                    prepStatement.execute();
                    int linhasAfetadas = prepStatement.getUpdateCount();
                    System.out.println(linhasAfetadas);

                } catch (Exception e){
                    e.printStackTrace();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    
