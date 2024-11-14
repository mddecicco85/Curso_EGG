/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        //r1.superficie();
        System.out.println("La superficie del rectagulo es " + r1.superficie());
        System.out.println("El perimetro del rectagulo es " + r1.perimetro());
        r1.dibujaRectangulo();
    }
    
}
