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
public class Ej_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int N = leer.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        boolean bandera = true;
        System.out.println("Ingrese los elementos del vector A");
        for (int i = 0; i < N; i++) {
            A[i] = leer.nextInt();
        }
        System.out.println("Ingrese los elementos del vector B");
        for (int i = 0; i < N; i++) {
            B[i] = leer.nextInt();
        }
        escribeVector(N, A);
        escribeVector(N, B);
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                bandera = false;
                break;
            }
        }
        if (bandera == true) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
    
    public static void escribeVector(int N, int[] enteros) {
        System.out.println("El vector es");
        for (int i = 0; i < N; i++) {
            System.out.println("v[" + i + "]= " + enteros[i]);
        }
    }
}
