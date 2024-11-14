/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11;

import Entidad.Equipo;
import Entidad.Jugadore;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Teoria_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Jugadore> jugadores = new ArrayList();
        Jugadore j1 = new Jugadore();
        j1.setNombre("Juan");
        j1.setApellido("Perez");
        j1.setPosicion("delantero");
        j1.setNumero(9);
        jugadores.add(j1);
        Jugadore j2 = new Jugadore();
        j2.setNombre("Jose");
        j2.setApellido("Lopez");
        j2.setPosicion("defensor");
        j2.setNumero(2);
        jugadores.add(j2);
        Jugadore j3 = new Jugadore();
        j3.setNombre("Matias");
        j3.setApellido("Garcia");
        j3.setPosicion("mediocampista");
        j3.setNumero(5);
        jugadores.add(j3);
        Equipo eq = new Equipo(jugadores);
        System.out.println(eq);
    }
    
}
