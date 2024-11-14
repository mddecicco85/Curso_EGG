/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 3;
        int num2 = 5;
        int suma = num1 + num2;
        int resta = num1 - num2;
        boolean verd = num2 < num1;
        char texto = 'a', parrafo = 'x';
        int num = 3;
        float decimal = (float) num2 / num1;
//Hay que aclarar el float de los dos lados, en la variable y en la operacion
        int resto = num2 % num1;
        String comentario = "hola";
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(verd);
        System.out.println(decimal);
        System.out.println(resto);
    }
    
}
