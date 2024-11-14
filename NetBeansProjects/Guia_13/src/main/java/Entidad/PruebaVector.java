/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class PruebaVector {
    
    private int[] vector;
    
    public PruebaVector() {
    }

    public PruebaVector(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    @Override
    public String toString() {
        return "PruebaVector{" + "vector=" + vector + '}';
    }
    
    
    
}
