<%-- 
    Document   : vizualizarLivro
    Created on : May 12, 2022, 7:50:17 AM
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vizualizar Livro</title>
        <link rel="stylesheet" href="css/everyone.css">
    </head>
    <body>
        
        <div class="center">
            <div class="tabela">
                <table>
                    <tr>
                        <th>#</th>
                        <th>Titulo</th>
                        <th>Numero de Paginas</th>
                        <th>Nome Autor</th>
                        <th>Genero</th>
                        <th>Editora</th>
                        <th>Ano de Publicação</th>
                    </tr>
                    <c:forEach varStatus="status" var="model" items="${livros}">
                          <tr>
                              <td>${status.index}</td>
                              <td>${model.titulo}</td>
                              <td>${model.paginas}</td>
                              <td>${model.autor}</td>
                              <td>${model.genero}</td>
                              <td>${model.editora}</td>
                              <td>${model.anoPubli}</td>
                              <td><a href="RemoverLivro?indice=${status.index}" class="remover">Remover</a></td>
                               <td><a href="TrazerLivro?indice=${status.index}" class="remover">Editar</a></td>
                          </tr>
                      </c:forEach>
                </table>
                <div class="btn-center">
                    <a href="index.html" class="btn2">Volta Menu</a>
                    
                </div>
            </div>
        </div>
    </body>
</html>
