<%-- 
    Document   : login
    Created on : 21-may-2020, 13:03:30
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form method="post" action="Logins">
            <label for="identificador">Nombre de Usuario o Email</label><input type="text" name="identificador"/><br/>
            <label for="contraseña">Contraseña</label><input type="text" name="contraseña"/><br/>
            <br/>
            <input type="submit" value="Enviar"/>
        </form>
        
        <c:if test="${not empty mensajeError}">
            <div class="error">${mensajeError}  </div>
        </c:if>
    </body>
</html>
