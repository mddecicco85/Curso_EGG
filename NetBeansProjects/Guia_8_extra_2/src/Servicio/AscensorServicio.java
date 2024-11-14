/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ascensor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AscensorServicio {
    
    public Scanner leer = new Scanner(System.in);
    Ascensor asc = new Ascensor();
    
    public int subir(Ascensor asc) {
        if (asc.pisoActual < asc.maximoPisos) {
            asc.pisoActual = asc.pisoActual + 1;
        }
        System.out.println(asc.pisoActual);
        return asc.pisoActual;
    }
    
    public int bajar(Ascensor asc) {
        if (asc.pisoActual > 0) {
            asc.pisoActual = asc.pisoActual - 1;
        }
        System.out.println(asc.pisoActual);
        return asc.pisoActual;
    }
    
    public int irA(Ascensor asc) {
        int piso;
        do {
            System.out.println("A que piso desea ir?");
            piso = leer.nextInt();
        } while ((piso < 0) || (piso > asc.maximoPisos)); 
        asc.pisoActual = piso;
        //System.out.println(asc.pisoActual);
        return asc.pisoActual;
    }

}
