package com.joanne.atp_aula.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.joanne.atp_aula.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProdutoServlet {
@WebServlet(urlPatterns = "/produto")
public class Categoria extends HttpServlet{
    
  @Override //req = requisição - solicitação do usuário
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
      PrintWriter out = resp.getWriter();
        Produto produto = new Produto();

        produto.setNome(req.getParameter("nome"));
        String parametroValor = req.getParameter("valor");
        String idString = req.getParameter("id_categoria");

        if (parametroValor != null && idString != null) {
            produto.setValor(Float.parseFloat(parametroValor)); 
            produto.setIdCategoria(Integer.parseInt(idString));

            out.printf("Produtos - Prod = %s | ID = %s | Preco: %f", produto.getNome(), produto.getIdCategoria(), produto.getValor());

        } else if(idString != null){
            int id = Integer.parseInt(idString);    
            out.printf("Modulo Produtos - Prod = %s | ID: %d", produto.getNome(), produto.getIdCategoria());

        } else {

            out.printf("Produtos - Prod = %s", produto.getNome());

        }
  }
}
    
}
