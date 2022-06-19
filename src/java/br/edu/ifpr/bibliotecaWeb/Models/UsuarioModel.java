/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bibliotecaWeb.Models;

import br.edu.ifpr.bibliotecaWeb.DAOs.UsuarioDAO;
import br.edu.ifpr.bibliotecaWeb.Entities.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author otavio
 */
public class UsuarioModel {
   static ArrayList<Usuario> usuarios = new ArrayList(); 
   
   public void add(Usuario u) throws SQLException{
      
       if(u.getEmail() == null || u.getEmail() == ""){
           return;
       }
       if (u.getSenha() == null || u.getSenha() == "") {
           return;
       }
       
       UsuarioDAO dao = new UsuarioDAO();
       dao.adcionar(u);
      
   }
    public ArrayList<Usuario> getusuario() {
        return usuarios;
    }
    
    public void remove(int index){
        usuarios.remove(index);
    }
    
    public Usuario buscarIndex (int index){
        Usuario usuario = usuarios.get(index);
        return usuario;
    }
    
    public void editar (int index, Usuario usuarioEditado){
        usuarios.set(index, usuarioEditado);
    }
}
