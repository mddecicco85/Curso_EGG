/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;
    
    public Revolver() {
    }
    
    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    
    public void setPoscionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public int getPosicionActual() {
        return posicionActual;
    }
    
    public int getPosicionAgua() {
        return posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    public void llenarRevolver() {
        posicionActual = (int) (Math.random()*8 + 1);
        //Math.random() va desde 0 hasta 0,99.
        //Multiplico por 8 y llega hasta 7,99. Entonces sumo 1. Al tomar parte entera, trunca.
        //System.out.println(posicionActual);
        posicionAgua = (int) (Math.random()*8 + 1);
        //System.out.println(posicionAgua);
    }
    
    public boolean mojar() {
        boolean coincide = false;
        if (posicionActual == posicionAgua) {
            coincide = true;
        }
        return coincide;
    }
    
    public void siguienteChorro() {
        if (posicionActual <= 7) {
            posicionActual += 1;
        } else {
            posicionActual = 1;  //Vuelve al principio
        }
    }
    
}
