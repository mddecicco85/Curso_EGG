/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_10_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double num1 = 10*Math.random();
        double num2 = 10*Math.random();
        System.out.println(num1);
        System.out.println(num2);
        num1 = Math.round(num1);
        num2 = Math.round(num2);
        System.out.println(num1);
        System.out.println(num2);
        double prod = num1 * num2;
        prod = Math.round(prod);
        int res;
        do {
            System.out.println("Adivine el resultado de la multiplicacion");
            res = leer.nextInt();
            if (res != prod) {
                System.out.println("Respuesta incorrecta");
            }
        } while (res != prod);
        if (res == prod) {
            System.out.println("Respuesta correcta");
        }
    }
    
}
