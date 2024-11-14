/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extra;

import Entidad.Rectangulo;

/**
 *
 * @author Usuario
 */
public class Ej_6_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        //rectangulo1.calcular_area();
        System.out.println("El rectangulo tiene area " + rectangulo1.calcular_area());
        rectangulo1.lado1 = 5;  //Puedo cambiarlo asi porque es publico
        System.out.println("El rectangulo con lado " + rectangulo1.lado1 + " tiene area " + rectangulo1.calcular_area());
        //Puedo llamarlo asi porque es publico
    }
    
}
