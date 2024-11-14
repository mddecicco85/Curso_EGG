/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_7_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de terminos de la serie");
        int N = leer.nextInt();
        int[] fibonacci = new int[N];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println("La serie hasta el termino " + N + " es");
        escribeVector(N, fibonacci);
    }
    
    public static void escribeVector(int N, int[] enteros) {
        //System.out.println("El vector es");
        for (int i = 0; i < N-1; i++) {
            System.out.print(enteros[i] + ", ");
        }
        System.out.print(enteros[N-1]);
        System.out.println("");
    }
}
