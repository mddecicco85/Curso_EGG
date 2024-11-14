/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        escribeMatriz(matriz);
        matrizT = trasponeMatriz(matriz);
        escribeMatriz(matrizT);
    }
    
    public static void escribeMatriz(int[][] matriz) {
        System.out.println("La matriz es");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] trasponeMatriz(int[][] matriz) {
        int[][] matrizT = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }
    
}
