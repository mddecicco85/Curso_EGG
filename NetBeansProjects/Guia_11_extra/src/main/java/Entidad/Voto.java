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
public class Voto {
    
    private Alumno votante;
    private ArrayList<Alumno> votados;
    
    public Voto() {
    }
    
    public Voto(Alumno votante, ArrayList<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }
    
    public void setVotante(Alumno votante) {
        this.votante = votante;
    }
    
    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }
    
    public Alumno getVotante() {
        return votante;
    }
    
    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "votante=" + votante + ", votados=" + votados + '}';
    }
    
    
}