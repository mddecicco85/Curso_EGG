/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author Usuario
 */
public class Libreria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws InputMismatchException, Exception {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AutorServicio AS = new AutorServicio();
        EditorialServicio ES = new EditorialServicio();
        LibroServicio LS = new LibroServicio();
        
        int opcion = 0;
        do {
        //try{    
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
                        LS.ingresarLibro();
                        System.out.println("Libro ingresado correctamente.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("No se pudo ingresar correctamente.");
                    }
                    break;
                case 2:
                    try {
                        ES.ingresarEditorial();
                        System.out.println("Editorial ingresada correctamente.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("No se pudo ingresar correctamente.");
                    } 
                    break;
                case 3:
                    try {
                        AS.ingresarAutor();
                        System.out.println("Autor ingresado correctamente.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("No se pudo ingresar correctamente.");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Ingrese el nombre del autor.");
                        String nombre = leer.nextLine();
                        ArrayList<Autor> autores = AS.buscarPorNombre(nombre);
                        System.out.println("-------------------------------------");
                        if (autores.isEmpty()) {
                            System.out.println("No se encontraron autores con ese nombre.");
                        } else {
                            System.out.println("Estos son los autores encontrados:");
                            for (Autor aux : autores) {
                                System.out.println(aux.toString());
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        //throw e;
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Ingrese el ISBN.");
                        Long ISBN = leer.nextLong();
                        leer.nextLine();
                        if ((ISBN < 0) || (String.valueOf(ISBN).length() != 13)) {
                            throw new Exception("El ISBN debe ser un número positivo de 13 dígitos.");
                        }
                        ArrayList<Libro> books = LS.buscarPorISBN(ISBN);
                        System.out.println("-------------------------------------");
                        if (books.isEmpty()) {
                            System.out.println("No se encontró ningún libro con ese ISBN.");
                        } else {
                            System.out.println("Este es el libro encontrado:");
                            System.out.println(books.get(0).toString());
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un ISBN válido.");
                        //throw new Exception("Debe ingresar un ISBN válido.");
                    } catch (Exception e) {
                        //throw e;
                        //throw new Exception("No se encontró ningún libro con ese ISBN.");
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Ingrese el título.");
                        String titulo = leer.nextLine();
                        ArrayList<Libro> libros = LS.buscarPorTitulo(titulo);
                        if (!libros.isEmpty()) {
                            System.out.println("Estos son los libros encontrados:");
                            for (Libro aux : libros) {
                                System.out.println(aux.toString());
                            }
                        } else {
                            System.out.println("No se encontró ningún libro con ese título.");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        //throw e;
                    }
                    break;
                case 7:
                    try {
                        System.out.println("Ingrese el nombre del autor.");
                        String nombre = leer.nextLine();
                        ArrayList<Libro> libros = LS.buscarPorAutor(nombre);
                        if (!libros.isEmpty()) {
                            System.out.println("Estos son los libros encontrados:");
                            for (Libro aux : libros) {
                                System.out.println(aux.toString());
                            }
                        } else {
                            System.out.println("No se encontró ningún libro con ese autor.");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        System.out.println("Ingrese el nombre de la editorial.");
                        String nombre = leer.nextLine();
                        ArrayList<Libro> libros = LS.buscarPorEditorial(nombre);
                        if (!libros.isEmpty()) {
                            System.out.println("Estos son los libros encontrados:");
                            for (Libro aux : libros) {
                                System.out.println(aux.toString());
                            }
                        } else {
                            System.out.println("No se encontró ningún libro con esa editorial.");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.println("Ingrese el ISBN del libro a eliminar.");
                        Long ISBN = leer.nextLong();
                        leer.nextLine();
                        ArrayList<Libro> books = LS.buscarPorISBN(ISBN);
                        if (books == null) {
                            System.out.println("No existe un libro con ese ISBN.");
                        } else {
                            if (books.get(0).isAlta() == false) {
                                System.out.println("Ese libro ya estaba dado de baja.");
                            } else {
                                LS.darDeBaja(books.get(0));
                                System.out.println("Se ha dado de baja " + books.get(0).getTitulo());
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("No es un ISBN válido.");
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 10:
                    try {
                        System.out.println("Ingrese el nombre de la editorial a eliminar.");
                        String nombre = leer.nextLine();
                        ArrayList<Editorial> editoriales = ES.buscarPorNombre(nombre);
                        if (editoriales.isEmpty()) {
                            System.out.println("No existe una editorial con ese nombre.");
                        } else {
                            for (Editorial aux : editoriales) {
                                if (aux.isAlta() == false) {
                                    System.out.println("Esa editorial ya estaba dada de baja.");
                                } else {
                                    ES.darDeBaja(aux);
                                    System.out.println("Se dio de baja la editorial " + aux.getNombre());
                                }
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 11:
                    try {
                        System.out.println("Ingrese el nombre del autor a eliminar.");
                        String nombre = leer.nextLine();
                        ArrayList<Autor> autores = AS.buscarPorNombre(nombre);
                        if (autores.isEmpty()) {
                            System.out.println("No existe un autor con ese nombre.");
                        } else {
                            for (Autor aux : autores) {
                                if (aux.isAlta() == false) {
                                    System.out.println("Ese autor ya estaba dado de baja.");
                                } else {
                                    AS.darDeBaja(aux);
                                    System.out.println("Se dio de baja el autor " + aux.getNombre());
                                }
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 12:
                    try {
                        System.out.println("Ingrese el ISBN del libro a dar de alta.");
                        Long ISBN = leer.nextLong();
                        leer.nextLine();
                        ArrayList<Libro> books = LS.buscarPorISBN(ISBN);
                        if (books.get(0).isAlta() == true) {
                            System.out.println("Ese libro ya estaba dado de alta.");
                        } else {
                            LS.darDeAlta(books.get(0));
                            System.out.println("Se ha dado de alta " + books.get(0).getTitulo());
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("No es un ISBN válido.");
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 13:
                    try {
                        System.out.println("Ingrese el nombre de la editorial a dar de alta.");
                        String nombre = leer.nextLine();
                        ArrayList<Editorial> editoriales = ES.buscarPorNombre(nombre);
                        if (editoriales.isEmpty()) {
                            System.out.println("No existe una editorial con ese nombre.");
                        } else {
                            for (Editorial aux : editoriales) {
                                if (aux.isAlta() == true) {
                                    System.out.println("La editorial " + aux.getNombre() + " ya estaba dada de alta.");
                                } else {
                                    ES.darDeAlta(aux);
                                    System.out.println("Se dio de alta la editorial " + aux.getNombre());
                                }
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 14:
                    try {
                        System.out.println("Ingrese el nombre del autor a dar de alta.");
                        String nombre = leer.nextLine();
                        ArrayList<Autor> autores = AS.buscarPorNombre(nombre);
                        if (autores.isEmpty()) {
                            System.out.println("No existe un autor con ese nombre.");
                        } else {
                            for (Autor aux : autores) {
                                if (aux.isAlta() == true) {
                                    System.out.println("El autor " + aux.getNombre() + " ya estaba dado de alta.");
                                } else {
                                    AS.darDeAlta(aux);
                                    System.out.println("Se dio de alta el autor " + aux.getNombre());
                                }
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 15:
                    try {
                        System.out.println("Ingrese el Id.");
                        Long id = leer.nextLong();
                        leer.nextLine();
                        Libro book = LS.buscarPorId(id);
                        if (book == null) {
                            System.out.println("No existe un libro con ese Id.");
                        } else {
                            System.out.println(book.toString());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        //e.printStackTrace();
                    }
                    break;
                case 16:
                    try {
                        System.out.println("Ingrese el ISBN.");
                        Long ISBN = leer.nextLong();
                        leer.nextLine();
                        ArrayList<Libro> books = LS.buscarPorISBN(ISBN);
                        System.out.println("-------------------------------------");
                        if (books.isEmpty()) {
                            System.out.println("No se encontró ningún libro con ese ISBN.");
                        } else if (books.get(0).getEjemplaresRestantes() == 0) {
                            System.out.println("No quedan ejemplares para préstamo de ese libro.");
                        } else {
                            LS.prestarLibro(books.get(0));
                            System.out.println("Se ha prestado el libro " + books.get(0).getTitulo());
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un ISBN válido.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 17:
                    try {
                        System.out.println("Ingrese el ISBN.");
                        Long ISBN = leer.nextLong();
                        leer.nextLine();
                        ArrayList<Libro> books = LS.buscarPorISBN(ISBN);
                        System.out.println("-------------------------------------");
                        if (books.isEmpty()) {
                            System.out.println("No se encontró ningún libro con ese ISBN.");
                        } else if (books.get(0).getEjemplares() == books.get(0).getEjemplaresRestantes()) {
                            System.out.println("No hay ejemplares para devolver de ese libro.");
                        } else {
                            LS.devolverLibro(books.get(0));
                            System.out.println("Se ha devuelto el libro " + books.get(0).getTitulo());
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un ISBN válido.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
//        } catch (InputMismatchException e) {
//            System.out.println("Algo salió mal.");
//        //} 
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            //opcion = 1;
//        }   
        } while (opcion != 18); //((opcion < 1) || (opcion > 16));
        
    }
    
}
