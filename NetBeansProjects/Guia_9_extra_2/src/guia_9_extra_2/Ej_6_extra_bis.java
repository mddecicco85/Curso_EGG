/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_extra_2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_6_extra_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes en numero");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        Date fechaN = new Date(anio - 1900, mes - 1, dia);
        Date hoy = new Date();
        //System.out.println(fechaN.getTime());
        //System.out.println(hoy.getTime());
        System.out.println(fechaN.toString());
        System.out.println(hoy.toString());
        //Date edad = new Date();
        //edad.setTime(10000000);
        //System.out.println(edad.toString());
        int anios;
        int meses;
        int dias;
        if (hoy.getMonth() > fechaN.getMonth()) {
            anios = hoy.getYear() - fechaN.getYear();
        } else if (hoy.getMonth() < fechaN.getMonth()) {
            anios = hoy.getYear() - fechaN.getYear() - 1;
        } else { //Si son iguales
            if (hoy.getDate() >= fechaN.getDate()) {
                anios = hoy.getYear() - fechaN.getYear();
            } else {
                anios = hoy.getYear() - fechaN.getYear() - 1;
            }
        }
        meses = hoy.getMonth() - fechaN.getMonth();
        dias = hoy.getDate() - fechaN.getDate();
        if (meses < 0) {
            meses += 12;
        }
        if (dias < 0) {
            dias += 30;
        }
        System.out.print("Usted tiene " + anios + " años, " + meses + " meses y " + dias + " dias = " + (dias+meses*30+anios*365) + " dias");
        System.out.println("");
    }
    
}
