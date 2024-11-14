/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Teoria_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1>25) {
            if (num2>25) {
                System.out.println("Los dos numeros son mayores que 25");
            } else {
                System.out.println("El primer numero es mayor que 25");
            }
        } else if (num2>25) {
            System.out.println("El segundo numero es mayor que 25");
        } else {
            System.out.println("Ningun numero es mayor que 25");
        }
    }
    
}
