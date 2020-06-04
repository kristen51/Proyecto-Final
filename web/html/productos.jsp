<%-- 
    Document   : productos
    Created on : 04-jun-2020, 14:12:49
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
        <!DOCTYPE html>
<html lang="es">
<head>

	<meta charset= "utf-8">
	<meta name="description" content="Inicio">
	<meta name="author" content="Manuel Alted Cánovas">
	<meta name="keywords" content="Estructura_basica">
	<link rel="stylesheet" href="../css/style.css"/>
	<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
	
	<title> Productos </title>

	<link href="https://fonts.googleapis.com/css?family=Electrolize&display=swap" rel="stylesheet">

	<link rel="apple-touch-icon" sizes="57x57" href="../favicons/apple-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="../favicons/apple-icon-60x60.png">
	<link rel="apple-touch-icon" sizes="72x72" href="../favicons/apple-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="../favicons/apple-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="../favicons/apple-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="../favicons/apple-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="../favicons/apple-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="../favicons/apple-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="../favicons/apple-icon-180x180.png">
	<link rel="icon" type="image/png" sizes="192x192"  href="../favicons/android-icon-192x192.png">
	<link rel="icon" type="image/png" sizes="32x32" href="../favicons/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="96x96" href="../favicons/favicon-96x96.png">
	<link rel="icon" type="image/png" sizes="16x16" href="../favicons/favicon-16x16.png">
	<link rel="manifest" href="../favicons/manifest.json">
	<meta name="msapplication-TileColor" content="#ffffff">
	<meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
	<meta name="theme-color" content="#ffffff">

	<script src="../js/script.js"/></script>

</head>

<body>
	<main>
		<div class="mainnofooter">
			<header class="headerprincipal">
				<h1><img src="../img/logo.png" alt="logo"> </h1>
			</header>
			<nav>
				<ul id="color2">
				<li><a href="../index.jsp">Inicio</a></li>
				<li><a href="multimedia.jsp">Rutinas</a></li>
				<li><a href="servicios.jsp">Servicios</a></li>
				<li><a href="centros.jsp">Centros </a></li>
				<li class="activo"><a href="productos.jsp">Productos</a></li>
				<li><a href="form.jsp">Contáctanos</a>

                                </ul>
			</nav>
		</div>
            
            <div class="productos">

            <c:forEach items="${applicationScope.productos.getProductos()}" var="producto">
                <div class="producto">
                    <p>${producto.getNombre()}</p>
                    
                    <p>${producto.getPrecio()}</p>
       
                    <p>${producto.getCantidad()}</p>
                 
                <img src="${producto.getRutaFotos()}" alt="foto"></a>
                </div>
                <br>
            </c:forEach>    
                                   
            </div>

            
	</main>
    </body>
</html>
