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
public class Puntos {
    
    public int x1, y1, x2, y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas enteras del primer punto");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas enteras del segundo punto");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
    }
    
    public double distanciaPuntos() {
        double distancia = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        return distancia;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
    
}
