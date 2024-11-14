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
public class Ej_2 {

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
        enteros[i] = (int) (Math.random() * 10);
        }
        escribeVector(N, enteros);
        System.out.println("Ingrese un numero para buscar en el vector");
        int num = leer.nextInt();
        int cant = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == num) {
                System.out.println("El numero se encuentra " + num + " en la posicion " + i);
                cant ++;
            }
        }
        if (cant > 1) {
            System.out.println("El numero " + num + " se encuentra repetido");
        }
        if (cant == 0) {
            System.out.println("El numero " + num + " no se encuentra en el vector");
        }
    }
    
    public static void escribeVector(int N, int[] enteros) {
        System.out.println("El vector es");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("v[" + i + "]= " + enteros[i]);
        }
    }
    
}
