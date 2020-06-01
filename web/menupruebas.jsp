<%-- 
    Document   : menupruebas
    Created on : 01-jun-2020, 18:23:31
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
        
        <a href="/Proyecto_Final/usuario/registro.jsp">Registro</a>
        <a href="/Proyecto_Final/usuario/login.jsp">Login</a>
        <a href="/Proyecto_Final/usuario/formulario.jsp">Formulario</a>
        
        <br><br><br>
        
        <c:if test="${not empty mensajeOK}">
            <div class="error">${mensajeOK}  </div>
        </c:if>
        
        <h2>Usuarios</h2>
        
        <form method="post" action="AltaSocio">
            <c:forEach items="${applicationScope.usuariosRegistrados.getUsuarios()}" var="usuario">
                <input type="radio" name="socios" value="${usuario.getCodigo()}"> ${usuario.datosUsuario()}<br/>
            </c:forEach>
           <input type="submit" value="Hacer socio"/>
        </form>
        
        
    </body>
</html>
