<%-- 
    Document   : recebedadoslocacao
    Created on : 11 de nov de 2020, 08:34:32
    Author     : Janine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String idcarro = request.getParameter("idcarro");
            String cpfcliente = request.getParameter("cpfcliente");
            String dataretirada = request.getParameter("dataretirada");
            
            Locacao locacao = new Locacao();
            locacao.

        %>
    </body>
</html>
