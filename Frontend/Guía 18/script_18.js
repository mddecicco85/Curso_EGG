
var valores = [true, 5, false, "hola", "adiós", 2];

if (valores[3].length > valores[4].length) {
    console.log(valores[3] + " es más larga que " + valores[4]);
} else if (valores[3].length < valores[4].length) {
    console.log(valores[4] + " es más larga que " + valores[3]);
} else {
    console.log(valores[3] + " y " + valores[4] + " tienen la misma longitud.");
};

console.log(valores[5] + " > " + valores[1] +  " ? " + valores[2]);

console.log(valores[5] + " * 2 + 1 = " + valores[1] + " ? " + valores[0]);

console.log("1 > 2 = " + valores[2]);

console.log("2 < 3 = " + valores[0]);

console.log(valores[1] + " + " + valores[5] + " = " + (valores[1] + valores[5]));
console.log(valores[1] + " - " + valores[5] + " = " + (valores[1] - valores[5]));
console.log(valores[1] + " * " + valores[5] + " = " + (valores[1] * valores[5]));
console.log(valores[1] + " / " + valores[5] + " = " + (valores[1] / valores[5]));
console.log(valores[1] + " ^ " + valores[5] + " = " + (Math.pow(valores[1], valores[5])));