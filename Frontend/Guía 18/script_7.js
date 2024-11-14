
var limite = prompt("Ingrese un número entero positivo como límite.");
if (limite < 0) {
    alert("Valor incorrecto.");
}

var num = 0;
var suma = 0;

while(suma < limite) {
    num = prompt("Ingrese un entero positivo.");
    num = parseInt(num);
    if (num < 0 || num > limite) {
        alert("Incorrecto.");
    } else {
        suma = suma + num;
    }
};

alert("El valor final es " + suma);