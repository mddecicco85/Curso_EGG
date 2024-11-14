
var matriz = [[3], [6], [9], [12], [15]];

var vector = matriz.flat();

vector.push(vector[0] + vector[4]);

vector.shift();

console.log(vector);

vector.forEach(function mostrarVector(elemento, indice) {
    console.log("v[" + indice + "]= " + elemento);
});