/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.bibliotecaWeb.Servlet;

import br.edu.ifpr.bibliotecaWeb.Entities.Livro;
import br.edu.ifpr.bibliotecaWeb.Models.LivroModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author otavio
 */
@WebServlet(urlPatterns = {"/CadastroLivro"})
public class CadastroLivro extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        String titulo, nomeAutor, genero, editora;
        int numeroPag, anoPubli;
        
        titulo = request.getParameter("titulo");
        numeroPag = Integer.parseInt(request.getParameter("numeroPag"));
        nomeAutor = request.getParameter("nomeAutor");
        genero = request.getParameter("genero");
        editora = request.getParameter("editora");
        anoPubli = Integer.parseInt(request.getParameter("anoPubli"));
        
        LivroModel model = new LivroModel();
        
        model.add(new Livro(titulo, numeroPag, nomeAutor, genero, editora, anoPubli));
        
 
          request.getRequestDispatcher("WEB-INF/cadastroLivro.jsp").
                forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
