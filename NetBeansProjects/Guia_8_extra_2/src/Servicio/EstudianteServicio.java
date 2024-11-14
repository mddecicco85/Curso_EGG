/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstudianteServicio {
    
    public Scanner leer = new Scanner(System.in);
    Estudiante est = new Estudiante();
    
    public void crearEstudiante() {
        System.out.println("Ingrese el nombre del estudiante");
        est.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad");
        est.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la nota media");
        est.setNota_media(leer.nextDouble());
        leer.nextLine();
    }
    
    public void mostrarEstudiante() {
        System.out.println("El estudiante " + est.getNombre() + ", de " + est.getEdad() + " años, tiene promedio " + est.getNota_media());
    }
    
    public boolean apruebaEstudiante() {
        boolean aprobo = false;
        if (est.getNota_media() >= 7) {
            aprobo = true;
        }
        return aprobo;
    }
    
}
