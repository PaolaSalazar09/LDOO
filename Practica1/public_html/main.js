
window.onscroll = function() {myFunction();};
//obtener el navbar
var navbar = document.getElementById("navbar");

// posision del navbar
var sticky = navbar.offsetTop;

//sticky
function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
  } else {
    navbar.classList.remove("sticky");
  }
}
window.onload = inicio;

//boton para limpiar
function inicio(){
    document.getElementById("limpiar").addEventListener('click',limpiar);
}

function limpiar(){
    var activo = document.activeElement.reset();
    activo.innerHTML = "";
}

function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}


