function Reloj(){
      //Se guarda la fecha y hora actual en now
      var now = new Date();
      //Se guarda la hora,minutos y segundos de now
      var horas = now.getHours();   
      if (horas.toString().length==1) {horas='0'+horas};
      var minutos = now.getMinutes();  
      if (minutos.toString().length==1) {minutos='0'+minutos};
      var segundos = now.getSeconds();  
      if (segundos.toString().length==1) {segundos='0'+segundos};
      //Se concatena todo para crear el reloj en hora
      hora = horas + ":" + minutos + ":" + segundos;

      /*La variable texto se convierte en lo que haya dentro del id texto
      var texto = document.getElementById('texto');
      Lo que hay dentro del id texto se convierte en lo que haya en la variable
      texto.innerHTML = hora ;*/

      //Con esto sobra para lo que queremos hacer
      document.getElementById('reloj').innerHTML = hora

      //Se actualiza cada 1000 milisegundos, es decir, como un reloj.
      setTimeout("Reloj()",1000);
    }

    //Ejecuta la funcion cuando se cargue la pagina
    window.onload = function() {
      Reloj();
    }

function Purple(){
    document.getElementById("color").style.background ="#660066";
    document.getElementById("color2").style.background ="#660066";
}
function Orange(){
    document.getElementById("color").style.background ="#ff6600";
    document.getElementById("color2").style.background ="#ff6600";
}
function Green(){
    document.getElementById("color").style.background ="#009933";
    document.getElementById("color2").style.background ="#009933";
}



function Visitas(){
if (typeof(Storage) !== "undefined") {
  // Almacenar
  if (localStorage.getItem("visitasto") === null) {
    localStorage.setItem("visitasto", "1");
  } else {
    v = Number(localStorage.getItem("visitasto"))+1;
    localStorage.setItem("visitasto", v);
  }
  if (sessionStorage['visitasesion']) {
    sessionStorage.visitasesion = Number(sessionStorage.visitasesion)+1;
  } else {
    sessionStorage.visitasesion = 1;
  }
// Utilizar
;  visitas="";
  visitas+='Visitas a esta pagina: '+sessionStorage.visitasesion;
  document.getElementById("salida").innerHTML = visitas;
} else {
  document.getElementById("salida").innerHTML = "No soportado.";
}
}

//Aqui se ejecutan las funciones
window.onload = function() {
      Visitas();
      Reloj()
    }

