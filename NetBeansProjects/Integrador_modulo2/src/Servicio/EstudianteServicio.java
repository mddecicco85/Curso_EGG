/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstudianteServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante[] llenaCurso() {
        Estudiante[] curso = new Estudiante[8];
        curso[0] = new Estudiante("Juan Perez", 7.5);
        curso[1] = new Estudiante("Maria Garcia", 6);
        curso[2] = new Estudiante("Martin De Cicco", 8);
        //curso[2] = new Estudiante("Martin De Cicco", 4);
        //curso[3] = new Estudiante("Natalia Lopez", 9.5);
        curso[3] = new Estudiante("Natalia Lopez", 7.5);
        curso[4] = new Estudiante("Ignacio Guebara", 5.5);
        curso[5] = new Estudiante("Matias Garcia", 4);
        curso[6] = new Estudiante("Julieta Echeverria", 10);
        //curso[6] = new Estudiante("Julieta Echeverria", 1);
        curso[7] = new Estudiante("Manuel Giles", 5);
        return curso;
    }
    
    public double calculaPromedio(Estudiante[] curso) {
        double prom = 0;
        for (int i = 0; i < 8; i++) {
            prom += curso[i].getNota();
        }
        prom = prom/8;
        System.out.println("El promedio del curso es " + prom);
        return prom;
    }
    
    public String[] mejorPromedio(Estudiante[] curso, double promedio) {
        int cant = 0;
        for (int i = 0; i < 8; i++) { //Cuento cuantos hay mayores al promedio
            if (curso[i].getNota() > promedio) {
                cant++;
            }
        }
        //System.out.println(cant);
        String[] mejores = new String[cant];
        Arrays.fill(mejores, "");
        boolean bandera = false;
        //Hago el primer elemento por separado
        for (int i = 0; i < 8; i++) {
                if (curso[i].getNota() > promedio) {
                    mejores[0] = curso[i].getNombre();
                }
                if (mejores[0] != "") {
                    break;
                }
            }
        for (int j = 1; j < cant; j++) {
            for (int i = j; i < 8; i++) {
                //Hago esto porque puede repetir el nombre si habia uno con bajo promedio en el medio
                if ((curso[i].getNota() > promedio) && (mejores[j-1] != curso[i].getNombre())) {
                    mejores[j] = curso[i].getNombre();
                }
                if (mejores[j] != "") {
                    break;
                }
            }
        }
        return mejores;
        //Otra forma seria ordenar el vector con las notas, y que imprima los nombres de los primeros 4
    }
    
    public void mostrarMejores(Estudiante[] curso, double promedio) {
        System.out.println("Estos son los alumnos mejores que el promedio:");
        for (int i = 0; i < 8; i++) {
            if (curso[i].getNota() > promedio) {
                System.out.print(curso[i].getNombre() + ", " + curso[i].getNota());
                System.out.println("");
            }
        }
    }
    
    public void mostrarCurso(Estudiante[] curso) {
        for (int i = 0; i < 8; i++) {
            System.out.print(curso[i].getNombre() + ", " + curso[i].getNota());
            System.out.println("");
        }
    }
    
}
