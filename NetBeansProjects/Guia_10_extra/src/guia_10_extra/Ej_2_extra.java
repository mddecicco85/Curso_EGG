/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10_extra;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> artistas = new ArrayList();
        CantanteFamosoServicio CFS = new CantanteFamosoServicio();
        
        String cantante;
        String disco;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un cantante famoso");
            cantante = leer.nextLine();
            System.out.println("¿Cuál es su disco más vendido?");
            disco = leer.nextLine();
            CantanteFamoso singer = new CantanteFamoso(cantante, disco);
            artistas.add(singer);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Estos son los datos ingresados:");
        for (CantanteFamoso aux : artistas) {
            System.out.println("-Cantante: " + aux.getNombre() + ", Disco más vendido: " + aux.getDiscoConMasVentas());
        }
        int opcion;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("MENU - Elija una opción");
            System.out.println("1-Agregar un cantante");
            System.out.println("2-Mostrar todos los cantantes");
            System.out.println("3-Eliminar un cantante");
            System.out.println("4-Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    CFS.agregarCantante(artistas);
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    CFS.mostrarCantantes(artistas);
                    System.out.println("-----------------------------------------------");
                    break;
                case 3:
                    CFS.eliminarCantante(artistas);
                    System.out.println("-----------------------------------------------");
                    break;
            }
        } while ((opcion >= 1) && (opcion < 4));
        
        System.out.println("-----------------------------------------------");
        System.out.println("Estos son los cantantes registrados:");
        for (CantanteFamoso aux : artistas) {
            System.out.println("-Cantante: " + aux.getNombre() + ", Disco más vendido: " + aux.getDiscoConMasVentas());
        }
    }
    
}
