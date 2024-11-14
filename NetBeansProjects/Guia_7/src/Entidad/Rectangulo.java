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
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Constructor vacio
    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
    }
    
    public double superficie() {
        double sup = base * altura;
        return sup;
    }
    
    public double perimetro() {
        double perim = 2 * (base + altura);
        return perim;
    }
    
    public void dibujaRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i == 0) || (j == 0) || (i == altura - 1) || (j == base - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}