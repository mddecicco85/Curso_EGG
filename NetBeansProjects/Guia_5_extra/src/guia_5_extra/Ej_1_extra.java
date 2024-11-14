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
public class Ej_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        double suma = 0;
        double[] vector = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el elemento " + i);
            vector[i] = leer.nextDouble();
            suma += vector[i];
        }
        escribeVector(N, vector);
        System.out.println("La suma de los elementos es " + suma);
    }
    
    public static void escribeVector(int N, double[] enteros) {
        System.out.println("El vector es");
        for (int i = 0; i < N; i++) {
            System.out.println("v[" + i + "]= " + enteros[i]);
        }
    }
}
