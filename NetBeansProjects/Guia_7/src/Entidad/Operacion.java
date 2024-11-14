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
public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Constructor vacio
    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }
    
    public int sumar() {
        int suma = numero1 + numero2;
        return suma;
    }
    
    public int restar() {
        int resta = numero1 - numero2;
        return resta;
    }
    
    
    public int multiplicar() {
        int mult;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR, al menos uno de los numeros es cero");
            mult = 0;
        } else {
            mult = numero1 * numero2;
        }
        return mult;
    }
    
    public double dividir() {
        double div;
        if (numero2 == 0) {
            System.out.println("ERROR, no se puede dividir por cero");
            div = 0;
        } else {
            div = (double) numero1 / numero2;
        }
        return div;
    }
}
