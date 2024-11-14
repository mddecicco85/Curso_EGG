/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CursoServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso c1 = new Curso();
    
    public String[] cargarAlumnos() {
        //Curso c1 = new Curso();
        String[] alumnado = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            alumnado[i] = leer.nextLine();
        }
        c1.setAlumnos(alumnado);
        return c1.getAlumnos();
    }
    
    public void mostrarCurso() {
        //System.out.println(Arrays.toString(c1.getAlumnos()));
        //Esto era para mostrar solo alumnos si no modificaba el toString
        //Otra forma de mostrar el vector es igualarlo a un vector nuevo, y mostrar las componentes del nuevo
        System.out.println(c1.toString());
    }
    
    public void crearCurso() {
        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia");
        c1.setCantidadHorasPorDia(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la cantidad de dias por semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el turno (1-Mañana, 2-Tarde)");
        c1.setTurno(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el precio por hora");
        c1.setPrecioPorHora(leer.nextDouble());
        leer.nextLine();
        c1.setAlumnos(cargarAlumnos());
    }
    
    public void calcularGanaciaSemanal() {
        double ganancia = c1.getPrecioPorHora() * c1.getCantidadHorasPorDia() * c1.getCantidadDiasPorSemana() * 5;
        System.out.println("La ganacia semanal es " + ganancia);
    }
}
