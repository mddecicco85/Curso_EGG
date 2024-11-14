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
public class Teoria_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int suma=0;
        int i=1;
        do {
            System.out.println("Ingrese un numero entero");
            int num = leer.nextInt();
            i++;
            if (num<0) {
                continue;
            }
            if (num==0) {
                System.out.println("Se capturo el numero cero");
                break;
            } else {
                suma += num;
            }
            
        } while (i<=20);
        System.out.println("La suma de los numeros positivos es " + suma);
    }
    
}
