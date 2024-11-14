/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] enteros = new int[100];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i+1;
        }
        System.out.println("El vector en orden descendente es");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("v["+(enteros.length-i-1) +"]= " + enteros[enteros.length-i-1]);
        }
    }
    
}
