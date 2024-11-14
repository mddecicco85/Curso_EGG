/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_extra;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PerroService;
import Servicio.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

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
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroService PS = new PerroService();
        PersonaService PerS = new PersonaService();
        
        ArrayList<Perro> mascotas;
        mascotas = PS.crearPerros();
        System.out.println(mascotas);
        
        ArrayList<Persona> duenios;
        duenios = PerS.crearPersonas(mascotas);
        
        System.out.println("Estas son las personas con sus perros:");
        System.out.println(duenios);
        
    }
    
}
