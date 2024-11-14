/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_extra_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_12_extra_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector de enteros");
        int N = leer.nextInt();
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la componente " + (i+1));
            v[i] = leer.nextInt();
        }
        mostrarVector(v);
        if (v[0] == v[N-1]) {
            System.out.println("El vector es ciclico");
        } else {
            System.out.println("El vector no es ciclico");
        }    
    }
    
    //HAY QUE PONER LA PALABRA STATIC SI EL METODO ESTA EN EL MAIN
    public static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
        System.out.println("");
    }
    
}
