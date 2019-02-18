<%-- 
    Document   : Resultado.jsp
    Created on : 21-ene-2019, 18:24:21
    Author     : emilioabreumorales
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
        <%= request.getParameter("firstname") %><br>
         <%= request.getParameter("lastname") %><br>
          <%= request.getParameter("country") %><br>
           <%= request.getParameter("subject") %><br>
    </body>
</html>
