/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
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
        int cant;
        int aux;
        System.out.println("Ingrese el numero de jugadores (de 1 a 6)");
        aux = leer.nextInt();
        leer.nextLine();
        if ((aux >= 1) && (aux <= 6)) {
            cant = aux;
        } else {
            cant = 6;
        }
        ArrayList<Jugador> jugadores = new ArrayList();  //Creo los jugadores
        for (int i = 0; i < cant; i++) {
            Jugador j = new Jugador(i+1, false);
            jugadores.add(j);
        }
        Revolver gun = new Revolver();
        gun.llenarRevolver();  //Cargo el revolver
        Juego partida = new Juego();
        partida = partida.llenarJuego(jugadores, gun);  //Le paso el revolver y los jugadores al juego
        System.out.println(partida.toString());
        
        System.out.println("COMIENZA EL JUEGO.");
        int turno = 0;
        boolean terminaJuego;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("Es el turno del " + jugadores.get(turno).getNombre() + "."); //El turno 0 es Jugador1
            System.out.println("Dispara y...");
            partida.ronda(turno);
            terminaJuego = jugadores.get(turno).getMojado();
            if (terminaJuego == false) {
                System.out.println("El " + jugadores.get(turno).getNombre() + " se salva.");
            } else {
                System.out.println("El " + jugadores.get(turno).getNombre() + " pierde.");
            }
            turno++;
            if (turno == cant) { //Si hay mas turnos que participantes, vuelve a empezar
                turno = 0;
            }
        } while (terminaJuego == false);
        System.out.println("----------------------------------------------");
        System.out.println("JUEGO TERMINADO.");
        }
}
