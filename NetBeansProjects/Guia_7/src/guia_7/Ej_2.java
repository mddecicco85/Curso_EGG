/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia(2.5);
        System.out.println("La circunferencia tiene radio " + c1.getRadio());
        
        Circunferencia c2 = new Circunferencia(4);
        System.out.println("La circunferencia tiene radio " + c2.getRadio());
        c2.crearCircunferencia();
        System.out.println("La circunferencia tiene radio " + c2.getRadio());
        System.out.println("La circunferencia tiene area " + c2.area());
        System.out.println("La circunferencia tiene perimetro " + c2.perimetro());
    }
    
}
