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
public class Rectangulo {
    
    public int lado1;
    public int lado2;
    
    public Rectangulo() {
    }
    
    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int calcular_area() {
        int area = lado1 * lado2;
        return area;
    }
}
