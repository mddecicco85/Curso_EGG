/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private double tamanio;
    
    public Perro() {
    }
    
    public Perro(String nombre, String raza, int edad, double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getTamanio() {
        return tamanio;
    }
    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamanio + "}";
    }
}
