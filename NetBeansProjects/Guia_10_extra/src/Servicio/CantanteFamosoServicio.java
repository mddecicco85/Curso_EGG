/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CantanteFamosoServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarCantante(ArrayList<CantanteFamoso> musicos) {
        System.out.println("Ingrese el nombre del cantante");
        String nombre = leer.nextLine();
        System.out.println("¿Cuál es su disco más vendido?");
        String disco = leer.nextLine();
        CantanteFamoso CF = new CantanteFamoso(nombre, disco);
        musicos.add(CF);
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> musicos) {
        System.out.println("Estos son los cantantes registrados:");
        for (CantanteFamoso aux : musicos) {
            System.out.println("Cantante: " + aux.getNombre() + ", Disco más vendido: " + aux.getDiscoConMasVentas());
        }
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> musicos) {
        System.out.println("¿Qué cantante desea eliminar?");
        String nombre = leer.nextLine();
        Iterator<CantanteFamoso> it = musicos.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("Ese cantante no se encuentra en la lista.");
        }
    }
}
