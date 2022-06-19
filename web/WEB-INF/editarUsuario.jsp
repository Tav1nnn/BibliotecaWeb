<%-- 
    Document   : editarUsuario
    Created on : Jun 1, 2022, 7:43:37 AM
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
        <title>Editar Usuario</title>
    </head>
    <body>
        <h1>Editar de Usuario</h1>
        <div class="container">
            
            <form method="post" action="EditarUsuario">
                <h2>Nome:</h2>
                <input type="text" name="nome" value="${usuario.nome}" class="input">

                <h2>Email:</h2>
                <input type="text" name="email" value="${usuario.email}" class="input">

                <h2>Senha:</h2>
                <input type="password" name="senha" value="${usuario.senha}" class="input">

                <h2>Curso:</h2>
                <input type="text" name="curso" value="${usuario.curso}" class="input">

                <h2>Idade:</h2>
                <input type="number" name="idade" value="${usuario.idade}" class="input">
                
                <div class="btn-center">
                    <input type="submit" value="Editar" class="btn2">
                </div>
            </form>
            
        </div>
        <div class="btn-center">
            <a href="index.html" class="btn2">Volvar</a>
        </div>
    </body>
</html>
