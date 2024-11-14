/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Double duracion;
    
    public Pelicula () {
    }
    
    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDirector().compareTo(p1.getDirector());
        }
    };
}
