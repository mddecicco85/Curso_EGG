/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Servicio.ArregloServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArregloServicio AS = new ArregloServicio();
        double[] A = new double[50];
        double[] B = new double[20];
        
        AS.inicializarA(A);
        System.out.print("A = ");
        AS.mostrar(A);
        AS.ordenar(A);
        System.out.print("A = ");
        AS.mostrar(A);
        AS.inicializarB(A, B);
        System.out.print("B = ");
        AS.mostrar(B);
    }
    
}
