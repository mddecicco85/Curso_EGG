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
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        double retorno = 0;
        System.out.println("Elija una opcion");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                retorno = suma(num1, num2);
                break;
            case 2:
                retorno = resta(num1, num2);
                break;
            case 3:
                retorno = multiplica(num1, num2);
                break;
            case 4:
                retorno = divide(num1, num2);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        if (num2 != 0) {
            System.out.println("El resultado es " + retorno);
        }
    }
    
    
    public static int suma(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
    
    public static int resta(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }
    
    public static int multiplica(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }
    
    public static double divide(int num1, int num2) {
        double res = 0;
        if (num2 != 0) {
            res = (double) num1 / num2;
        } else {
            System.out.println("No se puede dividir por 0");
        }
        return res;
    }
}
