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
public class Ej_9_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero como dividendo");
        int num = leer.nextInt();
        int div;
        do {
            System.out.println("Ahora ingrese otro entero como divisor");
            div = leer.nextInt();
            if (div == 0) {
                System.out.println("No se puede dividir por cero");
            }
        } while (div == 0);
        int coc = 0;
        if (num >= div){
            do {
                num = num - div;
                coc++;
            } while (num >= div);
        System.out.println("El cociente es " + coc + " y el resto es " + num);
        } else {
            System.out.println("El cociente es 0 y el resto es " + num);
        }
    }
    
}
