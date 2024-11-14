/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    //Atributos
    public String ISBN;
    public String titulo;
    public String autor;
    public int nro_paginas;

    //Constructor vacío
    public Libro() {
    }

    //Constructor con todos los atributos pasados por parametro
    public Libro(String ISBN, String titulo, String autor, int nro_paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nro_paginas = nro_paginas;
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        autor = leer.nextLine();
        System.out.println("Ingrese el ISBN");
        ISBN = leer.nextLine();
        System.out.println("Ingrese el numero de paginas");
        nro_paginas = leer.nextInt();
        leer.nextLine();  //Hay que poner esto para ingresar un String desde un entero
        System.out.println("Ingrese la editorial");
        titulo = leer.nextLine();
    }

    public void informarLibro() {
        System.out.println("El libro ingresado es:");
        System.out.println(titulo + ", de " + autor);
        System.out.println(nro_paginas + " pags, ISBN " + ISBN);
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nro_paginas=" + nro_paginas + '}';
    }
    
    
}
