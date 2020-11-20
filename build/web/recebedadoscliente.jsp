<%-- 
    Document   : recebedadoscliente
    Created on : 11 de nov de 2020, 09:46:14
    Author     : Janine
--%>

<%@page import="modelos.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Locacar</h1>
        <%
          //recebe os valores da tela HTML  
          String cpf = request.getParameter("cpf");
          String nome = request.getParameter("nome");
          String email = request.getParameter("email");
          String numcartao = request.getParameter("numcartao");
          
          //instancia o carro
          Cliente cliente = new Cliente();
          cliente.setCpf(cpf);
          cliente.setNome(nome);
          cliente.setEmail(email);
          cliente.setNumcartao(numcartao);
          
          if(cliente.salvar()){
              out.write("Cliente salvo com sucesso");
          }
          else {
              out.write("Problemas ao salvar cliente");
          }
        %>
    </body>
</html>