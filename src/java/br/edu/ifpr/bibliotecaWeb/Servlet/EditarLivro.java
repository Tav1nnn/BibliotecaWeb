/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.bibliotecaWeb.Servlet;

import br.edu.ifpr.bibliotecaWeb.Entities.Livro;
import br.edu.ifpr.bibliotecaWeb.Models.LivroModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author otavio
 */
@WebServlet(name = "EditarLivro", urlPatterns = {"/EditarLivro"})
public class EditarLivro extends HttpServlet {
    
    int index;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
        Livro livroEditado = new Livro (titulo, numeroPag, nomeAutor, genero, editora, anoPubli);
        
        model.editarLivro(index, livroEditado);
        response.sendRedirect("VizualizarLivro");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

}
