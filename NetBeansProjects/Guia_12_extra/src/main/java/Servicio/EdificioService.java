/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Edificio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class EdificioService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
    public void crearEdificio(Edificio e) {
        System.out.println("Ingrese el ancho del edificio.");
        e.setAncho(leer.nextDouble());
        leer.nextLine();
        System.out.println("Ingrese el alto.");
        e.setAlto(leer.nextDouble());
        leer.nextLine();
        System.out.println("Ingrese el largo.");
        e.setLargo(leer.nextDouble());
        leer.nextLine();
    }
    
}
