/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Servicio.ParDeNumerosServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ParDeNumerosServicio PS = new ParDeNumerosServicio();
        
        PS.mostrarValores();
        double mayor = PS.devolverMayor();
        System.out.println("El mayor es " + mayor);
        PS.calcularPotencia();
        PS.calculaRaiz();
    }
    
}
