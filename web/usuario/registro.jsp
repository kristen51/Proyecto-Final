<%-- 
    Document   : registro
    Created on : 21-may-2020, 13:03:49
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        
        <form method="post" action="Registros">
            <label for="nombreUsuario">Nombre de Usuario</label><input type="text" name="nombreUsuario"/><br/>
            <label for="email">Correo Electrónico</label><input type="text" name="email"/><br/>
            <label for="password">Contraseña </label> <input type="text" name="password"/><br/>
            <label for="nombreReal">Nombre</label><input type="text" name="nombreReal"/><br/>
            <label for="apellidos">Apellidos</label><input type="text" name="apellidos"/><br/>
             <br/>
            <input type="submit" value="Enviar"/>
        </form>
              
        <c:if test="${not empty mensajeError}">
            <div class="error">${mensajeError}  </div>
        </c:if>
            
            
        
    </body>
</html>