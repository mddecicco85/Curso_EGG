/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;
    
    public Pelicula() {
    }
    
    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public int getEdadMinima() {
        return edadMinima;
    }
    
    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    
    
}
