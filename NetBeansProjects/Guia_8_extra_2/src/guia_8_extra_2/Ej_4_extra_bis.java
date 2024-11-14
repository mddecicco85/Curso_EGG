/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_extra_2;

import Entidad.Ascensor;
import Servicio.AscensorServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4_extra_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AscensorServicio AS = new AscensorServicio();
        Ascensor elev = new Ascensor(4, 10);
        System.out.println(elev.toString());
        //System.out.println(elev.pisoActual);
        //System.out.println(elev.maximoPisos);
        int opcion;
        boolean bandera = true;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1-Subir");
            System.out.println("2-Bajar");
            System.out.println("3-Ir a un piso dado");
            System.out.println("4-Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    elev.pisoActual = AS.subir(elev);
                    System.out.println("Ahora esta en el piso " + elev.pisoActual);
                    break;
                case 2:
                    elev.pisoActual = AS.bajar(elev);
                    System.out.println("Ahora esta en el piso " + elev.pisoActual);
                    break;
                case 3:
                    elev.pisoActual = AS.irA(elev);
                    System.out.println("Ahora esta en el piso " + elev.pisoActual);
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                }
        } while (bandera);
        
    }
    
}
