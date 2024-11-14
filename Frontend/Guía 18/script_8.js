
var num;
var suma = 0;
var max = -1000;
var min = 1000;
var i = 0;

num = prompt("Ingrese un número entero, o ingrese 0 para terminar.");

while (num != 0) {
    i++;
    suma = suma + parseInt(num);
    if (num <= min) {
        min = parseInt(num);
    }
    if (num >= max) {
        max = parseInt(num);
    }
    num = prompt("Ingrese un número entero, o ingrese 0 para terminar.");
}

if (num == 0) {
    alert("Máximo= " + max + ", Mínimo= " + min + ", Promedio= " + suma/i);
}