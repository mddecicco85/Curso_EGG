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
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opcion;
        do {
            personas();
            System.out.println("Desea ingresar otra persona?");
            opcion = leer.next();
            opcion = opcion.toUpperCase();
        } while (opcion.equals("S"));
    }
    
    public static void personas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad);
        if (edad < 18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }
}
