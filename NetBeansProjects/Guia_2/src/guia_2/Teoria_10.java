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
public class Teoria_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        for (int i=1;i<=4;i++) {
            System.out.println("Escriba un numero entero entre 1 y 20");
            int num = leer.nextInt();
            System.out.print(num + " ");
            for (int j=1; j<=num;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
