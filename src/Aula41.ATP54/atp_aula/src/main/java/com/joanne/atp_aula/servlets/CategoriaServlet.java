package com.joanne.atp_aula.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    
    @Override //req = requisição - solicitação do usuário
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String nome = req.getParameter("nome");

        //response - resposta do servidor ao cliente
        PrintWriter out = resp.getWriter();
        out.printf(" Categoria  -- Nome = %s", nome);
    }
}