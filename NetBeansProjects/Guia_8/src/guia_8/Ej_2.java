/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        c1.setCapacidadMaxima(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingrese la cantidad actual de cafe");
        c1.setCantidadActual(leer.nextInt());
        leer.nextLine();
        
        System.out.println(c1);
        
        boolean bandera = true;
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Servir taza");
            System.out.println("3 - Vaciar cafetera");
            System.out.println("4 - Agregar cafe");
            System.out.println("5 - Salir");
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    cs.llenarCafetera(c1);
                    System.out.println("La cantidad de cafe es " + c1.getCantidadActual());
                    break;
                case 2:
                    //cs.consulta(int c1.getCantidadActual()); ESTO NO ANDA. NO SE PUEDE PASAR UN ATRIBUTO ASI
                    cs.servirTaza(c1);
                    break;
                case 3:
                    cs.vaciarCafetera(c1);
                    System.out.println("La cafetera tiene " + c1.getCantidadActual());
                    break;
                case 4:
                    cs.agregarCafe(c1);
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (bandera);    
    }
    
}
