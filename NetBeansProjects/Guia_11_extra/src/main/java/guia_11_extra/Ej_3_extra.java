/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_11_extra;

import Entidad.Cliente;
import Entidad.Poliza;
import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3_extra {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poliza pol = new Poliza();  //Creo la poliza
        
        Cliente customer = new Cliente();  //Creo el cliente
        customer = customer.ingresarCliente(customer);
        pol.setDuenio(customer);  //Lo guardo en la poliza
        System.out.println(customer.toString());
        System.out.println("-------------------------------------------------");
        
        Vehiculo auto = new Vehiculo();  //Creo el vehiculo
        auto = auto.ingresarVehiculo(auto);
        pol.setAuto(auto);  //Lo guardo en la poliza
        System.out.println(auto.toString());
        System.out.println("-------------------------------------------------");
        
        pol = pol.ingresarPoliza(pol);
        System.out.println(pol.toString());
        
    }
    
}
