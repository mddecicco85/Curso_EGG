/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Alquiler {
    
    private String nombreCliente;
    private int documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Barco barquito;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int documentoCliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barquito) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barquito = barquito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarquito() {
        return barquito;
    }

    public void setBarquito(Barco barquito) {
        this.barquito = barquito;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", \nbarquito=" + barquito + '}';
    }
    
    
    
}
