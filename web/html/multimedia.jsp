<%-- 
    Document   : multimedia
    Created on : 04-jun-2020, 13:25:56
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset= "utf-8">
	<meta name="description" content="Multimedia">
	<meta name="author" content="Manuel Alted Cánovas">
	<meta name="keywords" content="Estructura_basica">
	<link rel="stylesheet" href="../css/style.css"/>
	<meta name="viewport" content="width=device-width,initial-scale=1.0"/>

	<title> Multimedia </title>

	<link href="https://fonts.googleapis.com/css?family=Electrolize&display=swap" rel="stylesheet">
	<link rel="apple-touch-icon" sizes="57x57" href="../favicons/favicons2/apple-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="../favicons/favicons2/apple-icon-60x60.png">
	<link rel="apple-touch-icon" sizes="72x72" href="../favicons/favicons2/apple-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="../favicons/favicons2/apple-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="../favicons/favicons2/apple-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="../favicons/favicons2/apple-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="../favicons/favicons2/apple-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="../favicons/favicons2/apple-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="../favicons/favicons2/apple-icon-180x180.png">
	<link rel="icon" type="image/png" sizes="192x192"  href="../favicons/favicons2/android-icon-192x192.png">
	<link rel="icon" type="image/png" sizes="32x32" href="../favicons/favicons2/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="96x96" href="../favicons/favicons2/favicon-96x96.png">
	<link rel="icon" type="image/png" sizes="16x16" href="../favicons/favicons2/favicon-16x16.png">
	<link rel="manifest" href="../favicons/favicons2/manifest.json">
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
				<li class="activo"><a href="html/multimedia.jsp">Rutinas</a></li>
				<li><a href="servicios.jsp">Servicios</a></li>
				<li><a href="centros.jsp">Centros </a></li>
				<li><a href="productos.jsp">Productos</a></li>
				<li><a href="form.jsp">Contáctanos</a>

			</ul>
		</nav>
</div>

<br>
<div id="titulomultimedia">
<h2>     Actualizamos nuestro contenido gratuito semanalmente</h2>
</div>

<div class= videos>

<video id="video" width="720" height="400" controls autoplay>
	
	<source src="../video/athlean.mp4">s


</video>


<video id="video" width="720" height="400" controls>

	
	<source src="../video/jeffNippard.mp4" type="">


</video>

<video id="video" width="720" height="400" controls loop>

	<source src="../video/squatUniversity.mp4">

	
</video>

<video id="video" width="720" height="400" controls>

	<source src="../video/cardio.mp4">

	
</video>

</div>






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
			<div id="salida"></div>
		</footer>

</main>



</body>
