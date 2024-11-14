/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Carta {
    
    private int numero;
    private String palo;
    
    public Carta() {
    }
    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" + numero + " de " + palo + '}';
    }
    
}
