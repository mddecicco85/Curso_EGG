/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Animalito {
    
    protected String nombre;
    protected String tipo;
    protected int edad;
    
    public Animalito() {
    }
    
    public Animalito(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
    
    public void hacerRuido() {
        System.out.println("Hola");
    }
    
    
    
}
