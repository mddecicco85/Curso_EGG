/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej_1;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO_Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona("Martin", 31642174, leer.nextInt());
        p1.setNombre("Tincho");
        System.out.println("La persona se llama " + p1.getNombre() + " y tiene " + p1.getEdad() + " años");
        System.out.println("El DNI es " + p1.getDNI());
        System.out.println(p1.toString());  //System.out.println(p1); muestra lo mismo
        
    }
    
}
