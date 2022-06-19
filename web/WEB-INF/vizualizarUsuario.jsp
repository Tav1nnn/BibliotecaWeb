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
        <title>Vizualizar Usuario</title>
        <link rel="stylesheet" href="css/everyone.css">
    </head>
    <body>
        
        <div class="center">
            <div class="tabela">
                <table class="borda">
                    <tr>
                        <th class="borda">#</th>
                        <th class="borda">Nome</th>
                        <th class="borda">Email</th>
                        <th class="borda">Curso</th>
                        <th class="borda">Idade</th>
                        
                    </tr>
                    <c:forEach varStatus="status" var="model" items="${usuarios}">
                          <tr>
                              <td class="borda">${status.index}</td>
                              <td class="borda">${model.nome}</td>
                              <td class="borda">${model.email}</td>
                              <td class="borda">${model.curso}</td>
                              <td class="borda">${model.idade}</td>
                             
                              <td><a href="RemoverUsuario?indice=${status.index}" class="remover">Remover</a></td>
                              <td><a href="TrazerUsuario?indice=${status.index}" class="remover">Editar</a></td>
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
