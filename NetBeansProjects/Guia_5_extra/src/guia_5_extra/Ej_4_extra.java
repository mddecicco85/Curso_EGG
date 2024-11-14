/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double[] alumnos = new double[10];
        double nota1, nota2, nota3, nota4;
        int aprob = 0;
        int desap = 0;
        for (int i = 0; i < alumnos.length; i++) {
            //nota1 = 0;
            //nota2 = 0;
            //nota3 = 0;
            //nota4 = 0;
            System.out.println("Nota del primer practico del alumno " + (i+1));
            nota1 = leer.nextDouble();
            System.out.println("Nota del segundo practico del alumno " + (i+1));
            nota2 = leer.nextDouble();
            System.out.println("Nota del primer integrador del alumno " + (i+1));
            nota3 = leer.nextDouble();
            System.out.println("Nota del segundo integrador del alumno " + (i+1));
            nota4 = leer.nextDouble();
            alumnos[i] = 0.1*nota1 + 0.15*nota2 + 0.25*nota3 + 0.5*nota4;
            if (alumnos[i] >= 7) {
                aprob++;
            } else {
                desap++;
            }
        }
        escribeVector(10, alumnos);
        System.out.println("La cantidad de aprobados es " + aprob);
        System.out.println("La cantidad de desaprobados es " + desap);
    }
    
    public static void escribeVector(int N, double[] enteros) {
        System.out.println("El vector es");
        for (int i = 0; i < N; i++) {
            System.out.println("v[" + i + "]= " + enteros[i]);
        }
    }
}
