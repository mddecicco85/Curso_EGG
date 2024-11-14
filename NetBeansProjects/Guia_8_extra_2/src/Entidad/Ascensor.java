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
public class Ascensor {
    
    public int pisoActual;
    public int maximoPisos;
    
    public Ascensor() {
    }
    
    public Ascensor(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }
    
    public Ascensor(int pisoActual, int maximoPisos) {
        this.pisoActual = pisoActual;
        this.maximoPisos = maximoPisos;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "pisoActual=" + pisoActual + ", maximoPisos=" + maximoPisos + '}';
    }
    
}
