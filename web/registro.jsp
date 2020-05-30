<%-- 
    Document   : registro
    Created on : 21-may-2020, 13:03:49
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post" action="Registros">
            <label for="nombreUsuario">Nombre de Usuario</label><input type="text" name="nombreUsuario"/><br/>
            <label for="correoElectrónico">Correo Electrónico</label><input type="text" name="correoElectrónico"/><br/>
            <label for="nombreReal">Nombre</label><input type="text" name="nombreReal"/><br/>
            <label for="apellidos">Apellidos</label><input type="text" name="apellidos"/><br/>
            <label for="contraseña">Contraseña </label> <input type="text" name="contraseña" value="${Cliente.getCodigoNuevoCliente()}" disabled="true"/><br/> <br/>
            <input type="submit" value="Enviar"/>
        </form>
        
    </body>
</html>
