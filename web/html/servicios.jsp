<%-- 
    Document   : servicios
    Created on : 04-jun-2020, 14:13:44
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset= "utf-8">
	<meta name="description" content="Servicios">
	<meta name="author" content="Manuel Alted Cánovas">
	<meta name="keywords" content="Estructura_basica">
	<link rel="stylesheet" href="../css/style.css"/>
	<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
	<title> DriveFit </title>
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
				<li class="activo"><a href="servicios.jsp">Servicios</a></li>
				<li><a href="centros.jsp">Centros </a></li>
				<li><a href="productos.jsp">Productos</a></li>
				<li><a href="form.jsp">Contáctanos</a>

			</ul>


		</nav>
	
	</div>

	<div class="miembros">
	<div class=miembro>
		<img src="../img/aikido2.jpg" width=250px height=240px>
		<div class="miembro-texto">
			<h2>Aikido</h2>
		
			
			<p>Aikido, cuyo significado en japonés es "forma de armonizar la energía", es un arte marcial y un sistema de autodefensa que se asemeja a los métodos de lucha Jujitsu y judo en su uso de técnicas de torsión y lanzamiento y en su objetivo de convertir la fuerza y el ímpetu del atacante contra sí mismo. La presión sobre los centros nerviosos vitales se utiliza en este deporte y los practicantes de aikido entrenan para someter al contrincante en lugar de mutilar o matar, pero muchos de sus movimientos pueden ser mortales.</p>
		</div>
    </div>

    <div class=miembro>
		<img src="../img/zumba2.jpg" width=250px height=240px>
		<div class="miembro-texto">
			<h2>Zumba</h2>
		
			
			<p>Zumba es una disciplina deportiva que se imparte en clases dirigidas en la que se realizan ejercicios aeróbicos al ritmo de música latina (merengue, samba, reggaeton, cumbia y salsa) con la finalidad de perder peso de forma divertida y mejorar el estado de ánimo de los deportistas.</p>
		</div>
    </div>

    <div class=miembro>
		<img src="../img/boxeo2.jpg" width=250px height=240px>
		<div class="miembro-texto">
			<h2>Boxeo</h2>
		
			
			<p>El boxeo es un deporte donde dos personas se enfrentan a golpes de puño con sus manos cubiertas por guantes y de acuerdo a determinadas reglas. El ganador es aquel que logra derribar a su rival sin que este pueda levantarse antes de una cuenta de diez o que, al término del combate, suma más puntos que el oponente según la opinión de un jurado.</p>
		</div>
    </div>

    <div class=miembro>
		<img src="../img/meditacion2.jpg" width=250px height=240px>
		<div class="miembro-texto">
			<h2>Meditacion</h2>
				
			<p>La meditación es una práctica en la cual el individuo entrena la mente o induce un modo de conciencia, ya sea para conseguir algún beneficio o para reconocer mentalmente un contenido sin sentirse identificado con ese contenido, o como un fin en sí misma.</p>
		</div>
    </div>
    
    <div class=miembro>
		<img src="../img/pilates2.jpg" width=250px height=240px>
		<div class="miembro-texto">
			<h2>Pilates</h2>
				
			<p>Pilates es un método de ejercicio y movimiento físico diseñado para estirar, fortalecer y equilibrar el cuerpo. Con la práctica sistemática de ejercicios específicos junto con los patrones de respiración, Pilates ha demostrado tener un valor incalculable no sólo para las personas que quieren mantener su condición física, sino también como un importante complemento a la práctica deportiva y rehabilitación física de todo tipo.</p>
		</div>
    </div>

	</div>

	</main>


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

</html>
