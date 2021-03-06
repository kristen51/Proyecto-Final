<%-- 
    Document   : centros
    Created on : 04-jun-2020, 14:14:08
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>

	<meta charset= "utf-8">
	<meta name="description" content="Inicio">
	<meta name="author" content="Manuel Alted Cánovas">
	<meta name="keywords" content="Estructura_basica">
	<link rel="stylesheet" href="../css/style.css"/>
	<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
	
	
	<title> Centros </title>

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
				<li class="activo"><a href="centros.jsp">Centros </a></li>
				<li><a href="productos.jsp">Productos</a></li>
				<li><a href="form.jsp">Contáctanos</a>

			</ul>
			</nav>
		</div>
	</main>

<div class="mapa">
<figure> 


	<img src="../img/mapa.jpg"> 


</figure>
<div>
<ul>
	<li>C/Alvarez de Sotomayor nº2</li>
	<li>C/del Alcalde Henche de la Plata nº1</li>
	<li>C/Abedul nº8</li>
	<li>C/del Ámbar</li>
	<li>C/de la Nube nº5</li>
	<li>C/las Naranjas nº34</li>
	<li>C/de Nuestra Señora del Pilar nº8</li>
<ul>
</div>
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

</body>
