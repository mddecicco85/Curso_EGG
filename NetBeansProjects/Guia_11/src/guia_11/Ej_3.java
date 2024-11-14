/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Carta> cartas = new ArrayList();
        for (int i = 1; i <= 7; i++) {  //Creo las cartas del 1 al 7
            Carta c1 = new Carta(i, "espadas");
            cartas.add(c1);
            Carta c2 = new Carta(i, "copas");
            cartas.add(c2);
            Carta c3 = new Carta(i, "oros");
            cartas.add(c3);
            Carta c4 = new Carta(i, "bastos");
            cartas.add(c4);
        }
        for (int i = 10; i <= 12; i++) {  //Creo las cartas del 10 al 12
            Carta c1 = new Carta(i, "espadas");
            cartas.add(c1);
            Carta c2 = new Carta(i, "copas");
            cartas.add(c2);
            Carta c3 = new Carta(i, "oros");
            cartas.add(c3);
            Carta c4 = new Carta(i, "bastos");
            cartas.add(c4);
        }
        System.out.println(cartas.size());
        
        Baraja deck = new Baraja(cartas);  //Le asigno ese mazo.
        System.out.println(deck);
        
        ArrayList<Carta> salidas = new ArrayList();  //Aca guardo todas las cartas que ya salieron
        
        int opcion;
        int cant;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("MENU - ¿Qué desea hacer?");
            System.out.println("1-Barajar");
            System.out.println("2-Ver la siguiente carta");
            System.out.println("3-Ver la cantidad de cartas disponibles");
            System.out.println("4-Dar cartas");
            System.out.println("5-Ver las cartas que ya salieron");
            System.out.println("6-Mostrar las cartas restantes");
            System.out.println("7-Salir");
            opcion = leer.nextInt();
            leer.nextLine();
            
            cant = deck.getMazo().size(); //Esto es la cantidad de cartas disponibles
            //System.out.println(cant);
            System.out.println("-------------------------------------------------");
            switch (opcion) {
                case 1:
                    System.out.println("Barajando...");
                    deck.barajar();
                    System.out.println(deck);
                    break;
                case 2:
                    Carta sig = deck.siguienteCarta();
                    if (sig.getNumero() == 0) {
                        System.out.println("No hay más cartas en el mazo.");
                    } else {
                        System.out.println("La siguiente carta es el " + sig.getNumero() + " de " + sig.getPalo() + ".");
                    }
                    break;
                case 3:
                    cant = deck.cartasDisponibles();
                    System.out.println("Quedan " + cant + " cartas disponibles.");
                    break;
                case 4:
                    System.out.println("¿Cuántas cartas quiere repartir?");
                    int quiere = leer.nextInt();
                    leer.nextLine();
                    ArrayList<Carta> jugada;  //Aca guardo las cartas que se reparten en esa mano
                    if (quiere > cant) {
                        System.out.println("No hay cartas suficientes.");
                    } else {
                        System.out.println("Repartiendo...");
                        jugada = deck.darCartas(quiere);
                        for (int i = 0; i < jugada.size(); i++) {
                            salidas.add(jugada.get(i));
                        }
                    }
                    break;
                case 5:
                    deck.cartasMonton(salidas);
                    break;
                case 6:
                    deck.mostrarBaraja();
                    break;
            }
        } while (opcion != 7);
        
    }
    
}
