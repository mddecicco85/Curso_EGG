/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_extra;

import Entidad.Pelicula;
import Entidad.Espectador;
import Entidad.Cine;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2_extra {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //public static Cine theatre;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cine theatre = new Cine();
        Pelicula movie = crearPelicula();
        theatre.setPeli(movie);  //Se la asigno
        //int minima = movie.getEdadMinima();
        System.out.println(theatre.getPeli());
        
        //System.out.println(movie);
        System.out.println("-------------------------------------------------");
        
        System.out.println("¿Cuál es el valor de la entrada?");
        theatre.setPrecio(leer.nextInt());
        leer.nextLine();
        //int precio = theatre.getPrecio();
        System.out.println("-------------------------------------------------");
        
        String[][] sala = new String[8][6];  //Matriz auxiliar
        rotularSala(sala);
        theatre.setSala(sala);  //Se la asigno
        imprimirSala(sala);
        System.out.println("-------------------------------------------------");
        
        ingresarEspectadores(theatre);
        
        imprimirSala(sala);
    }
    
    public static Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();
        System.out.println("¿Cuál es el título de la película?");
        peli.setTitulo(leer.nextLine());
        System.out.println("Ingrese la duración en minutos");
        peli.setDuracion(leer.nextInt());
        leer.nextLine();
        System.out.println("¿Cuál es la edad mínima para ver la película?");
        peli.setEdadMinima(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el director");
        peli.setDirector(leer.nextLine());
        return peli;
    }
    
    public static void rotularSala(String[][] sala) {
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        sala[i][j] = (i+1) + " A";
                        break;
                    case 1:
                        sala[i][j] = (i+1) + " B";
                        break;
                    case 2:
                        sala[i][j] = (i+1) + " C";
                        break;
                    case 3:
                        sala[i][j] = (i+1) + " D"; 
                        break;
                    case 4:
                        sala[i][j] = (i+1) + " E";
                        break;
                    case 5:
                        sala[i][j] = (i+1) + " F";
                        break;
                }
            }
        }
    
    }
    
    public static void imprimirSala(String[][] sala) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sala[i][j] + " | ");
            }
            System.out.print(sala[i][5]);
            System.out.println("");
        }
    }
    
    public static void ingresarEspectadores(Cine theatre) {
        String rta;
        int cant = 0;
        do {
            System.out.println("-------------------------------------------------");
            Espectador esp = new Espectador();
            cant++;
            System.out.println("Ingrese el nombre del espectador");
            esp.setNombre(leer.nextLine());
            System.out.println("Ingrese la edad");
            esp.setEdad(leer.nextInt());
            leer.nextLine();
            System.out.println("¿Cuánto dinero tiene?");
            esp.setDinero(leer.nextDouble());
            leer.nextLine();
            asignarAsiento(esp, theatre);
            System.out.println(cant);
            System.out.println("¿Desea ingresar otro espectador (S/N)?");
            rta = leer.nextLine();
        } while ((rta.equalsIgnoreCase("s")) && (cant <= 48));
        
        if (cant == 48) {
            System.out.println("La sala está llena. No hay más asientos disponibles.");
        }
        
    }
    
    public static void asignarAsiento(Espectador esp, Cine theatre) {
        String[][] salon;
        boolean asignado = false;
        if (esp.getEdad() < theatre.getPeli().getEdadMinima()) {
            System.out.println("La persona no tiene la edad suficiente para ver la película.");
        } else if (esp.getDinero() < theatre.getPrecio()) {
            System.out.println("El espectador no tiene dinero suficiente.");
        } else {
            do {
                int i = (int) (Math.random() * 8);  //Da entre 0 y 7
                int j = (int) (Math.random() * 6);  //Da entre 0 y 5
                salon = theatre.getSala();
                System.out.println("Butaca " + salon[i][j] + ".");
                if (salon[i][j].length() == 3) {  //Si no tiene la X, tiene 3 caracteres (contando el espacio)
                    salon[i][j] += " (X)";
                    asignado = true;
                    System.out.println("Butaca asignada.");
                } else {
                    System.out.println("Ese asiento está ocupado. Espere un momento...");
                }
            } while (asignado == false);
        }
    }
    
}
