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
public class Poliza {
    
    private Vehiculo auto;
    private Cliente duenio;
    private String numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Cuotas planCuotas;
    //private int cantidadCuotas;
    //private String formaPago;
    private double montoAsegurado;
    private boolean incluyeGranizo;
    private double maximoGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo auto, Cliente duenio, String numeroPoliza, Date fechaInicio, Date fechaFin, Cuotas planCuotas, double montoAsegurado, boolean incluyeGranizo, double maximoGranizo, String tipoCobertura) {
        this.auto = auto;
        this.duenio = duenio;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.planCuotas = planCuotas;
        //this.cantidadCuotas = cantidadCuotas;
        //this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.maximoGranizo = maximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public void setPlanCuotas(Cuotas planCuotas) {
        this.planCuotas = planCuotas;
    }

//    public void setCantidadCuotas(int cantidadCuotas) {
//        this.cantidadCuotas = cantidadCuotas;
//    }

//    public void setFormaPago(String formaPago) {
//        this.formaPago = formaPago;
//    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public void setMaximoGranizo(double maximoGranizo) {
        this.maximoGranizo = maximoGranizo;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
    
    public Cuotas getPlanCuotas() {
        return planCuotas;
    }

//    public int getCantidadCuotas() {
//        return cantidadCuotas;
//    }

//    public String getFormaPago() {
//        return formaPago;
//    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public double getMaximoGranizo() {
        return maximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "auto=" + auto + ", dueño=" + duenio + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", planCuotas=" + planCuotas + ", montoAsegurado=" + montoAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", maximoGranizo=" + maximoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

    public Poliza ingresarPoliza(Poliza pol) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de poliza.");
        pol.numeroPoliza = leer.nextLine();
        Date inicio = new Date();  //Le pongo la fecha actual para que no este vacia cuando la lee
        pol.fechaInicio = inicio;
        System.out.println("Fecha de inicio:");
        System.out.println("Ingrese el año.");
        pol.getFechaInicio().setYear(leer.nextInt() - 1900);
        leer.nextLine();
        System.out.println("Ingrese el número de mes.");
        pol.getFechaInicio().setMonth(leer.nextInt() - 1);
        leer.nextLine();
        System.out.println("Ingrese el día.");
        pol.getFechaInicio().setDate(leer.nextInt());
        leer.nextLine();
        Date fin = new Date();  //Le pongo la fecha actual para que no este vacia cuando la lee
        pol.fechaFin = fin;
        //System.out.println(pol.fechaFin);
        System.out.println("Fecha de caducación::");
        System.out.println("Ingrese el año.");
        pol.getFechaFin().setYear(leer.nextInt() - 1900);
        leer.nextLine();
        System.out.println("Ingrese el número de mes.");
        pol.getFechaFin().setMonth(leer.nextInt() - 1);
        leer.nextLine();
        System.out.println("Ingrese el día.");
        pol.getFechaFin().setDate(leer.nextInt());
        leer.nextLine();
        
        //Cargar el plan de coutas
        Cuotas plan = new Cuotas();
        plan = plan.ingresarCuotas(plan);
        pol.setPlanCuotas(plan);
        System.out.println(plan.toString());
        
        System.out.println("Ingrese el monto asegurado.");
        pol.montoAsegurado = leer.nextDouble();
        leer.nextLine();
        System.out.println("¿La poliza incluye granizo (S/N)?");
        String rta = leer.nextLine();
        if (rta.equalsIgnoreCase("S")) {
            pol.incluyeGranizo = true;
            System.out.println("¿Cuál es el monto máximo para cubrir daños por granizo?");
            pol.maximoGranizo = leer.nextDouble();
            leer.nextLine();
        } else if (rta.equalsIgnoreCase("N")) {
            pol.incluyeGranizo = false;
            pol.maximoGranizo = 0;
        }
        System.out.println("Ingrese el tipo de cobertura (total, contra terceros, etc.).");
        pol.tipoCobertura = leer.nextLine();
        return pol;
    }
    
    
}
