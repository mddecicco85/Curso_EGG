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
public class Ej_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Los valores de A,B,C,D ahora son ");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
    
}
