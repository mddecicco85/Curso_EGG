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
public class NIF {
    
    private long numDNI;
    private String letra;
    
    public NIF() {
    }
    
    public NIF(long numDNI, String letra) {
        this.numDNI = numDNI;
        this.letra = letra;
    }
    
    public long getNumDNI() {
        return numDNI;
    }

    public String getLetra() {
        return letra;
    }
    
    public void setNumDNI(long numDNI) {
        this.numDNI = numDNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

   
    
    
}
