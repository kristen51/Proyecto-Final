<%-- 
    Document   : index
    Created on : 03-jun-2020, 17:21:13
    Author     : Manuel
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
	<link rel="stylesheet" href="css/style.css"/>
	<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
	
	<title> DriveFit </title>

	<link href="https://fonts.googleapis.com/css?family=Electrolize&display=swap" rel="stylesheet">
	
	<link rel="apple-touch-icon" sizes="57x57" href="favicons/apple-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="favicons/apple-icon-60x60.png">
	<link rel="apple-touch-icon" sizes="72x72" href="favicons/apple-icon-72x72.png">
	<link rel="apple-touch-icon" sizes="76x76" href="favicons/apple-icon-76x76.png">
	<link rel="apple-touch-icon" sizes="114x114" href="favicons/apple-icon-114x114.png">
	<link rel="apple-touch-icon" sizes="120x120" href="favicons/apple-icon-120x120.png">
	<link rel="apple-touch-icon" sizes="144x144" href="favicons/apple-icon-144x144.png">
	<link rel="apple-touch-icon" sizes="152x152" href="favicons/apple-icon-152x152.png">
	<link rel="apple-touch-icon" sizes="180x180" href="favicons/apple-icon-180x180.png">
	<link rel="icon" type="image/png" sizes="192x192"  href="favicons/android-icon-192x192.png">
	<link rel="icon" type="image/png" sizes="32x32" href="favicons/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="96x96" href="favicons/favicon-96x96.png">
	<link rel="icon" type="image/png" sizes="16x16" href="favicons/favicon-16x16.png">
	<link rel="manifest" href="favicons/manifest.json">
	<meta name="msapplication-TileColor" content="#ffffff">
	<meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
	<meta name="theme-color" content="#ffffff">
	
	<script src="js/script.js"/></script>

</head>

<body>
	<main>
            <div class ="funcionalidades">
                    <a href="/Proyecto_Final/registro.jsp">Registro</a>
                    <c:if test ="${empty usuarioLogeado}">
                    <a href="/Proyecto_Final/login.jsp">Login</a>
                    </c:if>
                    
                    <c:if test="${usuarioLogeado == 'admin'}">
                        <a href="/Proyecto_Final/administracionUsuarios.jsp">Administrar Usuarios</a>
                    </c:if>
                    
                    <c:if test ="${not empty usuarioLogeado}">
                    <p>${usuarioLogeado} </p>
                        <form method ="post" action="CerrarSesion">
                            <input type="submit" value ="cerrar sesion"/>
                        </form>
                    </c:if>
                    </div>
   
	<div class="mainsinfooter">
		<header class="headerprincipal">
			<h1><img src="img/logo.png" alt="logo"> </h1>
		</header>
		<nav>
			<ul id="color2">
				<li class="activo"><a href="index.jsp">Inicio</a></li>
				<li><a href="html/multimedia.jsp">Rutinas</a></li>
				<li><a href="html/servicios.jsp">Servicios</a></li>
				<li><a href="html/centros.jsp">Centros </a></li>
				<li><a href="html/productos.jsp">Productos</a></li>
				<li><a href="html/form.jsp">Contáctanos</a>
			</ul>
		</nav>
		<div class ="maincontent">
		<section>
                    
			<div class="grid-container">
		<div class="item1">                   
			<article>				
					<h2 id="bienvenido">Bienvenido/a a DriveFit</h2>
					<img src="img/gym3.jpg" width="700" height="350" alt="gym">			
			</article>
   <div id="reloj">
   </div>
      
		</div>
			<div class="item2">
				<hr>
				<article>			
						<a href="html/multimedia.html">
						<img src="img/workout.jpg" height="200" width="375" alt="workouts">
						<h2 class="sectionheader">Rutinas de entrenamiento </h2></a>					
					<p>Rutinas de entrenamiento que puedes hacer en el gimnasio o en casa sin necesidad de equipamiento.</p>
					<p>Accede a rutinas avanzadas volviendote miembro Premium de DriveFit.</p>				
			</article>
		</div>
		<div class="item3">
			<hr>
			<article>
				<a href="html/servicios.html">
				<img src="img/piscina.jpg" alt="piscinas" width="400" height="210">		    
				<h2 class="sectionheader">Ven a ver nuestros servicios</h2></a>
				<p>Inscribiendote en DriveFit tendras acceso a nuestras todas nuestras clases, incluido acceso ilimitado a nuestras piscinas.</p>				
			</article>
		</div>
		<div class="item4">
			 <hr>
			<article>	<br>			
					<h2> <strong> Apuntate a alguna de nuestras clases </strong> </>
					<br>
					<br>
					<div class="minifotos">
				<figure><img src="img/aikido.jpg" alt="aikido"> <figcaption>Aikido</figcaption> </figure>
				<figure><img src="img/zumba.jpg" alt="zumba"> <figcaption>Zumba</figcaption> </figure>
				<figure><img src="img/pilates.jpg" alt="pilates"> <figcaption>Pilates</figcaption> </figure>
				<figure><img src="img/meditacion.jpg" alt="meditacion"> <figcaption>Meditación</figcaption> </figure>
				<figure><img src="img/boxeo.jpg" alt="boxeo"> <figcaption>Boxeo</figcaption></figure>
				<figure><img src="img/natacion2.jpg" alt="natacion"> <figcaption>Natación</figcaption></figure>
				</div>				
			</article>
		</div>
		</div>
		</section>
	</div>
</div>
</main>		
   <button type="button" onclick="Purple()">Violeta</button>
   <button type="button" onclick="Orange()">Naranja</button>
   <button type="button" onclick="Green()">Verde</button>
		<footer id="color">
			<img src="img/logo.png" alt="logo">
			<div class="datos">
			<p>Direccion: C/Pascual Garcia nº1 3ºC, Novelda </p>
			<p>Correo electrónico: driveFit@gmail.com </p>
			<p>Fax: España 313-414-515 , use +420313414515@faxmaker.com</p>
			<p>Teléfono: 633500421</p>
			</div>
			<div class="socialicons">
				<img src="img/facebook3.png" alt="facebook" height="60" width="60"/> 				  
				<img src="img/twitter.png" alt="twitter" height="60" width="60" />				  
				<img src="img/instagram.svg" alt="instagram" height="60" width="60"/>		   
			</div>
			<p>Copyright © 2019. Todos los derechos reservados</p>
			<div id="salida"></div>
		</footer>
</body>
</html>
