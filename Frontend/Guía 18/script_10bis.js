const invertirCadena = cadena => cadena.split("").reverse().join("");

//split separa al string letra por letra (porque no tiene caracter entre las comillas) y lo convierte en un vector.
//reverse invierte el orden del vector.
//join hace lo opuesto de split, une los elementos del vector en un string (sin separación entre ellos porque las comillas están vacías).
 
let cadena = prompt("Ingrese una palabra.");
console.log("Cadena:", invertirCadena(cadena));