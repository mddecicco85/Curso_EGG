/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import static guia_5.Ej_5.escribeMatriz;
import static guia_5.Ej_5.trasponeMatriz;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        System.out.println("Complete la matriz con naturales del 1 al 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el elemento " + i + ", " + j);
                    matriz[i][j] = leer.nextInt();    
                } while ((matriz[i][j] < 1) || (matriz[i][j] > 9));
            }
        }
        escribeMatriz(matriz);
        matrizT = trasponeMatriz(matriz);
        escribeMatriz(matrizT);
        boolean bandera = true;
        int sumaF;
        int sumaD = 0;
        int sumaX = 0;
        for (int i = 0; i < 3; i++) {
            sumaD += matriz[i][i];
        }
        //System.out.println(sumaD);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumaX += matriz[i][j];
                }
            }
        }
        //System.out.println(sumaX);
        if (sumaX != sumaD) {
            System.out.println("La matriz no es magica");
        } else {
            for (int i = 0; i < 3; i++) {
                sumaF = 0;
                for (int j = 0; j < 3; j++) {
                    sumaF += matriz[i][j];
                }
                if (sumaF != sumaD) {
                    bandera = false;
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                sumaF = 0;
                for (int j = 0; j < 3; j++) {
                    sumaF += matrizT[i][j];
                }
                if (sumaF != sumaD) {
                    bandera = false;
                    break;
                }
            }
            if (bandera == false) {
                System.out.println("La matriz no es magica");
            } else {
                System.out.println("La matriz es magica");
            }
        }
    }
    
    public static void escribeMatriz(int[][] matriz) {
        System.out.println("La matriz es");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] trasponeMatriz(int[][] matriz) {
        int[][] matrizT = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }
}
