/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import Entidad.Alumno;
import Servicio.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService AS = new AlumnoService();
        //Alumno alum = new Alumno();
        
        ArrayList<Alumno> course = AS.crearAlumno();
        System.out.println("Ingrese el nombre de un alumno para calcular la nota final");
        String nom = leer.nextLine();
        //System.out.println(course);
        boolean esta = false;
        for (Alumno aux : course) {
            if (aux.getNombre().equalsIgnoreCase(nom)) {
                double prom = AS.notaFinal(course, nom);
                System.out.println("El promedio de " + nom + " es " + prom);
                esta = true;
                break;
            }
        }
        if (esta == false) {
            System.out.println("El alumno no esta en la lista");
        }
    }
    
}
