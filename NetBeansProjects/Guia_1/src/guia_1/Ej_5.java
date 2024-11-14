/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es " + num*2);
        System.out.println("El triple de " + num + " es " + num*3);
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
    }
    
}
