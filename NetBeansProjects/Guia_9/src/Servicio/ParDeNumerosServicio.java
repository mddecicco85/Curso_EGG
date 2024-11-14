/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ParDeNumerosServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ParDeNumeros par = new ParDeNumeros();
    
    public void mostrarValores() {
        System.out.println("Los numeros generados son " + par.getNum1() + " y " + par.getNum2());
    }
    
    public double devolverMayor() {
        double mayor;
        if (par.getNum1() >= par.getNum2()) {
            mayor = par.getNum1();
        } else {
            mayor = par.getNum2();
        }
        //System.out.println("El mayor es " + mayor);
        return mayor;
    }
    
    public void calcularPotencia() {
        double may = devolverMayor();
        int base = (int) Math.round(may);
        System.out.println(base);
        int exp = (int) Math.round(Math.min(par.getNum1(), par.getNum2()));
        //Lo pongo con el min porque es imposible saber cual de los dos es
        System.out.println(exp);
        System.out.println("El mayor redondeado elevado al menor redondeado es " + Math.pow(base, exp));
    }
    
    public void calculaRaiz() {
        double modulo = Math.abs(Math.min(par.getNum1(), par.getNum2()));
        System.out.println("La raiz cuadrada del menor es " + Math.sqrt(modulo));
    }
}
