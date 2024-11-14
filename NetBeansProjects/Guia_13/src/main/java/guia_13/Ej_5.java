/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int secreto = (int) (Math.random()*500 + 1);
        System.out.println(secreto);
        int num = -1;
        int intentos = 0;
        
        do {
            intentos++;
            System.out.println("Trate de averiguar el número secreto entre 1 y 500.");
            try {
                num = leer.nextInt();
                leer.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("No es un número entero.");
                break;
            }
            
            if (num > secreto) {
                System.out.println("El número ingresado es mayor al buscado.");
            } else if (num < secreto) {
                System.out.println("El número ingresado es menor al buscado.");
            } else {
                System.out.println("Muy bien, ése es el número correcto.");
            }
            
        } while (num != secreto);
        
        System.out.println("El número de intentos fue de " + intentos);
    }
    
}
