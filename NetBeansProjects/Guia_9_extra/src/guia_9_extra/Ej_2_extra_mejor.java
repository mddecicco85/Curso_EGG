/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_extra;

import Servicio.AhorcadoService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2_extra_mejor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AhorcadoService AS = new AhorcadoService();
        //Ahorcado ah = new Ahorcado();
        
        //ah = AS.crearJuego();
        //AS.longitud(ah);
        //AS.buscar(ah);
        //AS.encontradas(ah);
        AS.juego();
    }
    
}