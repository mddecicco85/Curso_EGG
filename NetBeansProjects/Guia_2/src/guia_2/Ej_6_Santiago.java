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
public class Ej_6_Santiago {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        String letra = "N";
        double res = 0;  //Por si elige el 5 de entrada
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    res = num1 + num2;
                    System.out.println("El resultado es " + res);
                    break;
                case 2:
                    res = num1 - num2;
                    System.out.println("El resultado es " + res);
                    break;
                case 3:
                    res = num1 * num2;
                    System.out.println("El resultado es " + res);
                    break;
                case 4:
                    res = (double) num1 / num2;
                    System.out.println("El resultado es " + res);
                    break;
                case 5:
                    System.out.println("Esta seguro de que desea salir del programa (S/N)?");
                    letra = leer.next();
                    if (letra.equalsIgnoreCase("S")) {
                        break;
                    }
                    break;  //No se si hace falta
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            //System.out.println("El resultado es " + res);
        } while (letra.equalsIgnoreCase("N"));
    }
}
