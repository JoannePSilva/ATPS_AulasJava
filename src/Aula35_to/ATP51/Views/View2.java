package Aula35_to.ATP50.Views;
//Recebendo os nomes das categorias a serem alteradas através de variáveis e troca do statement para PreparedStatement
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Aula35_to.ATP50.model.Categoria;

public class View2 {
    public static void main(String[] args) {
        Categoria cat = new Categoria();
        try (Connection conn = new ConnectionFactory().getConnection()){

            String nome = "UpdatePrepStatement";
            
           
            String sql = "UPDATE categoria SET nome  = ? where id = ? or id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, cat.getNome());
            prepStatement.setInt(3, cat.getId());

            prepStatement.execute();

            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println("O número de linhas afetadas foi: " + linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}