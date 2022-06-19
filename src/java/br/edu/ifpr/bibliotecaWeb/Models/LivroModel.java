/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bibliotecaWeb.Models;

import br.edu.ifpr.bibliotecaWeb.Entities.Livro;
import java.util.ArrayList;

/**
 *
 * @author otavio
 */
public class LivroModel {
    static ArrayList<Livro> livros = new ArrayList();
    
    public void add(Livro l){
        livros.add(l);
    }
    
    public ArrayList<Livro> getlivro() {
        return livros;
    }
    
    public void remove(int index){
        livros.remove(index);
    }
    
    public void alterarStatus(int index, boolean status){
       
        Livro l = livros.get(index);
        
        l.setStatusEmprestimo(status);
        
        livros.set(index, l);
    }
    
    public Livro buscarIndex(int Index){
        Livro livro = livros.get(Index);
        return livro;
    }
    
    public void editarLivro(int index, Livro livroEditado){
        livros.set(index, livroEditado);
    }
    
}
