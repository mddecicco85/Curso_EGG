/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FechaServicio {
    public Scanner leer = new Scanner(System.in);
    Date fecha = new Date();
    
    public Date fechaNacimiento(Date fechaN) {
        System.out.println("Ingrese su año de nacimiento");
        fechaN.setYear(leer.nextInt()-1900);
        leer.nextLine();
        System.out.println("Ingrese el mes en numero");
        fechaN.setMonth(leer.nextInt()-1);
        leer.nextLine();
        System.out.println("Ingrese el dia");
        fechaN.setDate(leer.nextInt());
        leer.nextLine();
        return fechaN;
    }
    
    public Date fechaNac(Date fechaNac) {
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el mes en numero");
        int mes = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        leer.nextLine();
        fechaNac = new Date(anio - 1900, mes - 1, dia);
        return fechaNac;
    }
    
    public Date fechaActual() {
        Date fechaAct = new Date();
        //System.out.println("La fecha actual es " + fechaAct.getDate() + "-" + (fechaAct.getMonth()+1) + "-" + (fechaAct.getYear()+1900));
        //System.out.println(fechaAct.toString());
        return fechaAct;
    }
    
    public Date diferencia(Date fechaN, Date fechaHoy) {
        Date edad = new Date();
        //edad.setYear(fechaHoy.getYear() - fechaN.getYear());
        //edad.setMonth(fechaHoy.getMonth() - fechaN.getMonth());
        if (fechaHoy.getMonth() > fechaN.getMonth()) {  //Ya cumplio los años
            edad.setYear(fechaHoy.getYear() - fechaN.getYear()); 
        } else if (fechaHoy.getMonth() == fechaN.getMonth()) { //Mismo mes
            if (fechaHoy.getDate() >= fechaN.getDate()) { //Me fijo el dia
                edad.setYear(fechaHoy.getYear() - fechaN.getYear());
            } else {
                edad.setYear(fechaHoy.getYear() - fechaN.getYear() - 1);
            }
        } else { //No llego al mes
            edad.setYear(fechaHoy.getYear() - fechaN.getYear() - 1);
        }
        return edad;
    }
}
