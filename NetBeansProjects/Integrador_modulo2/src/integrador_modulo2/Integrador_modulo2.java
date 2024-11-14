/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador_modulo2;

import Entidad.Estudiante;
import Servicio.EstudianteServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Integrador_modulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        EstudianteServicio ES = new EstudianteServicio();
        
        Estudiante[] curso = ES.llenaCurso();
        ES.mostrarCurso(curso);
        double promedio = ES.calculaPromedio(curso);
        String[] destacados = ES.mejorPromedio(curso, promedio);
        System.out.println("Los nombres de los alumnos que superaron el promedio:");
        System.out.println(Arrays.toString(destacados));
        ES.mostrarMejores(curso, promedio);
    }
    
}
