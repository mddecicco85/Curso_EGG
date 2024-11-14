/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_extra;

import Servicio.NIFService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        NIFService serv = new NIFService();
        
        serv.crearNIF();
        serv.mostrar();
    }
    
}
