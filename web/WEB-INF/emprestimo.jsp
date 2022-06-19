<%-- 
    Document   : Emprestimo
    Created on : May 18, 2022, 3:19:48 PM
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/everyone.css">
        <title>Emprestimo</title>
    </head>
    <body>
        <div class="center">
            <h1>Emprestimo</h1>
            
            <form method="post" action="EmprestimoLivro">
                <h2>Usuario</h2>
                <select name="usuarios" class="select">
                    <c:forEach varStatus="status" var="model" items="${usuarios}">
                        <option value="${status.index}">${model.nome}</option>
                    </c:forEach>
                </select>
                
                <h2>Livros</h2>
                <select name="livros" class="select">
                    
                    <c:forEach varStatus="status" var="model" items="${livros}">
                        <c:if test="${model.statusEmprestimo == false}">
                            <option value="${status.index}">${model.titulo}</option>
                        </c:if>
                       
                   </c:forEach>
                   
                </select>
                <div class="btn-center">
                   <input type="submit" value="Emprestar" class="btn2">      
               </div>
            </form>
            <div class="paddingBtn"><a href="index.html" class="btn2">Menu</a></div>
        </div>
    </body>
</html>
