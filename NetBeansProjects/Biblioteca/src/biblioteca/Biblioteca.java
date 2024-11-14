/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import biblioteca.entidades.Autor;
import biblioteca.entidades.Editorial;
import biblioteca.entidades.Libro;
import biblioteca.servicios.AutorServicio;
import biblioteca.servicios.EditorialServicio;
import biblioteca.servicios.LibroServicio;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AutorServicio AS = new AutorServicio();
        EditorialServicio ES = new EditorialServicio();
        LibroServicio LS = new LibroServicio();
        
        int opcion = 0;
        do {    
            System.out.println("---------------------------------------------");
            System.out.println("MENU:");
            System.out.println("1-Ingresar un libro.");
            System.out.println("2-Ingresar una editorial.");
            System.out.println("3-Ingresar un autor.");
            System.out.println("4-Buscar autor por nombre.");
            System.out.println("5-Buscar libro por ISBN.");
            System.out.println("6-Buscar libro por título.");
            System.out.println("7-Buscar libro por autor.");
            System.out.println("8-Buscar libro por editorial.");
            System.out.println("9-Dar de baja un libro.");
            System.out.println("10-Eliminar una editorial.");
            System.out.println("11-Eliminar un autor.");
            System.out.println("12-Dar de alta un libro.");
            System.out.println("13-Dar de alta una editorial.");
            System.out.println("14-Dar de alta un autor.");
            System.out.println("15-Buscar libro por Id.");
            System.out.println("16-Prestar un libro.");
            System.out.println("17-Devolver un libro.");
            System.out.println("18-Salir.");
            System.out.println("Elija una opción.");
            try {
                opcion = leer.nextInt();
                leer.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero.");
                //throw new Exception("Debe ingresar un número entero.");
                //throw e;
                break;  //Si saco esto, no corta nunca.
            } catch (Exception e) {
                throw e;
            }
            System.out.println("---------------------------------------------");
            
            switch (opcion) {
                case 1:
                    try {
                        Libro l = LS.crearLibro();
                        System.out.println("Se ha creado el libro " + l.getTitulo() + ".");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Editorial e = ES.crearEditorial();
                        System.out.println("Se ha creado la editorial " + e.getNombre() + ".");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        Autor a = AS.crearAutor();
                        System.out.println("Se ha creado el autor " + a.getNombre() + ".");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                break;
                    
            }
        } while (opcion != 18);
    }    
    
}
