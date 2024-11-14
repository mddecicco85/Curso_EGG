
var circulo = {
    radio : prompt("Ingrese el radio de un círculo."),
}

calcularArea(circulo.radio);

function calcularPerimetro(r) {
    let perimetro = 2 * Math.PI * r;
    return perimetro;
}

function calcularArea(r) {
    let perim = calcularPerimetro(r);
    let area = Math.PI * Math.pow(r, 2);
    alert("El área del círculo es " + area + " y el perímetro " + perim);
}

