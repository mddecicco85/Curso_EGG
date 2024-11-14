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
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] enteros = new int[N];
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Ingrese el elemento " + i);
            enteros[i] = leer.nextInt();
        }
        escribeVector(N, enteros);
        int cant1 = 0;
        int cant2 = 0;
        int cant3 = 0;
        int cant4 = 0;
        int cant5 = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] / 10 < 1) {
                cant1++;
            } else {
                enteros[i] = enteros[i] / 10;
                //System.out.println(enteros[i]);
                if (enteros[i] / 10 < 1) {
                    cant2++;
                } else {
                    enteros[i] = enteros[i] / 10;
                    if (enteros[i] / 10 < 1) {
                    cant3++;
                    } else {
                        enteros[i] = enteros[i] / 10;
                        if (enteros[i] / 10 < 1) {
                        cant4++;
                        } else {
                            enteros[i] = enteros[i] / 10;
                            if (enteros[i] / 10 < 1) {
                            cant5++;
                            }
                        }
                    }
                }   
            }
        }
        System.out.println("Hay " + cant1 + " numeros de 1 digito");
        System.out.println("Hay " + cant2 + " numeros de 2 digitos");
        System.out.println("Hay " + cant3 + " numeros de 3 digitos");
        System.out.println("Hay " + cant4 + " numeros de 4 digitos");
        System.out.println("Hay " + cant5 + " numeros de 5 digitos");
    }
    
    public static void escribeVector(int N, int[] enteros) {
        System.out.println("El vector es");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("v[" + i + "]= " + enteros[i]);
        }
    }
}
