/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Persona p = new Persona();
    
    public Persona crearPersona() {
        Persona pers = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        pers.setNombre(leer.nextLine());
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el mes de nacimiento (en numero)");
        int mes = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        leer.nextLine();
        Date fecha = new Date(anio - 1900, mes -1, dia);
        pers.setFechaNac(fecha);
        return pers;
    }
    
    public int calcularEdad(Persona pers) {
        Date fechaAct = new Date();
        int edad;
        if (fechaAct.getMonth() > pers.getFechaNac().getMonth()) {  //Ya cumplio los años
            edad = fechaAct.getYear() - pers.getFechaNac().getYear(); 
        } else if (fechaAct.getMonth() == pers.getFechaNac().getMonth()) { //Mismo mes
            if (fechaAct.getDate() >= pers.getFechaNac().getDate()) { //Me fijo el dia
                edad = fechaAct.getYear() - pers.getFechaNac().getYear();
            } else {
                edad = fechaAct.getYear() - pers.getFechaNac().getYear() - 1;
            }
        } else { //No llego al mes
            edad = fechaAct.getYear() - pers.getFechaNac().getYear() - 1;
        }
        //System.out.println("La persona tiene " + edad + " años");
        return edad;
    }
    
    public boolean menorQue(Persona p, int age) {
        boolean menor;
        int edad = calcularEdad(p);
        if (edad < age) {
            menor = true;
        } else {
            menor = false;
        }
        return menor;
    }
    
    public void mostrarPersona(Persona p) {
        System.out.println("La persona " + p.getNombre() + " nacio el " + p.getFechaNac());
        int edad = calcularEdad(p);
        System.out.println("Tiene " + edad + " años");
    }
}
