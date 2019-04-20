/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function comprobar(){
    var nombre, ap, email, contra, fecha, us, tipo;
    
    nombre= document.getElementById("nombre").value;
    ap = document.getElementById("apellido").value;
    email = document.getElementById("email").value;
    contra = document.getElementById("contra").value;
    fecha = document.getElementById("fecha").value;
    us = document.getElementById("usuario").value;
    tipo = document.getElementById("tipousuario").value;
    
    
    if(nombre === "" || ap === "" || email === "" || contra === "" || fecha === "" || us === "" || tipo === ""){
        alert("Es necesario que todos los campos esten completos");
        return false;
    }
    
}

function error(){
    var contra, usuario;
    contra= document.getElementById("contra").value;
    usuario = document.getElementById("usuario").value;
    if( contra === "" || usuario === ""){
        alert("Es necesario llenar los campos");
        return false;
    }
     
    
}

