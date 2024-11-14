
let opcion = prompt("Ingrese S para suma, R para resta, M para multiplicación o D para división.");

var res = 0;

if (opcion == "s" || opcion == "S") {
    let num1 = prompt("Ingrese el primer número entero.");
    let num2 = prompt("Ingrese el segundo número entero.");
    res = parseInt(num1) + parseInt(num2);
} else if (opcion == "r" || opcion == "R") {
    let num1 = prompt("Ingrese el primer número entero.");
    let num2 = prompt("Ingrese el segundo número entero.");
    res = num1 - num2;
} else if (opcion == "m" || opcion == "M") {
    let num1 = prompt("Ingrese el primer número entero.");
    let num2 = prompt("Ingrese el segundo número entero.");
    res = num1 * num2;
} else if (opcion == "d" || opcion == "D") {
    let num1 = prompt("Ingrese el primer número entero.");
    let num2 = prompt("Ingrese el segundo número entero.");
    res = num1 / num2;
} else {
    alert("Opción incorrecta.")
}

let mensaje = `El resultado es ${res}`;

alert(mensaje);