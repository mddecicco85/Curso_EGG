/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArregloServicio {
    
    public Scanner leer = new Scanner(System.in);
    
    public void inicializarA(double v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.round(Math.random() * 10);
        }
    }
    
    public void mostrar(double v[]) {
        //Arrays.toString(v);  //Esto no anda. No imprime nada
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
        System.out.println("");
    }
    
    public void ordenar(double v[]) {
        Arrays.sort(v);
        double[] aux = new double[50];
        for (int i = 0; i < v.length; i++) {
            aux[i] = v[v.length-1-i];
        }
        for (int i = 0; i < v.length; i++) {
            v[i]=aux[i];
        }
    }
    
    public void inicializarB(double a[], double b[]) {
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        for (int i = 10; i < b.length; i++) {
            b[i] = 0.5;
        }
    }
}
