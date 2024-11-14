/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    public Libro() {
    }
    
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
    public static boolean prestamo(HashSet<Libro> libros, String tit) {
        boolean prestado = false;
        for (Libro aux : libros) {
            if (aux.titulo.equalsIgnoreCase(tit)) {
                if (aux.ejemplares > 0) {
                    aux.ejemplares--;
                    aux.prestados++;
                    prestado=true;
                } else {
                    System.out.println("No quedan más ejemplares para préstamo.");
                    prestado=false;
                }
            }
        }
        return prestado;
    }
    
    public static boolean devolucion(HashSet<Libro> libros, String tit) {
        boolean devuelto = false;
        for (Libro aux : libros) {
            if (aux.titulo.equalsIgnoreCase(tit)) {
                if (aux.prestados > 0) {
                    aux.ejemplares++;
                    aux.prestados--;
                    devuelto=true;
                } else {
                    System.out.println("No hay ejemplares prestados.");
                    devuelto=false;
                }
            }
        }
        return devuelto;
    }
}
