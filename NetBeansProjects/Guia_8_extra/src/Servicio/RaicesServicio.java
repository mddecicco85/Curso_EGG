/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaicesServicio {
    
    public Scanner leer = new Scanner(System.in);
    Raices eq = new Raices();
    
    double delta;
    
    public void crearRaices() {
        System.out.println("Ingrese el coeficiente cuadratico");
        eq.a = leer.nextDouble();
        System.out.println("Ingrese el coeficiente lineal");
        eq.b = leer.nextDouble();
        System.out.println("Ingrese el termino indpendiente");
        eq.c = leer.nextDouble();
        System.out.println("La ecuacion es " + eq.a + " x^2 + " + eq.b + " x + " + eq.c);
    }
    
    public double getDiscriminante() {
        delta = Math.pow(eq.b,2) - 4*eq.a*eq.c;
        System.out.println("El discriminante es " + delta);
        return delta;
    }
    
    public boolean tieneRaices() {
        boolean reales = false;
        if (delta > 0) {
            reales = true;
            System.out.println("La ecuacion tiene raices reales");
        } else if (delta < 0) {
            reales = false;
            System.out.println("La ecuacion no tiene raices reales");
        }
        return reales;
    }
    
    public boolean tieneRaiz() {
        boolean doble = false;
        if (delta == 0) {
            doble = true;
            System.out.println("La ecuacion tiene dos raices reales iguales");
        }
        return doble;
    }
    
    public void obtenerRaices() {
        boolean verdad = tieneRaices();
        if (verdad == true) {
            double x1 = (-eq.b + Math.sqrt(delta))/(2*eq.a);
            double x2 = (-eq.b - Math.sqrt(delta))/(2*eq.a);
            System.out.println("Las raices son " + x1 + " y " + x2);
        }
    }
    
    public void obtenerRaiz() {
        boolean unica = tieneRaiz();
        if (unica == true) {
            double x = -eq.b/(2*eq.a);
            System.out.println("La ecuacion tiene la raiz doble " + x);
        }
    }
    
    public void calcular() {
        obtenerRaices();
        obtenerRaiz();
    }
}
