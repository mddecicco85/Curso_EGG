/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import Servicio.PerroService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PerroService PS = new PerroService();
        String rta;
        do {
            PS.cargarRaza();
            System.out.println("Presione S para salir o cualquier otra para continuar");
            rta = leer.next().toLowerCase();
        } while (!rta.equals("s"));
        System.out.println("Las razas ingresadas son");
        PS.imprimirRazas();
        PS.buscarRaza();
    }
    
}
