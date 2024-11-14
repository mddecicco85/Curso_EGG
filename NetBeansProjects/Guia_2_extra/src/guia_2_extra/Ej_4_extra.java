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
public class Ej_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero natural entre 1 y 10");
        int num = leer.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Incorrecto, ingrese un natural entre 1 y 10");
            num = leer.nextInt();
        }
        switch (num) {
            case 1:
                System.out.println("En numeros romanos es I");
                break;
            case 2:
                System.out.println("En numeros romanos es II");
                break;
            case 3:
                System.out.println("En numeros romanos es III");
                break;
            case 4:
                System.out.println("En numeros romanos es IV");
                break;
            case 5:
                System.out.println("En numeros romanos es V");
                break;
            case 6:
                System.out.println("En numeros romanos es VI");
                break;
            case 7:
                System.out.println("En numeros romanos es VII");
                break;
            case 8:
                System.out.println("En numeros romanos es VIII");
                break;
            case 9:
                System.out.println("En numeros romanos es IX");
                break;
            case 10:
                System.out.println("En numeros romanos es X");
                break;
        }
    }
    
}
