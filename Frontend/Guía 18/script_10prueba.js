const invertirCadena = cadena => cadena.split("").reverse().join("");
 
let cadena = prompt("Ingrese una palabra.");
console.log("Cadena:", invertirCadena(cadena));