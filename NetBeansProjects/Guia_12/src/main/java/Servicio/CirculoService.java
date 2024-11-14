/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Circulo;
import Interfaz.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CirculoService implements CalculosFormas {
    
    public Scanner leer = new Scanner(System.in);
    
    public Circulo c;
    
    @Override
    public void calcularArea() {
        System.out.println("Ingrese el radio de un círculo.");
        c = new Circulo(leer.nextDouble());
        leer.nextLine();
        System.out.println("El área del círculo es " + Math.pow(c.radio, 2) * P);
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del círculo es " + 2 * P * c.radio);
    }
    
}
