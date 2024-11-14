
var persona = {
    nombre : "Martín",
    edad : 38,
    sexo : "M",
    peso : 60,
    altura : 1.73,
};

var datos = [];

for (let atributo in persona) {
    console.log(atributo);
    datos.push(atributo);
};

var vector = [];

for (let atributo in persona) {
    console.log(persona[atributo]);
    vector.push(persona[atributo]);
};

vector.forEach(function mostrarVector(elemento, indice) {
    console.log("v[" + indice + "]= " + elemento);
});