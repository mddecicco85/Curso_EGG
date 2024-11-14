/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_extra;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> biblioteca = new HashSet();
        
        String rta = "";
        do {
            Libro book = new Libro();
            System.out.println("Ingrese el título del libro");
            book.setTitulo(leer.nextLine());
            System.out.println("Ingrese el autor");
            book.setAutor(leer.nextLine());
            System.out.println("Ingrese la cantidad de ejemplares disponibles");
            book.setEjemplares(leer.nextInt());
            leer.nextLine();
            System.out.println("Ingrese la cantidad de ejemplares prestados");
            book.setPrestados(leer.nextInt());
            leer.nextLine();
            biblioteca.add(book);
            System.out.println("¿Desea añadir otro libro (S/N)?");
            rta = leer.nextLine();
        } while (rta.equalsIgnoreCase("S"));
        System.out.println("-------------------------------------------------");
        int opcion;
        do {
            System.out.println("MENU - ¿Qué desea hacer?");
            System.out.println("1-Prestar un libro");
            System.out.println("2-Devolver un libro");
            System.out.println("3-Mostrar todos los libros");
            System.out.println("4-Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            String tit;
            int cont;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro que desea prestar");
                    tit = leer.nextLine();
                    cont = 0;
                    boolean prestado = false;
                    for (Libro aux : biblioteca) {
                        if (aux.getTitulo().equalsIgnoreCase(tit)) {
                            prestado = Libro.prestamo(biblioteca, tit);
                            cont++;
                            break;
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Ese libro no se encuentra la biblioteca.");
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Ingrese el título del libro que desea devolver");
                    tit = leer.nextLine();
                    cont = 0;
                    boolean devuelto = false;
                    for (Libro aux : biblioteca) {
                        if (aux.getTitulo().equalsIgnoreCase(tit)) {
                            devuelto = Libro.devolucion(biblioteca, tit);
                            cont++;
                            break;
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Ese libro no se encuentra en la biblioteca.");
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Estos son los datos de los libros:");
                    for (Libro aux : biblioteca) {
                        System.out.println(aux.toString());
                    }
                    System.out.println("-------------------------------------------------");
                    break;
            }
        } while ((opcion >=1) && (opcion < 4));
    }
    
}
