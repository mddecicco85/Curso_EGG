
let parrafo = document.getElementById("parrafo");

let texto = parrafo.textContent;

console.log(texto);

let vector = [];

vector = texto.split(" ");

console.log(vector);

vector.forEach(e => {
    if (e.length > 8) {
        console.log(e);
    }
});

console.log(vector[0].length);

for (let i = 0; i < vector.length; i++) {
    if (vector[i].length > 8) {
        vector[i] = "<span style=background-color:yellow;>" + vector[i] + "</span>";
    }
};

console.log(vector);

parrafo.innerHTML = vector.join(" ");