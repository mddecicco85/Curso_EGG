/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.servicios;

import Entidad.Persona;

/**
 *
 * @author Usuario
 */
public class ServicioPersona {
     
    public void muestraPersona(Persona p) {
        //Persona p = new Persona();
        System.out.println("El nombre es " + p.getNombre());
        System.out.println("El DNI es " + p.getDNI());
        System.out.println("La edad es " + p.getEdad());
        //return p;
    }
        
}


