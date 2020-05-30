<%-- 
    Document   : pruebaBD
    Created on : 30-may-2020, 12:47:14
    Author     : Propietario
--%>

<%@page import="Usuarios.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Usuarios.ListaUsuarios"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            
                       
            ListaUsuarios lista = (ListaUsuarios)application.getAttribute("usuariosRegistrados");
            
           
                     
            System.out.println("adasdasdasdasd");
   
        %>
        
        
        
        
        <form method="post" action="AltaSocio">
            <c:forEach items="${applicationScope.usuariosRegistrados.getUsuarios()}" var="usuario">
                <input type="radio" name="socios" value="${usuario.getCodigo()}"> ${usuario.datosUsuario()} hola<br/>
            </c:forEach>
           <input type="submit" value="Hacer socio"/>
        </form>
            
            <p>${lista.prueba()}<p>
        
    </body>
</html>
