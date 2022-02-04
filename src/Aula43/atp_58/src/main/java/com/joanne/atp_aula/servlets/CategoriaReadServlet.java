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

@WebServlet(urlPatterns = "/categoria/categoria-lista")
public class CategoriaReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao =  new CategoriaDao();
        
        ArrayList<Categoria> categorias = dao.read();
        req.setAttribute("categoria", categorias);
        //for (Categoria model : dao.read()) {
          //  out.printf("%d - %s \n", model.getId(), model.getNome());

          RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp");
          rd.forward(req, resp);
        }
    }
