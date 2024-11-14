
var palabra;

var palabra_mod = "";

var invierte = palabra => palabra.substring(3, 4) + palabra.substring(2, 3) + palabra.substring(1, 2) + palabra.substring(0, 1);

var word = prompt("Ingrese una palabra de 4 letras.");

var palabra_inv = invierte(word);

alert(palabra_inv);