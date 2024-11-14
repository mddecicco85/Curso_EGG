/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaBancariaServicio {
    
    public Scanner leer = new Scanner(System.in);
    
    CuentaBancaria cb = new CuentaBancaria();
    
    double monto;
    
    public void crearCuenta(CuentaBancaria cb) {
        System.out.println("Ingrese su numero de cuenta");
        cb.setNumeroCuenta(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese su DNI");
        cb.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo");
        cb.setSaldoActual(leer.nextDouble());
    }
    
    public double ingresar(CuentaBancaria cb) {
        System.out.println("¿Que cantidad desea ingresar?");
        monto = leer.nextDouble();
        cb.setSaldoActual(cb.getSaldoActual() + monto);
        return cb.getSaldoActual();
    }
    
    public double retirar(CuentaBancaria cb) {
        System.out.println("¿Que cantidad desea retirar?");
        monto = leer.nextDouble();
        if (monto > cb.getSaldoActual()) {
            System.out.println("No se puede retirar mas que el saldo");
            System.out.println("Se le entrega todo su saldo");
            cb.setSaldoActual(0);
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - monto);
        }
        leer.nextLine();
        return cb.getSaldoActual();
    }
    
    public double extraccionRapida(CuentaBancaria cb) {
        System.out.println("¿Que cantidad desea retirar?");
        monto = leer.nextDouble();
        if (monto > 0.2 * cb.getSaldoActual()) {
            System.out.println("No puede retirar mas del 20% de su saldo");
            System.out.println("Se le entrega el 20% de su saldo");
            cb.setSaldoActual(0.8 * cb.getSaldoActual());
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - monto);
        }
        return cb.getSaldoActual();
    }
    
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo actual es " + cb.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println(cb.toString());
    }
}
