/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuotas {
    
    private int cantidadCuotas;
    private int numeroCuota;
    private double montoCuota;
    private boolean pagada;
    private Date fechaVencimiento;
    private String formaPago;
    
    public Cuotas() {
    }
    
    public Cuotas(int cantidadCuotas, int numeroCuota, double montoCuota, boolean pagada, Date fechaVencimiento, String formaPago) {
        this.cantidadCuotas = cantidadCuotas;
        this.numeroCuota = numeroCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "cantidadCuotas=" + cantidadCuotas + ", numeroCuota=" + numeroCuota + ", montoCuota=" + montoCuota + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
    public Cuotas ingresarCuotas(Cuotas plan) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de cuotas.");
        plan.cantidadCuotas = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el número de cuota actual.");  //Como las incremento???
        plan.numeroCuota = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el monto de las cuotas.");
        plan.montoCuota = leer.nextDouble();
        leer.nextLine();
        System.out.println("¿La cuota actual está pagada (S/N)?");
        String rta = leer.nextLine();
        if (rta.equalsIgnoreCase("S")) {
            plan.pagada = true;
        } else if (rta.equalsIgnoreCase("N")) {
            plan.pagada = false;
        }
        Date vence = new Date();  //Le pongo la fecha actual para que no este vacia cuando la lee
        plan.fechaVencimiento = vence;
        System.out.println("Fecha de vencimiento:");
        System.out.println("Ingrese el año.");
        plan.getFechaVencimiento().setYear(leer.nextInt() - 1900);
        leer.nextLine();
        System.out.println("Ingrese el número de mes.");
        plan.getFechaVencimiento().setMonth(leer.nextInt() - 1);
        leer.nextLine();
        System.out.println("Ingrese el día.");
        plan.getFechaVencimiento().setDate(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la forma de pago (efectivo, transferencia, etc.).");
        plan.formaPago = leer.nextLine();
        return plan;
    }
    
}
