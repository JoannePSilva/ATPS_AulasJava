package com.joanne.atp_aula.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import com.joanne.atp_aula.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    
    @Override //req = requisição - solicitação do usuário
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      Categoria categoria = new Categoria();

      categoria.setNome (req.getParameter("nome"));
      categoria.setDescricao(req.getParameter("nome"));
     

        //response - resposta do servidor ao cliente
        PrintWriter out = resp.getWriter();
        out.printf(" Categoria  -- Categoria Model = %s, %s", categoria.getNome(), categoria.getDescricao());
    }
}