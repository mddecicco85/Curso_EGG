/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double crearCircunferencia() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
        //this.radio = radio;
        return radio;
    }
    
    public double area() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }
    
    public double perimetro() {
        double perim = Math.PI * 2 * radio;
        return perim;
    }
}

