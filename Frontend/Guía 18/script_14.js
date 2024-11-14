
function Libro(ISBN, titulo, autor, paginas) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
}

var l = new Libro();

mostrarLibro(l);

function mostrarLibro(l) {
    cargarLibro(l);
    console.log(l);
    let mensaje = `Los datos ingresados son: ${l.ISBN}, ${l.titulo}, ${l.autor}, ${l.paginas}`;
    alert(mensaje);
}

function cargarLibro(l) {
    l.ISBN = prompt("Ingrese el ISBN del libro.");
    l.titulo = prompt("Ingrese el titulo.");
    l.autor = prompt("Ingrese el autor.")
    l.paginas = prompt("Ingrese la cantidad de páginas.");
}