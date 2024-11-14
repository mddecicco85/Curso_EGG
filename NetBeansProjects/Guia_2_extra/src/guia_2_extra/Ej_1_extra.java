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
public class Ej_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int min = leer.nextInt();
        int dias = min / 1440;
        double horas = (double) (min % 1440) / 60;
        System.out.println("La cantidad equivale a " + dias + " dias y " + horas + " horas");
    }
    
}
