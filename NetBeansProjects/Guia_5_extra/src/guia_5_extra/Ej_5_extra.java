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
public class Ej_5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de N y M para matriz N x M");
        int N = leer.nextInt();
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        escribeMatriz(N, M, matriz);
        System.out.println("La suma de los elementos es " + suma);
    }
    
    public static void escribeMatriz(int N, int M, int[][] matriz) {
        System.out.println("La matriz es");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
