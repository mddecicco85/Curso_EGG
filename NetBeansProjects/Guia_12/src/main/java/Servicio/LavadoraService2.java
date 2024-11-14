/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;

/**
 *
 * @author Usuario
 */
public class LavadoraService2 extends ElectrodomesticoService2 {
    
    public Lavadora crearLavadora(Double precio, String color, char consumoEnergetico, Double peso, Double carga) {
        
        Electrodomestico elect = crearElectrodomestico(precio, color, consumoEnergetico, peso);  //Tengo que crear un Electrodomestico, porque eso es lo que devuelve
        
        //Tomo los atributos del electrodomestico y se los pongo al constructor
        Lavadora lav = new Lavadora(elect.getPrecio(), elect.getColor(), elect.getConsumoEnergetico(), elect.getPeso(), carga);
        
        return lav;
    }
    
    @Override
    public Electrodomestico precioFinal(Double precio, String color, char consumoEnergetico, Double peso, Double carga, int resolucion, boolean TDT) {
        Lavadora lav = crearLavadora(precio, color, consumoEnergetico, peso, carga);
        
        switch (lav.getConsumoEnergetico()) {  //Aumento el precio según el consumo energetico
            case 'A':
                lav.setPrecio(lav.getPrecio() + 1000);
                break;
            case 'B':
                lav.setPrecio(lav.getPrecio() + 800);
                break;
            case 'C':
                lav.setPrecio(lav.getPrecio() + 600);
                break;
            case 'D':
                lav.setPrecio(lav.getPrecio() + 500);
                break;
            case 'E':
                lav.setPrecio(lav.getPrecio() + 300);
                break;
            case 'F':
                lav.setPrecio(lav.getPrecio() + 100);
                break;
        }
        
        double p = lav.getPeso();  //Aumento el precio según el peso
        if ((p >= 1) && (p < 20)) {
            lav.setPrecio(lav.getPrecio() + 100);
        } else if ((p >= 20) && (p < 50)) {
            lav.setPrecio(lav.getPrecio() + 500);
        } else if ((p >= 50) && (p < 80)) {
            lav.setPrecio(lav.getPrecio() + 800);
        } else if (p >= 80) {
            lav.setPrecio(lav.getPrecio() + 1000);
        }
        
        if (lav.getCarga() > 30) {  //Aumento el precio si la carga es mayor a 30
            lav.setPrecio(lav.getPrecio() + 500);
        }
        
        System.out.println("El precio final es " + lav.getPrecio());    
        
        System.out.println(lav.toString());
        
        return lav;
    }
    
    
}
