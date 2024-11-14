/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String documento;
    private String mail;
    private String domicilio;
    private String telefono;
    
    public Cliente() {
    }
    
    public Cliente(String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido= apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getDocumento() {
        return documento;
    }
    
    public String getMail() {
        return mail;
    }
    
    public String getDomicilio() {
        return domicilio;
    }
    
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
    public Cliente ingresarCliente(Cliente c) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Cliente c = new Cliente();
        System.out.println("Ingrese el nombre del cliente.");
        c.nombre = leer.nextLine();
        System.out.println("Ingrese el apellido.");
        c.apellido = leer.nextLine();
        System.out.println("Ingrese el documento.");
        c.documento = leer.nextLine();
        System.out.println("Ingrese el correo electrónico.");
        c.mail = leer.nextLine();
        System.out.println("Ingrese el domicilio.");
        c.domicilio = leer.nextLine();
        System.out.println("Ingrese el teléfono.");
        c.telefono = leer.nextLine();
        return c;
    }
}
