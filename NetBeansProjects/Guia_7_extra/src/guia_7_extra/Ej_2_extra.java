/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extra;

import Entidad.Puntos;

/**
 *
 * @author Usuario
 */
public class Ej_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos p12 = new Puntos();
        System.out.println(p12);
        p12.crearPuntos();
        System.out.println("La distancia entre los dos puntos es " + p12.distanciaPuntos());
    }
    
}
