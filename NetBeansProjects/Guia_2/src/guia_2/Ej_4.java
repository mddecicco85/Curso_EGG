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
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        int l = frase.length();
        //System.out.println(frase.substring(0, 1));
        //Empieza desde 0 pero corta uno antes del valor final
        if ("A".equals(frase.substring(0, 1))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
       
    }
    
}
