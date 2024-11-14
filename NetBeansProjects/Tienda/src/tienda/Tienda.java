/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author Usuario
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ProductoService PS = new ProductoService();
        FabricanteService FS = new FabricanteService();
        
        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1-Listar el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2-Listar los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3-Listar aquellos productos cuyo precio esté entre 120 y 202.");
            System.out.println("4-Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5-Listar el nombre y el precio del producto más barato.");
            System.out.println("6-Ingresar un producto a la base de datos.");
            System.out.println("7-Ingresar un fabricante a la base de datos.");
            System.out.println("8-Editar un producto con datos a elección.");
            System.out.println("9-Buscar un producto por código.");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Elija una opción.");
            opcion = leer.nextInt();
            leer.nextLine();
            System.out.println("---------------------------------------------");
        } while ((opcion < 1) || (opcion > 9));
        
        switch(opcion) {
            case 1:
                try {
                    ArrayList<String> lista = PS.listarNombres();
                    System.out.println("Estos son los nombres de los productos:");
                    System.out.println("");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 2:
                try {
                    ArrayList<Producto> productos = PS.listarNombresConPrecios();
                    System.out.println("Estos son los nombres y los precios de los productos:");
                    System.out.println("");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.print(productos.get(i).getNombre() + ", " + productos.get(i).getPrecio());
                        System.out.println("");
                    }
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 3:
                try {
                    ArrayList<Producto> prods = PS.listarProductosEntrePrecios(120, 202);
                    System.out.println("Estos son los productos entre esos precios:");
                    System.out.println("");
                    for (int i = 0; i < prods.size(); i++) {
                        System.out.println(prods.get(i).toString());
                        //System.out.println("");
                    }
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 4:
                try {
                    ArrayList<Producto> portatiles = PS.buscarPortatiles();
                    System.out.println("Estos son los productos portátiles:");
                    System.out.println("");
                    for (int i = 0; i < portatiles.size(); i++) {
                        System.out.println(portatiles.get(i).toString());
                        //System.out.println("");
                    }
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 5:
                try {
                    ArrayList<Producto> listado = PS.productoMasBarato();
                    System.out.println("Este es el producto más barato:");
                    System.out.println("");
                    for (int i = 0; i < listado.size(); i++) {
                        System.out.print(listado.get(i).getNombre() + ", " + listado.get(i).getPrecio());
                        System.out.println("");
                    }
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 6:
                try {
                    //PS.crearProducto(12, "hola", 500, 7);
                    PS.crearProducto(12, "", 10, 7);
                    System.out.println("Se ha agregado el producto con éxito.");
                } catch (Exception e) {
                    throw e;
                }
                break;
            case 7:
                try {
                    //FS.crearFabricante(10, "Pirulo");
                    FS.crearFabricante(4, "hola");
                    System.out.println("Se ha agregado el fabricante con éxito.");
                } catch (Exception e) {
                }
                break;
            case 9:
                try {
                    System.out.println("Ingrese el código.");
                    int codigo = leer.nextInt();
                    leer.nextLine();
                    Producto prod = PS.buscarPorCodigo(codigo);
                    System.out.println("Este es el producto con ese código:");
                    System.out.println("");
                    System.out.println(prod.toString());
            } catch (Exception e) {
            }
        }
    }
    
}
