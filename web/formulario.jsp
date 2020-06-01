<%-- 
    Document   : formulario
    Created on : 01-jun-2020, 10:19:09
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de contacto</title>
    </head>
    <body>
        
        
        <form method="post" action="Formularios">
           <c:if test="${empty usuarioLogeado}">
           <label for="nombreReal">Nombre</label><input type="text" name="nombreReal"/><br/>
           <label for="apellidos">Apellidos</label><input type="text" name="apellidos"/><br/>
           </c:if>
           <label for="email">Correo Electrónico</label><input type="text" name="correoElectrónico"/><br/>
           <label for="comentario">Comentario</label><input type="text" name="comentario"/><br/>
           <label for="telefono">Teléfono</label><input type="text" name="telefono"/><br/>
             <br/>
            <input type="submit" value="Enviar"/>
        </form>
              
        <c:if test="${not empty mensajeError}">
            <div class="error">${mensajeError}  </div>
        </c:if>
      
    </body>
</html>
