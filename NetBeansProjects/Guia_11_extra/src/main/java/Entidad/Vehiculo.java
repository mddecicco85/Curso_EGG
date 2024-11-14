/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private String numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    
    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, int anio, String numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }
    
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public String getNumeroMotor() {
        return numeroMotor;
    }
    
    public String getChasis() {
        return chasis;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    public Vehiculo ingresarVehiculo(Vehiculo v) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la marca del vehículo.");
        v.marca = leer.nextLine();
        System.out.println("Ingrese el modelo.");
        v.modelo = leer.nextLine();
        System.out.println("Ingrese el año.");
        v.anio = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el número de motor.");
        v.numeroMotor = leer.nextLine();
        System.out.println("Ingrese el número de chasis.");
        v.chasis = leer.nextLine();
        System.out.println("Ingrese el color.");
        v.color = leer.nextLine();
        System.out.println("Ingrese el tipo (camioneta, sedán, etc.).");
        v.tipo = leer.nextLine();
        return v;
    }
    
}
