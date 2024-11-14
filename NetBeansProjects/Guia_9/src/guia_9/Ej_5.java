/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaServicio PS = new PersonaServicio();
        
        Persona p1 = PS.crearPersona();
        //System.out.println("La persona se llama " + p1.getNombre() + " y nacio el " + p1.getFechaNac());
        int edad = PS.calcularEdad(p1);
        //System.out.println("La persona tiene " + edad + " años");
        
        System.out.println("Ingrese una edad para compararla con la de la persona");
        int age = leer.nextInt();
        leer.nextLine();
        Persona p2 = new Persona();
        p2.setNombre("Juan Perez");
        Date fecha = new Date(1991 - 1900, 5 - 1, 18);
        p2.setFechaNac(fecha);
        //System.out.println(p2.toString());
        //boolean menor = PS.menorQue(p2, age);
        boolean menor = PS.menorQue(p1, age);
        System.out.println("La persona " + p1.getNombre() + " es menor que la edad ingresada? " + menor);
        
        PS.mostrarPersona(p1);
        PS.mostrarPersona(p2);
    }
}
//setTime(milisegundos)
//getTime(hago resta de milisegundos)