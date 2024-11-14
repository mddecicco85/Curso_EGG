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
public class Cuenta {
    
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que cantidad desea retirar?");
        double retira = leer.nextDouble();
        while (retira > saldo) {
            System.out.println("La cantidad no puede ser mayor al saldo");
            System.out.println("Que cantidad desea retirar?");
            retira = leer.nextDouble();
        }
        saldo -= retira;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
}
