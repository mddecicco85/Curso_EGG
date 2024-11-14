/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cb1 = new CuentaBancaria();
        boolean bandera = true;
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1 - Crear cuenta");
            System.out.println("2 - Ingresar dinero");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Extraccion rapida");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Consultar datos");
            System.out.println("7 - Salir");
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    cbs.crearCuenta(cb1);
                    System.out.println(cb1);
                    break;
                case 2:
                    cbs.ingresar(cb1);
                    System.out.println("Su saldo actual es " + cb1.getSaldoActual());
                    break;
                case 3:
                    cbs.retirar(cb1);
                    System.out.println("Su saldo actual es " + cb1.getSaldoActual());
                    break;
                case 4:    
                    cbs.extraccionRapida(cb1);
                    System.out.println("Su saldo actual es " + cb1.getSaldoActual());
                    break;
                case 5:
                    cbs.consultarSaldo(cb1);
                    //System.out.println("Su saldo actual es " + cb1.getSaldoActual());
                    break;
                case 6:
                    cbs.consultarDatos(cb1);
                    break;
                case 7:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (bandera);
    }
    
}
