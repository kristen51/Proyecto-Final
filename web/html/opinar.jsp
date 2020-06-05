<%-- 
    Document   : opinar
    Created on : 05-jun-2020, 17:31:20
    Author     : Manuel
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
        
        <form method="post" action="Opiniones">
            <textarea name="opinion"></textarea><br>
            1<input type="radio" name="puntuacion" value="1">
            2<input type="radio" name="puntuacion" value="2">
            3<input type="radio" name="puntuacion" value="3">
            4<input type="radio" name="puntuacion" value="4">
            5<input type="radio" name="puntuacion" value="5"><br>
            <input type="submit" value="Opina">
        </form>
        <br>
        <c:forEach items="${applicationScope.opiniones.getOpiniones()}" var="opinion">
            <p>Usuario: ${usuarioLogeado}</p>
            <p>${opinion.getDescripcion()}<p>
                <br><br>
        </c:forEach>
      
    </body>
</html>
