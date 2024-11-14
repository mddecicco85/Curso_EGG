/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //ArrayList<Alumno> curso = new ArrayList();
    
    public ArrayList<Alumno> crearAlumno() {
        ArrayList<Alumno> curso = new ArrayList();
        //Alumno student = new Alumno();  //Si lo pongo afuera, toda la lista toma el ultimo valor
        String rta;
        do {
            Alumno student = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            student.setNombre(leer.nextLine());
            ArrayList<Integer> marks = new ArrayList(); //Creo una lista de notas auxiliar
            for (int i = 0; i < 3; i++) {
                System.out.println("Nota " + (i+1) + " ?");
                //student.getNotas().add(leer.nextInt()); CREO QUE ASI SE LO ASIGNA DIRECTAMENTE A LA LISTA ORIGINAL
                marks.add(leer.nextInt());
                leer.nextLine();
            }
            student.setNotas(marks); //Se la asgino como atributo
            curso.add(student);  //Copia lo que hay en student, por eso cambia si student cambia
            System.out.println("¿Desea ingresar otro alumno (S/N)?");
            rta = leer.next();
            leer.nextLine();
//            for (int i = 0; i < curso.size(); i++) {
//                System.out.println(curso.get(i));
//            }
        } while (rta.equalsIgnoreCase("S"));
        for (int i = 0; i < curso.size(); i++) {
            System.out.println(curso.get(i));
        }
//        for (Alumno aux : curso) {
//            System.out.println(aux);
//        }
        return curso;
    }
    
    public double notaFinal(ArrayList<Alumno> course, String nom) {
        double promedio = 0;
        //System.out.println(course);
        Iterator<Alumno> it = course.iterator();
        while (it.hasNext()) {
            Alumno alum = it.next();
            //System.out.println(it.next());
            if (alum.getNombre().equalsIgnoreCase(nom)) {
                //System.out.println(alum.getNombre());
                ArrayList<Integer> notas = alum.getNotas();
                //System.out.println(notas);
                promedio = notas.get(0) + notas.get(1) + notas.get(2);
                promedio = promedio/3;
            }
        }
        return promedio;
    }
    
}
