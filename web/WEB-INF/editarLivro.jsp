<%-- 
    Document   : editarLivro
    Created on : Jun 3, 2022, 7:34:20 AM
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Livro</title>
        <link rel="stylesheet" href="css/everyone.css">
    </head>
    <body>
       <h1>Editar Livro</h1> 
        <div class="container">
       
            <form method="post" action="EditarLivro">
               <h2>Titulo:</h2> 
                
               <input type="text" name="titulo" value="${livro.titulo}" class="input">
               <h2>Numero de paginas:</h2>
               
               <input type="number" name="numeroPag" value="${livro.paginas}" class="input">
               <h2>Nome autor:</h2>
               
               <input type="text" name="nomeAutor" value="${livro.autor}" class="input">
               <h2>Genero:</h2>
               
               <select name="genero" class="select" >
                   <option value="value="${livro.genero}"${livro.genero}"></option>
                   <option value="fantasia">Fantasia</option>
                   <option value="ficcaoLiteraria">Ficção-Literaria</option>
                   <option value="naoFiccao">Não-Ficção</option>
                   <option value="ficcaoCientifica">Ficção-Cientifica</option>
                   <option value="horror">Horror</option>
                   <option value="suspense">Suspense</option>
                   <option value="romance">Romance</option>
                   <option value="poesia">Poesia</option>
               </select>
               
               <h2>Editora:</h2>
               <input type="text" name="editora" value="${livro.editora}" class="input">
               
               <h2>Ano Publicação:</h2>
               <input type="number" name="anoPubli" value="${livro.anoPubli}" class="input">
               
               <div class="btn-center">
                   <input type="submit" value="Editar" class="btn2">      
               </div>
            </form>    
        </div>
        <div class="btn-center">
            <a href="index.html" class="btn2">Voltar</a>
        </div> 
    </body>
</html>
