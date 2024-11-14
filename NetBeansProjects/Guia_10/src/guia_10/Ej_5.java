/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import Entidad.Pais;
import Servicio.PaisService;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisService PS = new PaisService();
        
        HashSet<Pais> nations = PS.ingresarPaises();
        System.out.println("---------------------------------------------------");
        System.out.println("Los paises ingresados son los siguientes");
        PS.mostrarPaises(nations);
        System.out.println("---------------------------------------------------");
        System.out.println("Los paises ordenados alfabeticamente son los siguientes");
        PS.ordenarPaises(nations);
        //PS.mostrarPaises(nations);  //No puedo hacerlo asi porque le paso el conjunto, no la lista
        System.out.println("---------------------------------------------------");
        PS.buscarPais(nations);
    }
    
}
