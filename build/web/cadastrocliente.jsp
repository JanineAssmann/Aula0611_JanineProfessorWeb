<%-- 
    Document   : cadastrocliente
    Created on : 11 de nov de 2020, 09:46:02
    Author     : Janine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Locacar - cadastro cliente</title>
    </head>
    <body>
        <h1>Cadastro cliente</h1>
        <hr />
        <form action="recebedadoscliente.jsp" method="POST">
            <label>Informe o CPF</label>
            <input type="text" name="cpf" /> 
            
            <br />
            <label>Informe a Nome</label>
            <input type="text" name="nome" />
            
            <br />
            <label>Informe E-Mail</label>
            <input type="text" name="email" />
            
            <br />
            <label>Informe Número do Cartão</label>
            <input type="text" name="numcartao" />
             
             <hr />
            <input type="submit" value="Salvar" />
        </form>
    </body>
</html>
