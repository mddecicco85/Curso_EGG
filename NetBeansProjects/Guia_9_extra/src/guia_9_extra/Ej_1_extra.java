/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_extra;

import Entidad.VectorAnio;
import Servicio.VectorAnioServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        VectorAnioServicio VS = new VectorAnioServicio();
        
        VectorAnio v1 = new VectorAnio();
        VS.adivinarMes(v1);
        
        VectorAnio v2 = new VectorAnio("agosto");
        VS.adivinarMes(v2);
    }
    
}
