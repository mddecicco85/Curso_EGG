
var parrafo = document.getElementById("parrafo");

var texto = parrafo.textContent;

console.log(texto);

var ant = -1;

for (let i = 0; i < texto.length; i++) {
    if (texto.substring(i, i + 1) == " ") {
        let pos = i;
        if (pos - 1 - (ant + 1) + 1 > 8) {
            console.log("j");
            parrafo.textContent = "hola";
        }
        ant = pos;
    }
};


