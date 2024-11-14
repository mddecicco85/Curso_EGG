/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Servicio.FechaServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        FechaServicio FS = new FechaServicio();
        Date fecha = new Date();
        
        //fechaN = FS.fechaNacimiento(fecha);
        //System.out.println(fechaN.toString());
        //System.out.println("Su fecha de nacimiento es " + fechaN.getDate() + "-" + (fechaN.getMonth()+1) + "-" + (fechaN.getYear()+1900));
        
        //Este es mejor que el otro, mas parecido a la consigna
        Date fechaN = FS.fechaNac(fecha);
        System.out.println(fechaN.toString());
        System.out.println("Su fecha de nacimiento es " + fechaN.getDate() + "-" + (fechaN.getMonth()+1) + "-" + (fechaN.getYear()+1900));
        
        Date fechaAct = FS.fechaActual();
        System.out.println("La fecha actual es " + fechaAct.getDate() + "-" + (fechaAct.getMonth()+1) + "-" + (fechaAct.getYear()+1900));
        System.out.println(fechaAct.toString());
        
        Date edad = FS.diferencia(fechaN, fechaAct);
        System.out.println("La edad de la persona es " + edad.getYear());
    }
    
}
