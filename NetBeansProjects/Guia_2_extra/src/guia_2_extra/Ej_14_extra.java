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
public class Ej_14_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int N = leer.nextInt();
        int hijos = 0;
        int edad = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + i);
            int M = leer.nextInt();
            hijos += M;
            for (int j = 1; j <= M; j++) {
                System.out.println("Edad del hijo " + j + " de esta familia?");
                edad += leer.nextInt();
            }
        }
        double prom = (double) edad / hijos;
        System.out.println("El promedio de edad entre todos es de " + prom);
    }
    
}
