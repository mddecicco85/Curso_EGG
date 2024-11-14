/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import Servicio.ProductoService;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService PS = new ProductoService();
        
        //HashMap<String, Double> inventario = new HashMap();
        int opcion;
        do {
        System.out.println("MENU - ¿Qué desea realizar?");
        System.out.println("1-Ingresar un producto");
        System.out.println("2-Modificar el precio de un producto");
        System.out.println("3-Eliminar un producto");
        System.out.println("4-Mostrar productos con su precio");
        System.out.println("5-Salir");
        //System.out.println("---------------------------------------------");
        opcion = leer.nextInt();
        leer.nextLine();
        switch (opcion) {
            case 1:
                PS.ingresarProducto();
                System.out.println("---------------------------------------------");
                break;
            case 2:
                PS.modificarPrecio();
                PS.mostrarProductos();
                System.out.println("---------------------------------------------");
                break;
            case 3:
                PS.eliminarProducto();
                PS.mostrarProductos();
                System.out.println("---------------------------------------------");
                break;
            case 4:
                PS.mostrarProductos();
                System.out.println("---------------------------------------------");
                break;
        }
        } while ((opcion >= 1) && (opcion < 5));
    }
    
}
