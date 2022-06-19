<%-- 
    Document   : cadastroLivro
    Created on : 6 de mai. de 2022, 21:57:33
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
        <link rel="stylesheet" href="css/everyone.css">
    </head>
     <body>
        <h1>Cadastro de Usuario</h1>
        <div class="container">
            
            <form method="post" action="CadastroUsuario">
                <h2>Nome:</h2>
                <input type="text" name="nome" class="input">

                <h2>Email:</h2>
                <input type="text" name="email" class="input">

                <h2>Senha:</h2>
                <input type="password" name="senha" class="input">

                <h2>Curso:</h2>
                <input type="text" name="curso" class="input">

                <h2>Idade:</h2>
                <input type="number" name="idade" class="input">
                
                <div class="btn-center">
                    <input type="submit" value="Salvar" class="btn2">
                </div>
            
            </form>
        </div>
        
        <div class="btn-center">
            <a href="index.html" class="btn2">Volvar</a>
        </div>
    </body>
</html>
