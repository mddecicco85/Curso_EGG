/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_13;

import Entidad.Persone;
import java.util.Scanner;
import Servicio.PersoneServicio;

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
        PersoneServicio ps = new PersoneServicio();
        
        //Persone p = new Persone(null, 0, null, 0, 0);  //Si lo pongo así, va a tomar la edad como 0 y va a ser menor de edad, sin error
        Persone p = null;
        try {
            ps.esMayorDeEdad(p);
        } catch (NullPointerException npe) {
            System.out.println("La edad está vacía.");
        }
        
//        Persone p1 = new Persone();
//        Persone p2 = new Persone();
//        Persone p3 = new Persone();
//        Persone p4 = new Persone();
//        
//        int[] indice = new int[4];
//        boolean[] mayores = new boolean[4];
//        for (int j = 0; j < 4; j++) {
//            indice[j] = 0;
//        }
//        int i = 0;
//        ps.crearPersona(p1, i);
//        indice[i] = ps.calcularIMC(p1);
//        mayores[i] = ps.esMayorDeEdad(p1);
//        ps.evaluacion(i, indice, mayores);
//        i++;
//        ps.crearPersona(p2, i);
//        indice[i] = ps.calcularIMC(p2);
//        mayores[i] = ps.esMayorDeEdad(p2);
//        ps.evaluacion(i, indice, mayores);
//        i++;
//        ps.crearPersona(p3, i);
//        indice[i] = ps.calcularIMC(p3);
//        mayores[i] = ps.esMayorDeEdad(p3);
//        ps.evaluacion(i, indice, mayores);
//        i++;
//        ps.crearPersona(p4, i);
//        indice[i] = ps.calcularIMC(p4);
//        mayores[i] = ps.esMayorDeEdad(p4);
//        ps.evaluacion(i, indice, mayores);
//        ps.porcentajes(indice, mayores);
    
    }
    
}
