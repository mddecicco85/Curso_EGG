/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;



/**
 *
 * @author Usuario
 */
public class Juego {
    
    private ArrayList<Jugador> participantes;
    private Revolver pistola;

    public Juego() {
    }
    
    public Juego(ArrayList<Jugador> participantes, Revolver pistola) {
        this.participantes = participantes;
        this.pistola = pistola;
    }
    
    public void setParticipantes(ArrayList<Jugador> participantes) {
        this.participantes = participantes;
    }
    
    public void setPistola(Revolver pistola) {
        this.pistola = pistola;
    }
    
    public ArrayList<Jugador> getParticipantes () {
        return participantes;
    }
    
    public Revolver getPistola() {
        return pistola;
    }

    @Override
    public String toString() {
        return "Juego{" + "participantes=" + participantes + ", pistola=" + pistola + '}';
    }
    
    
    public Juego llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        Juego j = new Juego();
        j.participantes = jugadores;
        j.pistola = r;
        return j;
    }
    
    public void ronda(int turno) {
        participantes.get(turno).disparo(pistola);
    }
    
}
