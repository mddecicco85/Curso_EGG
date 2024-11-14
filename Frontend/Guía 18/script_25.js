
var nombre;
var apellido;

function getFormValores() {
    let vectorNombres = document.getElementsByName("nombre");
    nombre = vectorNombres[0].getAttribute("value");
    
    let vectorApellidos = document.getElementsByName("apellido");
    apellido = vectorApellidos[0].getAttribute("value");
    
    console.log("El nombre es " + nombre + ".");
    console.log("El apellido es " + apellido + ".");
};

