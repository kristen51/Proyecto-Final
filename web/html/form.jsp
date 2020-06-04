<%-- 
    Document   : form
    Created on : 04-jun-2020, 13:26:12
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset= "utf-8">
	<meta name="description" content="Formulario DriveFit">
	<meta name="author" content="Manuel Alted Cánovas">
	<meta name="keywords" content="Estructura_basica">
	<link rel="stylesheet" href="../css/style.css"/>
	<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
	

	<title> Formulario </title>

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
				<li><a href="productos.jsp">Productos</a></li>
				<li class="activo"><a href="html/form.jsp">Contáctanos</a>

			</ul>
		</nav>
</div>

<div id="form">
	<p>Apúntate a nuestro boletín para tener acceso a más contenido</p>

	<form method="post" action="Formularios">
           <c:if test="${empty usuarioLogeado}">
           <label for="nombreReal">Nombre</label><input type="text" name="nombreReal"/><br/><br/>
           <label for="apellidos">Apellidos</label><input type="text" name="apellidos"/><br/><br/>
           </c:if>
           <label for="email">Correo Electrónico</label><input type="text" name="email"/><br/><br/>
           <label for="comentario">Comentario</label><input type="text" name="comentario"/><br/><br/>
           <label for="telefono">Teléfono</label><input type="text" name="telefono"/><br/><br/>
             <br/>
            <input type="submit" value="Enviar"/>
        </form>
              
        <c:if test="${not empty mensajeError}">
            <div class="error">${mensajeError}  </div>
        </c:if>
        <c:if test="${not empty mensajeOK}">
            <div class="error">${mensajeOK}  </div>
        </c:if>

	<br><br>
	<img src="../img/posando2.jpg" alt="foto de arnold" width=30% height=30%>
	<img src="../img/posando1.jpg" alt="foto de arnold" width=50% height=50%>

		<br>
    <button type="button" onclick="Purple()">Violeta</button>
    <button type="button" onclick="Orange()">Naranja</button>
    <button type="button" onclick="Green()">Verde</button>
	<footer id="color">

			<img src="../img/logo.png" alt="logo">
			<div class="datos">
			<p>Direccion: C/Pascual Garcia nº1 3ºC, Novelda </p>
			<p>Correo electrónico: driveFit@gmail.com </p>
			<p>Fax: España 313-414-515 , use +420313414515@faxmaker.com</p>
			<p>Teléfono: 633500421</p>
			</div>
			<div class="socialicons">
				<img src="../img/facebook3.png" alt="facebook" height="60" width="60"/> 	  
				<img src="../img/twitter.png" alt="twitter" height="60" width="60" />				  
				<img src="../img/instagram.svg" alt="instagram" height="60" width="60"/>
				  
			</div>

			<p>Copyright © 2019. Todos los derechos reservados</p>
		</footer>
</div>
</main>
</body>
</html>
