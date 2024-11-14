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
public class Persone {
    
    private String nombre;
    private String apellido;
    private DNI documento;
    
    public Persone() {
    }
    
    public Persone(String nombre, String apellido, DNI documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setDocumento(DNI documento) {
        this.documento = documento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public DNI getDocumento() {
        return documento;
    }
}
