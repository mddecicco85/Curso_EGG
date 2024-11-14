/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {
    
    public int veces1;   //Veces que gano cada uno
    public int veces2;
    public int intentos_max;
    
    public Juego() {
        veces1 = 0;  //Se puede inicializar desde el constructor
        veces2 = 0;
    }
    
    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        //Faltaria validar que los numeros ingresados sean del 1 al 10
        System.out.println("Jugador 1, elija un numero entre 1 y 10");
        int numero = leer.nextInt();
        int intentos = 0;
        int prueba;
        do {
            intentos++;
            System.out.println("Jugador 2, trate de adivinarlo");
            prueba = leer.nextInt();
            if ((prueba < numero) && (intentos < 3)) {
                System.out.println("Mas alto");
                //intentos++;
            } else if ((prueba > numero) && (intentos < 3)) {
                System.out.println("Mas bajo");
                //intentos++;
            } else if (prueba == numero) {
                System.out.println("Es el numero correcto");
                break;
            }
        } while (intentos < 3);
        if ((intentos <= 3) && (prueba == numero)) {
            veces2++;
        } else {
            System.out.println("Se acabaron los intentos");
            veces1++;
        }
    }
    
}
