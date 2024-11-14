/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_7_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int cant = leer.nextInt();
        int max = -10000;
        int min = 10000;
        double suma = 0;
        while (cant < 1) {
            System.out.println("Debe ingresar un numero natural");
            cant = leer.nextInt();
        }
        int i = 1;
        while (i <= cant) {
            System.out.println("Ingrese el entero numero " + i);
            int num = leer.nextInt();
            suma += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            i++;
        }
        System.out.println("El valor minimo es " + min);
        System.out.println("El valor maximo es " + max);
        System.out.println("El promedio es " + suma / cant);
    }
    
}
