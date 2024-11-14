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
public class Ej_5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio, A, B o C");
        String socio = leer.next();
        while (!socio.equalsIgnoreCase("A") && !"B".equalsIgnoreCase(socio) && !"C".equalsIgnoreCase(socio)) {
//Tambien se puede escribir while (!socio.equalsIgnoreCase("A") && etc)            
//Si pongo O en vez de Y va a entrar con la b porque ya no cumple la primera
            System.out.println("La opcion no corresponde a un tipo de socio");
            System.out.println("Ingrese el tipo de socio, A, B o C");
            socio = leer.next();
        }
        socio = socio.toUpperCase();  //Lo paso a mayuscula para que tome bien el switch
        //System.out.println(socio);
        System.out.println("Ahora ingrese el costo del tratamiento");
        int costo = leer.nextInt();
        switch (socio) {
            case "A":
                System.out.println("El valor final es de " + costo*0.5);
                break;
            case "B":
                System.out.println("El valor final es de " + costo*0.65);
                break;
            case "C":
                System.out.println("El valor final es de " + costo);
                break;
        }
    }
    
}
