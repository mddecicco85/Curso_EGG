
let v1 = [];
let v2 = [];

for (let i = 0; i < 5; i++) {
    v1[i] = Math.round(Math.random() * 10);
    v2[i] = Math.round(Math.random() * 10);
}

v1.forEach(function mostrarVector(elemento, indice) {
    console.log("v1[" + indice + "]= " + elemento);
});

for (let valor of v2) {
    console.log(valor);
}

v2.forEach(function mostrarVector(elemento, indice) {
    console.log("v2[" + indice + "]= " + elemento);
});

