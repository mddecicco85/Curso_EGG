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
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //El .useDelimiter marca el final de la frase al darle Enter
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine(); //En nextLine 
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

    private static String toUpperCase(String frase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
