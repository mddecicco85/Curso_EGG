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
public class Ej_6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cant = 0;
        String palabra;
        String[][] word = new String[5][5];
        String[][] sopa = new String[20][20];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                word[i][j] = "";
            }
        }
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Escriba una palabra de entre 3 y 5 letras");
                palabra = leer.next();
                //System.out.println(palabra.length());
            } while ((palabra.length() < 3) || (palabra.length() > 5));
            for (int j = 0; j < palabra.length(); j++) {
                word[i][j] = palabra.substring(j,j+1);
            }
        }
        escribeMatriz(5, 5, word);
        for (int i = 0; i <20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }
        int fila = 0;
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) {
            v[i] = -1;
        }
        for (int i = 0; i < 5; i++) {
            do {
                fila = (int) (Math.random() * 20);  //Saque el +1 para que sea entre 0 y 19
                //System.out.println(fila);
            } while ((fila == v[0]) || (fila == v[1]) || (fila == v[2]) || (fila == v[3])); //v[4] no hace falta
            v[i] = fila;
            for (int j = 0; j < word[i].length; j++) {
                if (word[i][j] != "") {
                    sopa[fila][j] = word[i][j];
                }
            }
        }
        escribeMatriz(20, 20, sopa);
    }
    
    public static void escribeMatriz(int N, int M, String[][] matriz) {
        System.out.println("La matriz es");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
