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
public class Ej_8_Santiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño del cuadrado:");
        int tamaño = leer.nextInt();
        
        for (int i = 0 ; i < tamaño ; i++){
            for (int j = 0 ; j < tamaño ; j++){
            //Si i y j no estan en los bordes, imprime un espacio
            if (i != 0 && i != tamaño-1 && j != 0 && j != tamaño-1){
                System.out.print("  ");
            }
            else{
                System.out.print("* ");
            }
            }
                System.out.println("");
        }
        
    }
    
}
