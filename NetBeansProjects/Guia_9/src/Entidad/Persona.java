/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private String nombre;
    private Date fechaNac;
    
    public Persona() {
    }
    
    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Date getFechaNac() {
        return fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
