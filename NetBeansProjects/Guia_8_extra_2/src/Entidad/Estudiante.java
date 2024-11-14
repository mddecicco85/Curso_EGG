/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private double nota_media;
    
    public Estudiante() {
    }
    
    public Estudiante(String nombre, int edad, double nota_media) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota_media = nota_media;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getNota_media() {
        return nota_media;
    }
}
