/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extra;

import Entidad.Cancion;

/**
 *
 * @author Usuario
 */
public class Ej_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c1 = new Cancion();
        //System.out.println(c1);
        Cancion c2 = new Cancion("Shangri-La", "Electric Light Orchestra");
        System.out.println("La cancion es " + c2.getTitulo() + ", de " + c2.getAutor());
    }
    
}
