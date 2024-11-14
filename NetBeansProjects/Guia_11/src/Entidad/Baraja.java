/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Baraja {
    
    private ArrayList<Carta> mazo;
    
    public Baraja() {
    }
    
    public Baraja(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    
    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    
    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }
    
    public void barajar() {
        Collections.shuffle(mazo);
    }
    
    public Carta siguienteCarta() {
        Carta sig = new Carta();
        Iterator<Carta> it = mazo.iterator();
        if (it.hasNext()) {
            sig = it.next();
        }
        return sig;
    }
    
    public int cartasDisponibles() {
        int cant = 0;
        Iterator<Carta> it = mazo.iterator();
        while (it.hasNext()) {
            if (it.next().getNumero() != 0) {
                cant++;
                //System.out.println(it.next());  //Sin el IF, si borro esto se hace un bucle infinito.
            }
        }
        //System.out.println("Quedan " + cant + " cartas disponibles.");
        return cant;
    }
    
    public ArrayList<Carta> darCartas(int quiere) {
        ArrayList<Carta> jugada = new ArrayList();  //Creo una lista con las cartas que se reparten.
        for (int i = 0; i < quiere; i++) {
            jugada.add(mazo.get(0));  //Tomo la carta de arriba (siempre la posicion 0) y la reparto (agrego a la lista).
            mazo.remove(0);
        }
        return jugada;
    }
    
    public void cartasMonton(ArrayList<Carta> salidas) {
        if (salidas.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavía.");
        } else {
            System.out.println("Estas son las cartas que salieron hasta ahora:");
            System.out.println(salidas);
        }
    }
    
    public void mostrarBaraja() {
        System.out.println("Estas son las cartas restantes:");
        System.out.println(mazo);
    }
    
}
