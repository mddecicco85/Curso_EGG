const invertirCadena = cadena => {
    let nuevaCadena = "";
    for (let x = cadena.length - 1; x >= 0; x--) {
        nuevaCadena += cadena[x];
    }
    return nuevaCadena;
}

let cadena = prompt("Ingrese una palabra.");
console.log("Cadena:", invertirCadena(cadena));