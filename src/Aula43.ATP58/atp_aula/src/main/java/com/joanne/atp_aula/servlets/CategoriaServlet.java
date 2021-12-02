package com.joanne.atp_aula.servlets;


import java.io.IOException;

import com.joanne.atp_aula.models.Categoria;
import com.joanne.atp_aula.dao.CategoriaDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    
    @Override //req = requisição - solicitação do usuário
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      CategoriaDao dao = new CategoriaDao();
      Categoria model = new Categoria();

      model.setNome (req.getParameter("nome"));
      model.setDescricao(req.getParameter("descricao"));
      int id = dao.insert(model);
      model.setId(id);
     

      
        req.setAttribute("id", model.getId());  
        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");
        rd.forward(req, resp);
        
        // não é mais necessário //PrintWriter out = resp.getWriter();//out.printf("Categoria Salva com sucesso!\n Id gerado %d", model.getId());
}
}
