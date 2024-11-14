/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.VectorAnio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VectorAnioServicio {
    
    public Scanner leer = new Scanner(System.in);
    //VectorAnio v = new VectorAnio();  //Si lo pongo aca no puedo cambiar el mes secreto
    
    public void adivinarMes(VectorAnio v) {
        System.out.println(Arrays.toString(v.getMeses()));
        String mes;
        int intentos = 0;
        do {
            System.out.println("Adivine el mes secreto. Escribalo en minusculas");
            mes = leer.nextLine();
            intentos++;
            if (mes.equals(v.getMesSecreto())) {
                System.out.println("Ha acertado");
            } else {
                System.out.println("No ha acertado");
            }
        } while ((!mes.equals(v.getMesSecreto())) && (intentos < 3));
    }
    
}
