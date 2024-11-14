
var frase = prompt("Ingrese una frase.");

var frase_mod = "";

for (let i = 0; i < frase.length; i++) {
    let letra = frase.substring(i, i + 1);
    frase_mod = frase_mod + letra + " ";
}

alert(frase_mod + ".");