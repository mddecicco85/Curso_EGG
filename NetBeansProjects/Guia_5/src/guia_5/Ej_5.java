/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import static guia_5.Ej_4.escribeMatriz;
import static guia_5.Ej_4.trasponeMatriz;
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
        System.out.println("Ingrese el tamaño de la matriz cuadrada");
        int N = leer.nextInt();
        int[][] matriz = new int[N][N];
        int[][] matrizT = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Ingrese el elemento " + i + ", " + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        escribeMatriz(N, matriz);
        matrizT = trasponeMatriz(N, matriz);
        escribeMatriz(N, matrizT);
        boolean bandera;
        bandera = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] != (-1)*matrizT[i][j]) {
                    bandera = false;
                break;
                }
            }
        }
        if (bandera == true) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
    public static void escribeMatriz(int N, int[][] matriz) {
        System.out.println("La matriz es");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] trasponeMatriz(int N, int[][] matriz) {
        int[][] matrizT = new int[4][4];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }
}
