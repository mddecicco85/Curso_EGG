/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class EdificioDeOficinas extends Edificio {
    
    private int numeroDeOficinas;
    private int personasPorOficina;
    private int numeroPisos;
    
    public EdificioDeOficinas() {
    }
    
    public EdificioDeOficinas(double ancho, double alto, double largo, String nombre, int numeroDeOficinas, int personasPorOficina, int numeroPisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
    
    

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroDeOficinas=" + numeroDeOficinas + ", personasPorOficina=" + personasPorOficina + ", numeroPisos=" + numeroPisos + '}';
    }
    
    
    
}
