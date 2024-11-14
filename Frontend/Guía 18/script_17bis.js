let vector = [1, 2, 3, 4, 5];

vector.splice(3,2);

vector.forEach(function mostrarVector(elemento, indice) {
    console.log("v[" + indice + "]= " + elemento);
});

console.log(vector.length);