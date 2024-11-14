
class Persona {
    nombre;
    edad;
    sexo;
    peso;
    altura;
}

var p = new Persona();

p.nombre = "Martín";
p.edad = 38;
p.sexo = "M";
p.peso = 60;
p.altura = 1.73;

var datos = [];

for (let atributo in p) {
    console.log(atributo);
    datos.push(atributo);
};

var vector = [];

for (let atributo in p) {
    console.log(p[atributo]);
    vector.push(p[atributo]);
};

vector.forEach(function mostrarVector(elemento, indice) {
    console.log("v[" + indice + "]= " + elemento);
});