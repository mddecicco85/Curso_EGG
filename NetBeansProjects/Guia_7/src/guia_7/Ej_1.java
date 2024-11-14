/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import Entidad.Libro;

/**
 *
 * @author Usuario
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro L1 = new Libro();
        //System.out.println(L1);  Sale todo vacio.
        //System.out.println(L1.toString());
        L1.cargarLibro();
        System.out.println(L1);
        L1.informarLibro();
    }
    
}
