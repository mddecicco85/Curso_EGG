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
public class Ahorcado {
    
    private String[] palabra;
    private int cantidadEncontradas;
    private int jugadasMaximas;
    
    public Ahorcado() {
    }
    
    public Ahorcado(int tamanio) {
        palabra = new String[tamanio];
        //cantidadEncontradas = 0;  //No hace falta poner esto. Se inicia en 0 solo.
    }
    
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantidadEncontradas(int cantidadEncontradas) {
        this.cantidadEncontradas = cantidadEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public String[] getPalabra() {
        return palabra;
    }

    public int getCantidadEncontradas() {
        return cantidadEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }
    
    
}
