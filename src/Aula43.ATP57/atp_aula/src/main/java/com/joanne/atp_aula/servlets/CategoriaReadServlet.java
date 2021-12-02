package com.joanne.atp_aula.servlets;
import java.io.IOException;
import java.util.ArrayList;

import com.joanne.atp_aula.models.Categoria;
import com.joanne.atp_aula.dao.CategoriaDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ArrayList<Categoria> categorias;
      CategoriaDao dao =  new CategoriaDao();
      String nome = req.getParameter("nome");
        
         if(nome != null && nome != ""){
            categorias = dao.read();
         } 
         else{
           categorias = dao.read();
         }
        
          req.setAttribute("categorias", categorias);
          RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp");
          rd.forward(req, resp);
        }
    }
