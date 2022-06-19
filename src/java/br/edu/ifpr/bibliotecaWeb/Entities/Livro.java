package br.edu.ifpr.bibliotecaWeb.Entities;

public class Livro {
    
    private String titulo;
    private int paginas;
    private String autor;
    private String genero;
    private String editora;
    private int anoPubli;
    private boolean statusEmprestimo;

    public Livro() {
        
    }

    public Livro(String titulo, int paginas, String autor, String genero, String editora, int anoPubli) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.anoPubli = anoPubli;
        this.statusEmprestimo = false;
    }

    public boolean isStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(boolean statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

     
    @Override
    public String toString(){
        return getTitulo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if(paginas > 0){
            this.paginas = paginas;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }
}
    
    




