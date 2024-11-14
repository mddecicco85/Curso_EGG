/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Teoria_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[10];
        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el nombre del miembro " + (i+1));
            Equipo[i] = leer.nextLine();
        }
        System.out.println("Los miembros del equipo son");
        for (int i=0; i<10; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
