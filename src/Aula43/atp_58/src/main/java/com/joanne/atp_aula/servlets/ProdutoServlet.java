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

        produto.setDescricao(req.getParameter("texto"));
        produto.setRequisitosObrigatorios(req.getParameter("ro"));
        produto.setRequisitosDesejaveis(req.getParameter("rd"));
        produto.setRemuneracao(req.getParameter("remuneracao"));
        produto.setLocalDeTrabalho(req.getParameter("ro"));

       
        String idString = req.getParameter("id");

        if(idString != null){
            int id = Integer.parseInt(idString);    
            out.printf("Cadastrado - ID = %s | Descrição = %s  | Requisitos Obrigatórios: %s | Requisitos Desejáveis: %s |Remuneração: %s | Local de trabalho  %s", produto.getDescricao(), produto.getRequisitosObrigatorios(), produto.getRequisitosDesejaveis(), produto.getRemuneracao(), produto.getLocalDeTrabalho());

        } else {

            out.printf("Cadastro - Cadastro = %s", produto.getId());

        }
  }
}
    
}
