/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Cine {
    
    private Pelicula peli;
    private String[][] sala;
    private int precio;
    
    public Cine() {
    }
    
    public Cine(Pelicula peli, String[][] sala, int precio) {
        this.peli = peli;
        this.sala = sala;
        this.precio = precio;
    }
    
    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }
    
    public void setSala(String[][] sala) {
        this.sala = sala;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public Pelicula getPeli() {
        return peli;
    }
    
    public String[][] getSala() {
        return sala;
    }
    
    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli=" + peli + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
    
}
