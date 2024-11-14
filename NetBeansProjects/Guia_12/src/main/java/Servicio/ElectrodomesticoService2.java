/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ElectrodomesticoService2 {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean comprobarConsumoEnergetico(char letra) {
        boolean valido = false;
        if ((letra == 'A') || (letra == 'B') || (letra == 'C') || (letra == 'D') || (letra == 'E') || (letra == 'F')) {
            valido = true;
        }
        return valido;
    }
    
    public boolean comprobarColor(String color) {
        boolean vale = false;
        if ((color.equalsIgnoreCase("blanco")) || (color.equalsIgnoreCase("negro")) || (color.equalsIgnoreCase("rojo")) || 
                (color.equalsIgnoreCase("azul")) || (color.equalsIgnoreCase("gris"))) {
            vale = true;
        }
        return vale;
    }
    
    public Electrodomestico crearElectrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        Electrodomestico electro = new Electrodomestico(precio, color, consumoEnergetico, peso);
        
        //electro.setColor(color);  //Le asigno el color. Si esta mal, despues lo sobreescribo
        boolean vale = comprobarColor(color);
        if (vale == false) {
            electro.setColor("Blanco");
        }
        
        boolean valido = comprobarConsumoEnergetico(consumoEnergetico);
        if (valido == false) {
            electro.setConsumoEnergetico('F');  //Si es falso, pone letra F
        }
        
        return electro;
    }
    
    public Electrodomestico precioFinal(Double precio, String color, char consumoEnergetico, Double peso, Double carga, int resolucion, boolean TDT) {
        Electrodomestico ele = crearElectrodomestico(precio, color, consumoEnergetico, peso);
        switch (ele.getConsumoEnergetico()) {  //Aumento el precio según el consumo energetico
            case 'A':
                ele.setPrecio(ele.getPrecio() + 1000);
                break;
            case 'B':
                ele.setPrecio(ele.getPrecio() + 800);
                break;
            case 'C':
                ele.setPrecio(ele.getPrecio() + 600);
                break;
            case 'D':
                ele.setPrecio(ele.getPrecio() + 500);
                break;
            case 'E':
                ele.setPrecio(ele.getPrecio() + 300);
                break;
            case 'F':
                ele.setPrecio(ele.getPrecio() + 100);
                break;
        }
        double p = ele.getPeso();  //Aumento el precio según el peso
        if ((p >= 1) && (p < 20)) {
            ele.setPrecio(ele.getPrecio() + 100);
        } else if ((p >= 20) && (p < 50)) {
            ele.setPrecio(ele.getPrecio() + 500);
        } else if ((p >= 50) && (p < 80)) {
            ele.setPrecio(ele.getPrecio() + 800);
        } else if (p >= 80) {
            ele.setPrecio(ele.getPrecio() + 1000);
        }
        System.out.println("El precio final es " + ele.getPrecio()); 
        
        System.out.println(ele.toString());
        
        return ele;
    }
    
    
}
