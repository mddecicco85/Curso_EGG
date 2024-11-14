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
public class Ej_6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int N = leer.nextInt();
        int menor = 0;
        int mayor = 0;
        double suma1 = 0;
        double suma2 = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese en metros la altura de la persona " + i);
            double altura = leer.nextDouble();
            if (altura < 1.6) {
                menor++;
                suma1 += altura;
            } else {
                mayor++;
                suma2 += altura;
            }
        }
        System.out.println("El promedio de alturas menores a 1.60 m es " + suma1 / menor);
        System.out.println("El promedio de alturas mayores o iguales a 1.60 m es " + suma2 / mayor);
    }
    
}
