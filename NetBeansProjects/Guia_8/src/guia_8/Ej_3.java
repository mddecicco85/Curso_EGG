/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import Entidad.Persone;
import Servicio.PersoneServicio;
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
        PersoneServicio ps = new PersoneServicio();
        Persone p1 = new Persone();
        Persone p2 = new Persone();
        Persone p3 = new Persone();
        Persone p4 = new Persone();
        
        int[] indice = new int[4];
        boolean[] mayores = new boolean[4];
        for (int j = 0; j < 4; j++) {
            indice[j] = 0;
        }
        int i = 0;
        ps.crearPersona(p1, i);
        indice[i] = ps.calcularIMC(p1);
        mayores[i] = ps.esMayorDeEdad(p1);
        ps.evaluacion(i, indice, mayores);
        i++;
        ps.crearPersona(p2, i);
        indice[i] = ps.calcularIMC(p2);
        mayores[i] = ps.esMayorDeEdad(p2);
        ps.evaluacion(i, indice, mayores);
        i++;
        ps.crearPersona(p3, i);
        indice[i] = ps.calcularIMC(p3);
        mayores[i] = ps.esMayorDeEdad(p3);
        ps.evaluacion(i, indice, mayores);
        i++;
        ps.crearPersona(p4, i);
        indice[i] = ps.calcularIMC(p4);
        mayores[i] = ps.esMayorDeEdad(p4);
        ps.evaluacion(i, indice, mayores);
        ps.porcentajes(indice, mayores);
    }
    
}
