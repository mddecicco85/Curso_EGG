/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_extra_2;

import static guia_9_extra_2.Ej_12_extra_bis.mostrarVector;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_15_extra_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector de enteros");
        int N = leer.nextInt();
        int[] v = new int[N];
        int[] veces = new int[N];
        Arrays.fill(veces, 1);
        System.out.println(Arrays.toString(veces));
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la componente " + (i+1));
            v[i] = leer.nextInt();
        }
        System.out.println(Arrays.toString(v));
        cuentaRepeticion(v, veces);
        System.out.println(Arrays.toString(veces));
        int pos = buscaMaximo(veces);
        System.out.println("El valor que se repite mas veces es " + v[pos]);
        
    }
    
    //HAY QUE PONER LA PALABRA STATIC SI EL METODO ESTA EN EL MAIN
    public static void cuentaRepeticion(int[] v, int[] veces) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if (v[j] == v[i]) {
                    veces[i]++;
                }
            }
        }
    }
    
    public static int buscaMaximo(int[] veces) {
        int max = veces[0];
        int pos = 0;
        for (int i = 1; i < veces.length; i++) {
            if (veces[i] > max) {
                max = veces[i];
                pos = i;
            }
        }
        System.out.println(max);
        return pos;
    }
    
}
