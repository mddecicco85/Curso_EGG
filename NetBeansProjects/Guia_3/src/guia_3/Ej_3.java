/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor en euros");
        double euros = leer.nextDouble();
        String moneda = "";
        do {
            System.out.println("A que desea convertirlo (dolares, yenes o libras)?");
            moneda = leer.next();
        } while (!"dolares".equals(moneda) && !"yenes".equals(moneda) && !"libras".equals(moneda));
        convierte(euros, moneda);
    }
    
    public static void convierte(double euros, String moneda) {
        double cambio = 0;
        switch (moneda) {
            case "libras":
                cambio = euros * 0.86;
                break;
            case "dolares":
                cambio = euros * 1.28611;
                break;
            case "yenes":
                cambio = euros * 129.852;
                break;
        }
        System.out.println("El valor en " + moneda + " es " + cambio);
    }
    
}
