/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rectangulo;
import Interfaz.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RectanguloService implements CalculosFormas {
    
    public Scanner leer = new Scanner(System.in);
    
    public Rectangulo r;
    
    @Override
    public void calcularArea() {
        System.out.println("Ingrese la base del rectángulo.");
        double b = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese la altura del rectángulo.");
        double h = leer.nextDouble();
        leer.nextLine();
        r = new Rectangulo(b, h);
        System.out.println("El área del rectángulo es " + r.base * r.altura);
    }
    
    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectángulo es " + 2 * (r.base + r.altura));
    }
    
}
