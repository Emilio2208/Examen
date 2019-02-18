<%-- 
    Document   : Formulario
    Created on : 21-ene-2019, 16:54:40
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
  
      <% String colorFuentes=(String)request.getAttribute("colorFuentes"); %>
      <% String colorFondo=(String)request.getAttribute("colorFondo"); %>
      Value is:
      <div style="color:<%=colorFuentes%>; background:<%=colorFondo%> ">
          <%= colorFuentes %>
         
           </div>
          <%=new java.util.Date()%>
          
          <form method="GET">
              <label>Color de letra</label>
              <select name = "colorFuentes">
  <option value="Red">Red</option>
  <option value="Blue">Blue</option>
  <option value="Green">Green</option>
  <option value="White">White</option>
</select>
               <label>Color de fondo</label>
             <select name = "colorFondo">
  <option value="Red">Red</option>
  <option value="Blue">Blue</option>
  <option value="Green">Green</option>
  <option value="White">White</option>
</select>          
               <input type="submit" value="Enviar" />
          </form>
          
    </body>
</html>
