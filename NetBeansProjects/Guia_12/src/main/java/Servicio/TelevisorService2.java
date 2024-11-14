/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Televisor;

/**
 *
 * @author Usuario
 */
public class TelevisorService2 extends ElectrodomesticoService2 {
    
    public Televisor crearTelevisor(Double precio, String color, char consumoEnergetico, Double peso, int resolucion, boolean TDT) {
    
        Electrodomestico elect = crearElectrodomestico(precio, color, consumoEnergetico, peso);  //Tengo que crear un Electrodomestico, porque eso es lo que devuelve
        
        
        Televisor tv = new Televisor(elect.getPrecio(), elect.getColor(), elect.getConsumoEnergetico(), elect.getPeso(), resolucion, TDT);
        
        return tv;
    }
    
    @Override
    public Electrodomestico precioFinal(Double precio, String color, char consumoEnergetico, Double peso, Double carga, int resolucion, boolean TDT) {
        Televisor tv = crearTelevisor(precio, color, consumoEnergetico, peso, resolucion, TDT);
        
        switch (tv.getConsumoEnergetico()) {  //Aumento el precio según el consumo energetico
            case 'A':
                tv.setPrecio(tv.getPrecio() + 1000);
                break;
            case 'B':
                tv.setPrecio(tv.getPrecio() + 800);
                break;
            case 'C':
                tv.setPrecio(tv.getPrecio() + 600);
                break;
            case 'D':
                tv.setPrecio(tv.getPrecio() + 500);
                break;
            case 'E':
                tv.setPrecio(tv.getPrecio() + 300);
                break;
            case 'F':
                tv.setPrecio(tv.getPrecio() + 100);
                break;
        }
        
        double p = tv.getPeso();  //Aumento el precio según el peso
        if ((p >= 1) && (p < 20)) {
            tv.setPrecio(tv.getPrecio() + 100);
        } else if ((p >= 20) && (p < 50)) {
            tv.setPrecio(tv.getPrecio() + 500);
        } else if ((p >= 50) && (p < 80)) {
            tv.setPrecio(tv.getPrecio() + 800);
        } else if (p >= 80) {
            tv.setPrecio(tv.getPrecio() + 1000);
        }
        
        if (tv.getResolucion() > 40) {  //Aumento el precio si la resolucion es mayor a 40
            tv.setPrecio(tv.getPrecio() * 1.3);
        }
        
        if (tv.getTDT() == true) {  //Aumento el precio si tiene sintonizador TDT
            tv.setPrecio(tv.getPrecio() + 500);
        }
        
        System.out.println("El precio final es " + tv.getPrecio());    
        
        System.out.println(tv.toString());
        
        return tv;
    }
    
}
