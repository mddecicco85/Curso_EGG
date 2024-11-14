/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> lista = new ArrayList();
        String rta;
        do {
            Pelicula movie = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            movie.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director");
            movie.setDirector(leer.nextLine());
            System.out.println("Ingrese la duracion en horas");
            movie.setDuracion(leer.nextDouble());
            lista.add(movie);
            System.out.println("¿Desea ingresar otra pelicula (S/N)?");
            rta = leer.next();
            leer.nextLine();
        } while (rta.equalsIgnoreCase("S"));
//        for (Pelicula peli : lista) {
//            System.out.println(peli);
//        }
        return lista;
    }
    
    public void mostrarLista(ArrayList<Pelicula> lista) {
        //System.out.println("Esta es la lista de peliculas:");
        for (Pelicula peli : lista) {
            System.out.println("-" + peli);
        }
    }
    
    public void mostrarMasDeUnaHora(ArrayList<Pelicula> lista) {
        System.out.println("Esta es la lista de peliculas que duran mas de una hora:");
        for (Pelicula peli : lista) {
            if (peli.getDuracion() > 1) {
                System.out.println("-" + peli);
            }
        }
    }
    
}
