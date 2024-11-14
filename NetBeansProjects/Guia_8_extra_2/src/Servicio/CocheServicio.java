/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Coche;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CocheServicio {
    
    public Scanner leer = new Scanner(System.in);
    Coche auto = new Coche();
    
    public void ingresarCoche() {
        System.out.println("Ingrese la marca del coche");
        auto.marca = leer.nextLine();
        System.out.println("Ingrese el modelo");
        auto.modelo = leer.nextLine();
        System.out.println("Ingrese el precio");
        auto.precio = leer.nextInt();
        leer.nextLine();
    }
    
    public void mostrarCoche() {
        System.out.println("El modelo " + auto.modelo + " de la marca " + auto.marca + " vale " + auto.precio);
    }
}
