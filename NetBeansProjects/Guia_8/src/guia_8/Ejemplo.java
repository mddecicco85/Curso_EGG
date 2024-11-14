/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import Entidad.Persona;
import Persona.servicios.ServicioPersona;

/**
 *
 * @author Usuario
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Juan Perez", "32567123", 25);
        System.out.println(p1);
        
        ServicioPersona sp = new ServicioPersona();
        
        Persona p2 = new Persona();
        
        sp.muestraPersona(p1);
        System.out.println(p1);
        
        
    }
    
    
    
}
