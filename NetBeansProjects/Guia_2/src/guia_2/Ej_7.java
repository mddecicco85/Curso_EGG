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
public class Ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        int valid = 0;
        int invalid = 0;
        do {
            System.out.println("Ingrese una cadena o &&&&& para terminar");
            cadena = leer.nextLine();
            int l = cadena.length();
            if ((l <= 5) && ("X".equalsIgnoreCase(cadena.substring(0, 1))) && ("O".equalsIgnoreCase(cadena.substring(l-1,l)))) {
                //int valid = 0;
                valid++;
            } else if (!"&&&&&".equals(cadena)) {
                //int invalid = 0;
                invalid++;
            }
        } while (!"&&&&&".equals(cadena));
        if ("&&&&&".equals(cadena)) {
            System.out.println("El numero de cadenas correctas es " + valid);
            System.out.println("El numero de cadenas incorrectas es " + invalid);
        }
    }
}
