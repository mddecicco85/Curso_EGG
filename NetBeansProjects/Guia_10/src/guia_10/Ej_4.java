/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaService PS = new PeliculaService();
        
        ArrayList<Pelicula> listita = PS.crearPelicula();
        System.out.println("----------------------------------------------------");
        System.out.println("Esta es la lista de peliculas:");
        PS.mostrarLista(listita);
        System.out.println("----------------------------------------------------");
        PS.mostrarMasDeUnaHora(listita);
        System.out.println("----------------------------------------------------");
        listita.sort(Pelicula.compararDuracion);
        System.out.println("Esta es la lista ordenada por duracion descendente");
        PS.mostrarLista(listita);
        System.out.println("----------------------------------------------------");
        listita.sort(Pelicula.compararDuracion.reversed());
        System.out.println("Esta es la lista ordenada por duracion ascendente");
        PS.mostrarLista(listita);
        System.out.println("----------------------------------------------------");
        listita.sort(Pelicula.ordenarPorTitulo.reversed());
        System.out.println("Esta es la lista ordenada por titulo");
        PS.mostrarLista(listita);
        System.out.println("----------------------------------------------------");
        listita.sort(Pelicula.ordenarPorDirector.reversed());
        System.out.println("Esta es la lista ordenada por director");
        PS.mostrarLista(listita);
    }
    
}
