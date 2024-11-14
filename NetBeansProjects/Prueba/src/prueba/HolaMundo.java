/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //Muestra un mensaje por pantalla
        System.out.println("Ingrese su nombre:");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //Mostramos por consola un saludo personalizado
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}
