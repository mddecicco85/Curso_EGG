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
public class Jugadore {
    
    private String nombre;
    private String apellido;
    private String posicion;
    private int numero;
    
    public Jugadore() {
    }
    
    public Jugadore(String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getPosicion() {
        return posicion;
    }
    
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", numero=" + numero + '}';
    }
    
    
}
