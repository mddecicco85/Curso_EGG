/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //int num1, num2, suma;
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        //Si pongo next y no pongo nextInt, lo toma como String
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es " + suma);
    }
    
}
