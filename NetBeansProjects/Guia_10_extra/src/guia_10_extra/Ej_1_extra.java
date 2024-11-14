/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_extra;

import java.util.ArrayList;
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
        ArrayList<Integer> enteros = new ArrayList();
        Integer num;
        int suma = 0;
        int cont = 0;
        do {
            System.out.println("Ingrese un numero entero o -99 para terminar");
            num = leer.nextInt();
            leer.nextLine();
            if (num != -99) {
                cont++;
                suma += num;
                enteros.add(num);
            }
        } while (num != -99);
        double media;
        if (cont == 0) {
            media = 0;
        } else {
            media = (double) suma/cont;
        }
        System.out.println("Se han leído " + cont + " valores.");
        System.out.println("La suma de ellos es " + suma + " y la media " + media);
    }
    
}
