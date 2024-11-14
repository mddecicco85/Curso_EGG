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
public class Teoria_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String retorno;
        retorno = cambiar(frase);
        System.out.println("Frase original " + frase);
        System.out.println("Frase modificada " + retorno);
    }
    
    public static String cambiar(String frase) {
        
        String frase2;
        frase2 = "";
        frase = frase.toUpperCase();
        int l = frase.length();
        for (int i = 0 ; i < l; i++) {
            switch (frase.substring(i , i+1)) {
                case "A":
                    frase2 = frase2.concat("@");
                    break;
                case "E":
                    frase2 = frase2.concat("#");
                    break;
                case "I":
                    frase2 = frase2.concat("$");
                    break;
                case "O":
                    frase2 = frase2.concat("%");
                    break;
                case "U":
                    frase2 = frase2.concat("*");
                    break;
                default:
                    frase2 = frase2.concat(frase.substring(i, i+1));
                    break;
            }
        }
        return frase2;
    }
    
}
