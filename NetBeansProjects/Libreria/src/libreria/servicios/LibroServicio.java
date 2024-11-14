/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Usuario
 */
public class LibroServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    AutorServicio AS = new AutorServicio();
    EditorialServicio ES = new EditorialServicio();
    
    LibroDAO ldao = new LibroDAO();
    
    
    public Libro ingresarLibro() throws Exception {
        System.out.println("Ingrese el ISBN del libro.");
        Long ISBN;
        try {
            ISBN = leer.nextLong();
            leer.nextLine();
            if ((ISBN < 0) || (String.valueOf(ISBN).length() != 13)) {
                throw new Exception("El ISBN debe ser un número positivo de 13 dígitos.");
            }
        } catch (InputMismatchException ex) {
            throw new Exception("Debe ingresar un ISBN válido.");
        } catch (Exception ex) {
            //System.out.println("Debe ingresar un ISBN válido.");
            throw ex;
            //throw new Exception("Debe ingresar un ISBN válido.");
        }
        System.out.println("Ingrese el título."); //Esto no va tener problema. Puedo escribir cualquier cosa porque es String.
        String titulo = leer.nextLine();
        System.out.println("Ingese el año de publicación.");
        Integer anio;
        try {
            anio = leer.nextInt();
            leer.nextLine();
        } catch (Exception ex) {
            //System.out.println("Debe ingresar un año válido.");
            //throw ex;
            throw new Exception("Debe ingresar un año válido.");
        }
        System.out.println("Ingrese la cantidad de ejemplares totales.");
        Integer ejemplares;
        try {
            ejemplares = leer.nextInt();
            leer.nextLine();
        } catch (Exception ex) {
            System.out.println("Debe ingresar un número entero.");
            throw ex;
        }
        System.out.println("Ingrese la cantidad de ejemplares prestados.");
        Integer prestados;
        try {
            prestados = leer.nextInt();
            leer.nextLine();
        } catch (Exception ex) {
            System.out.println("Debe ingresar un número entero.");
            throw ex;
        }
        System.out.println("Ingrese la cantidad de ejemplares restantes.");
        Integer restantes;
        try {
            restantes = leer.nextInt();
            leer.nextLine();
        } catch (Exception ex) {
            System.out.println("Debe ingresar un número entero.");
            throw ex;
        }
        //System.out.println("Ingrese el autor.");
        try {
            Libro book = guardarLibro(ISBN, titulo, anio, ejemplares, prestados, restantes);
            return book;
        } catch (Exception ex) {
            throw ex;
        }
        
    }    
    
    public Libro guardarLibro(Long ISBN, String titulo, int anio, int ejemplares, int prestados, int restantes) throws Exception {
    
        try {
            if (ISBN == null) {
                throw new Exception("Debe ingresar un ISBN");
            }
            if (titulo == null) {
                throw new Exception("Debe ingresar un título.");
            }
            if (anio == 0) {
                throw new Exception("Debe ingresar un año.");
            }
            if (ejemplares == 0) {
                throw new Exception("Debe ingresar la cantidad de ejemplares totales.");
            }
            if (prestados + restantes != ejemplares) {
                throw new Exception("La cantidad de ejemplares prestados más restantes no es igual al total.");
            }
            if (!buscarPorISBN(ISBN).isEmpty()) {
                throw new Exception("Ya existe un libro con ese ISBN.");
            }
            
            Libro book = new Libro();
            book.setISBN(ISBN);
            book.setTitulo(titulo);
            book.setAnio(anio);
            book.setEjemplares(ejemplares);
            book.setEjemplaresPrestados(prestados);
            book.setEjemplaresRestantes(restantes);
            book.setAlta(true);
            
            try {
                System.out.println("Ingrese el Id del autor.");
                Integer id = leer.nextInt();
                leer.nextLine();
                book.setAutor(AS.buscarPorId(id).get(0));
            } catch (InputMismatchException ex) {
                throw new Exception("Debe ingresar un Id válido.");
            } catch (Exception ex) {
                throw ex;
            }
            
            try {
                System.out.println("Ingrese el Id de la editorial.");
                Integer id = leer.nextInt();
                leer.nextLine();
                book.setEditorial(ES.buscarPorId(id).get(0));
            } catch (InputMismatchException ex) {
                throw new Exception("Debe ingresar un Id válido.");
            } catch (Exception ex) {
                throw ex;
            }
            
            book = ldao.crearLibro(book);
            return book;
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    public void darDeBaja(Libro book) throws Exception {
    
        try {
            book.setAlta(false);
            ldao.darDeBaja(book);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    
    public void darDeAlta(Libro book) throws Exception {
    
        try {
            book.setAlta(true);
            ldao.darDeAlta(book);
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public Libro buscarPorId(Long id) throws Exception {
    
        try {
            if (id == null) {
                throw new Exception("Debe indicar un Id.");
            }
            
            Libro l = ldao.buscarPorId(id);
            return l;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Libro> buscarPorISBN(Long ISBN) throws Exception {
        
        try {
            if (ISBN == null) {
                throw new Exception("Debe ingresar un ISBN.");
            }
            
            ArrayList<Libro> lista = ldao.buscarPorISBN(ISBN);
            return lista;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Libro> buscarPorTitulo(String titulo) throws Exception {
        
        try {
            if (titulo == null) {
                throw new Exception("Debe ingresar un título.");
            }
            
            ArrayList<Libro> libros = ldao.buscarPorTitulo(titulo);
            return libros;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Libro> buscarPorAutor(String nombreAut) throws Exception {
    
        try {
            if (nombreAut == null) {
                throw new Exception("Debe indicar el nombre de un autor.");
            }
            
            ArrayList<Libro> libros = ldao.buscarPorAutor(nombreAut);
            return libros;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Libro> buscarPorEditorial(String nombreEdit) throws Exception {
    
        try {
            if (nombreEdit == null) {
                throw new Exception("Debe indicar el nombre de una editorial.");
            }
            
            ArrayList<Libro> libros = ldao.buscarPorEditorial(nombreEdit);
            return libros;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public void prestarLibro(Libro l) throws Exception {
    
        try {
            
            ldao.prestarLibro(l);
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    
    public void devolverLibro(Libro l) throws Exception {
    
        try {
            
            ldao.devolverLibro(l);
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    
}

//consulta, creación, modificación, eliminación