/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

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
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro dog1 = new Perro("Fox","Setter irlandes", 3, 40);
        Perro dog2 = new Perro("Lola","Caniche", 1, 10);
        Persona p1 = new Persona("Martin", "De Cicco", 38, "31642174", dog1);
        Persona p2 = new Persona("Juan", "Perez", 25, "33546786", dog2);
        //p1.setMascota(dog1);
        //p2.setMascota(dog2);
        System.out.println("Estas son las personas con sus perros:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
