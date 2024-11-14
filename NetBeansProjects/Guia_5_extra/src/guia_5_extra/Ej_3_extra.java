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
public class Ej_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        vector = completaVector(N, vector);
        escribeVector(N, vector);
    }
    
    public static int[] completaVector(int N, int[] vector) {
        int[] vectorAleatorio = new int[N];
        for (int i = 0; i < N; i++) {
            vectorAleatorio[i] = (int) (Math.random() * 10);
        }
        return vectorAleatorio;
    }
    
    public static void escribeVector(int N, int[] enteros) {
        System.out.println("El vector es");
        for (int i = 0; i < N; i++) {
            System.out.println("v[" + i + "]= " + enteros[i]);
        }
    }
}
