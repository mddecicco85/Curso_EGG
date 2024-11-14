/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_extra_2;

import Servicio.CocheServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1_extra_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CocheServicio CS = new CocheServicio();
        
        CS.ingresarCoche();
        CS.mostrarCoche();
    }
    
}
