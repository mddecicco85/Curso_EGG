
var frase = prompt("Ingrese una frase.");

var vectorFrase = frase.split(" ");

var max = "";
var largo = max.length;

for (var palabra of vectorFrase) {
    if (palabra.length >= largo) {
        largo = palabra.length;
        max = palabra;
    }
};

console.log("La palabra más larga es " + max);