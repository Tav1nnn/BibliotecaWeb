package br.edu.ifpr.bibliotecaWeb.Entities;


public class Usuario {
    
    private String nome;
    private String email;
    private String senha;
    private String curso;
    private int idade;

    public Usuario(String nome, String email, String senha, String curso, int idade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.curso = curso;
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
