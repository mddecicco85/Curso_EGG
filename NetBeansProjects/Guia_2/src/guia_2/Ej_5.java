/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2;

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
        System.out.println("Ingrese un entero positivo como limite");
        int limit = leer.nextInt();
        int suma=0;
        while (suma < limit) {
            System.out.println("Ingrese un numero entero postivo");
            int num = leer.nextInt();
                suma += num;
        }
        System.out.println("La suma de los numeros positivos es " + suma);
    }
    
}
