
var radio = prompt("Ingrese el radio de un círculo.");

var perimetro = 2 * Math.PI * radio;

var area = Math.PI * Math.pow(radio, 2);

var mensaje = `El círculo tiene área ${area} y perímetro ${perimetro}.`

alert(mensaje);