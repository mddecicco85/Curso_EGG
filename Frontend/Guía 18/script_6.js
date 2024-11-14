
var num = prompt("Ingrese un número entero.");

if (num == 0) {
    alert("El número no es par ni impar.");
} else if (num % 2 == 0) {
    alert("El número es par.")
} else if (num % 2 == 1 || num % 2 == -1) {
    alert("El número es impar.");
}