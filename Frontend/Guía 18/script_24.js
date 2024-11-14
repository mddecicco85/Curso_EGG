
var dato = 0;

var boton = document.getElementById("btn");

boton.onclick = guardarDato;

function guardarDato() {
    dato = document.getElementById("ingreso").value;
    console.log(dato);

    let h3 = document.createElement("h3");
    h3.setAttribute("id", "perimetro");
    document.body.appendChild(h3);
    document.getElementById("perimetro").textContent = "El perímetro del círculo es " + 2 * dato * Math.PI;
    
    let h4 = document.createElement("h3");
    h4.setAttribute("id", "area");
    document.body.appendChild(h4);
    document.getElementById("area").textContent = "El área del círculo es " + Math.PI * Math.pow(dato, 2);
};

dato.onmouseover = mostrarMensaje;

function mostrarMensaje() {
    console.log("Dale, gil.")
};