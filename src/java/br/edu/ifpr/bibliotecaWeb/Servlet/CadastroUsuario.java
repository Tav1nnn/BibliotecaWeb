/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.bibliotecaWeb.Servlet;

import br.edu.ifpr.bibliotecaWeb.Entities.Usuario;
import br.edu.ifpr.bibliotecaWeb.Models.UsuarioModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(urlPatterns = {"/CadastroUsuario"})
public class CadastroUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("WEB-INF/cadastroUsuario.jsp").
                forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String nome, email, senha, curso;
        int idade;

        nome = request.getParameter("nome");
        email = request.getParameter("email");
        senha = request.getParameter("senha");
        curso = request.getParameter("curso");
        idade = Integer.parseInt(request.getParameter("idade"));
        
       
        
        Usuario u = new Usuario(nome, email, senha, curso, idade);
        
        UsuarioModel model = new UsuarioModel();
        
       try{
           model.add(u);
              request.getRequestDispatcher("WEB-INF/vizualizarUsuario.jsp").
                forward(request, response);
       }catch (Exception e){
           request.setAttribute("mensagem", e.getMessage());
           System.out.println(e.getMessage());
           request.setAttribute("erro", e.getMessage());
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
