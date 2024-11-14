
var frase = prompt("Ingrese una frase.");

var inicial = 0;
var max = 0;

function palabraMasLarga(frase) {
    for (i = 0; i < frase.length ; i++) {
        if (frase.substring(i, i + 1) == " ") {
            let final = i;
            let long = final - inicial + 1;
            if (long >= max) {
                max = long;
            }
        }
    }
}