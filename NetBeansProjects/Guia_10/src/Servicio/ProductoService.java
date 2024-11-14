/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProductoService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashMap<String, Double> productos = new HashMap();
    
    public void ingresarProducto() {
        //HashMap<String, Double> productos = new HashMap();
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio del producto");
        Double precio = leer.nextDouble();
        leer.nextLine();
        productos.put(nombre, precio);
        //return productos;
    }
    
    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto cuyo precio quiere modificar");
        String prod = leer.nextLine();
        boolean bandera = false;
        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            if (entry.getKey().equalsIgnoreCase(prod)) {
                System.out.println("¿Cuál es el nuevo precio de " + prod + "?");
                Double nuevo = leer.nextDouble();
                leer.nextLine();
                entry.setValue(nuevo);
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("No se encontró ese producto");
        }
    }
    
    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String prod = leer.nextLine();
        boolean bandera = false;
        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            if (entry.getKey().equalsIgnoreCase(prod)) {
                it.remove();
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("No se encontró ese producto");
        }
        //Tambien se puede hacer asi
//        if (productos.containsKey(prod)) {
//            productos.remove(prod);
//            System.out.println("Producto eliminado exitosamente.");
//        } else {
//            System.out.println("El producto no existe.");
//        }

    }
    
    public void mostrarProductos() {
        System.out.println("Estos son los productos disponibles:");
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("-Producto: " + key + ", Precio: " + value);
        }
    }
}
