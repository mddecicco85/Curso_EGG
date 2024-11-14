/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero natural");
        int num = leer.nextInt();
        boolean retorno = EsPrimo(num);
        if (retorno == false) {
            System.out.println("El numero " + num + " no es primo.");
        } else {
            System.out.println("El numero " + num + " es primo.");
        }
    }
    
    public static boolean EsPrimo(int num) {
        boolean primo = false;
        int div = 0;
        int i;
        if (num == 1) {
            primo = false;
        }
        for (i = 1; i <= num; i++) {
            if (div == 3) {
                break;
            }
            if (num % i == 0) {
                div++;
            }
        } 
        if (div == 2) {
            primo = true;
        }
        return primo;
    }
    
}
