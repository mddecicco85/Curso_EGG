/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_extra;

import Entidad.Alumno;
import Entidad.Simulador;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Ej_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Simulador sim = new Simulador();
        
        //ArrayList<Alumno> curso;  //No hace falta instanciar la lista
        ArrayList<String> curso;  //Aca voy a guardar los nombres completos
        curso = sim.generaListado();
        System.out.println("Nombres completos:");
        System.out.println(curso);
        
        ArrayList<Integer> dnis;  //Aca voy a guardar los DNIs
        dnis = sim.generaDnis();
        System.out.println("DNIs:");
        System.out.println(dnis);
        System.out.println("-----------------------------------------------------------");
        
        int cant;
        do {
            System.out.println("Ingrese la cantidad de alumnos (entre 1 y 15)");
            cant = leer.nextInt();
            leer.nextLine();
        } while ((cant < 1) || (cant > 15));
        
        ArrayList<Alumno> alumnado;  //Aca voy a guardar la lista de alumnos
        alumnado = sim.asignaDnis(curso, dnis, cant);
        System.out.println("Curso completo:");
        System.out.println(alumnado);
        
        ArrayList<Voto> listaVotos = sim.votacion(alumnado);  //Aca voy a guardar la lista de votos
        //System.out.println(listaVotos);
        
        sim.mostrarVotacion(listaVotos, alumnado);
        
        sim.recuentoDeVotos(alumnado);
        
        sim.desginaFacilitadores(alumnado);
    }
    
}
