/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extra;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opcion;
        Juego J1 = new Juego();
        do {
            J1.iniciar_juego();
            System.out.println("Victorias Jugador 1: " + J1.veces1);
            System.out.println("Victorias Jugador 2: " + J1.veces2);
            System.out.println("Desean jugar otra vez? (S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }
    
}
