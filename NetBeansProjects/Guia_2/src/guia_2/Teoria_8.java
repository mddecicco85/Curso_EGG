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
public class Teoria_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        while (nota<0 || nota>10) {
            System.out.println("Nota incorrecta. Ingrese una entre 0 y 10");
            nota = leer.nextInt();
        }
    }
    
}
