/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class DNI {
    
    private String serie;
    private int numero;
    
    public DNI() {
    }
    
    public DNI(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getSerie() {
        return serie;
    }
    
    public int getNumero() {
        return numero;
    }
}
