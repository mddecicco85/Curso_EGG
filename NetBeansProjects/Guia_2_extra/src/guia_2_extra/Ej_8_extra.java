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
public class Ej_8_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int pares = 0;
        int impares = 0;
        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            if (num < 0) {
                continue;
            }
            if (num % 5 == 0) {
                break;
            }
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros pares es " + pares);
        System.out.println("La cantidad de numeros impares es " + impares);
        System.out.println("La cantidad total es " + (pares + impares));
    }
    
}
