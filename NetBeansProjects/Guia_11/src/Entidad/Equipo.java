/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Equipo {
    
    private ArrayList<Jugadore> team;
    
    public Equipo() {
    }
    
    public Equipo(ArrayList<Jugadore> team) {
        this.team = team;
    }
    
    public void setTeam(ArrayList<Jugadore> team) {
        this.team = team;
    }
    
    public ArrayList<Jugadore> getTeam() {
        return team;
    }
   
    @Override
    public String toString() {
        return "Equipo{" + "team=" + team + '}';
    }
    
    
    
}
