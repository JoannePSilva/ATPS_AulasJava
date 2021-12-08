


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns ="/produto")
public class Produto extends HttpServlet{
    
    @Override //req = requisição - solicitação do usuário
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //PROTOCOLO HTTP/HTTPS -> request e response

        //response - resposta do servidor ao cliente
        PrintWriter out = resp.getWriter();
        out.println("ATP53 - Utilizando Servlet - Produto");
    }
}
