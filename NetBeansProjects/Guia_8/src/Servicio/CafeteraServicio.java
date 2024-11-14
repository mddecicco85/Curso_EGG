/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraServicio {
    
    public Scanner leer = new Scanner(System.in);
    
    Cafetera caf = new Cafetera();
    
    public void llenarCafetera(Cafetera caf) {
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera caf) {
        System.out.println("Indique el tamaño de la taza");
        int tam = leer.nextInt();
        leer.nextLine();
        if (caf.getCantidadActual() < tam) {
            System.out.println("No hay suficiente cafe para llenar la taza");
            System.out.println("La taza tiene " + caf.getCantidadActual());
            caf.setCantidadActual(0);
        } else {
            System.out.println("La taza esta llena. Tiene " + tam);
            caf.setCantidadActual(caf.getCantidadActual() - tam);
        }
    }
    
    public void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera caf) {
        System.out.println("¿Que cantidad de cafe quiere agregar?");
        int cant = leer.nextInt();
        leer.nextLine();
        if (cant <= (caf.getCapacidadMaxima() - caf.getCantidadActual())) {
            caf.setCantidadActual(caf.getCantidadActual() + cant);
        } else {
            System.out.println("No hay suficiente capacidad");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }
        System.out.println("La cafetera tiene " + caf.getCantidadActual());
    }
    
    //public void consulta(int x) {
    //    System.out.println("La cantidad de cafe es " + x);
    //}
    //ESTO NO ANDA. NO SE PUEDE PASAR UN ATRIBUTO ASI
    
}
