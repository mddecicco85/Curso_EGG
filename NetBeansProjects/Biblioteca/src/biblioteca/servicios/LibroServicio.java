/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.servicios;

import biblioteca.entidades.Libro;
import biblioteca.persistencia.LibroDAO;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    LibroDAO ldao = new LibroDAO();
    
    AutorServicio AS = new AutorServicio();
    EditorialServicio ES = new EditorialServicio();
    
    
    public Libro crearLibro() throws Exception {
        
        try {
            Libro book = new Libro();
            System.out.println("Ingrese el ISBN.");
            Long ISBN = leer.nextLong();
            leer.nextLine();
            if ((ISBN <= 0) || ISBN.toString().length() != 13) {
                throw new Exception("El ISBN debe ser un número positivo de 13 dígitos.");
            }
            book.setISBN(ISBN);
            System.out.println("Ingrese el título.");
            String titulo = leer.nextLine();
            book.setTitulo(titulo);
            System.out.println("Ingrese el año de publicación.");
            Integer anio = leer.nextInt();
            leer.nextLine();
            book.setAnio(anio);
            System.out.println("Ingrese el número de ejemplares que tiene la biblioteca.");
            Integer ejemplares = leer.nextInt();
            leer.nextLine();
            book.setEjemplares(ejemplares);
            System.out.println("Ingrese el número de ejemplares prestados.");
            Integer prestados = leer.nextInt();
            leer.nextLine();
            book.setEjemplaresPrestados(prestados);
            book.setEjemplaresRestantes(ejemplares - prestados);
            book.setAlta(true);
            //System.out.println("Ingrese el ID del autor.");
            book.setAutor(AS.buscarPorId());
            book.setEditorial(ES.buscarPorId());
            ldao.crearLibro(book);
            return book;
        } catch (InputMismatchException e) {
            System.out.println("Se ha ingresado un dato incorrecto.");
            return null;
        } catch (Exception e) {
            throw e;
        }
    
    
    }
    
}
