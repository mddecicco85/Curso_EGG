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
public class ElectrodomesticoService {
    
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
    
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico electro = new Electrodomestico();
        electro.setPrecio(1000d);
        System.out.println("Ingrese el color del electrodoméstico.");
        String colour = leer.nextLine();
        electro.setColor(colour);  //Le asigno el color. Si esta mal, despues lo sobreescribo
        boolean vale = comprobarColor(colour);
        if (vale == false) {
            electro.setColor("Blanco");
        }
        
        System.out.println("Ingrese el consumo energético (letra entre A y F).");
        char letra = leer.next().charAt(0);
        letra = Character.toUpperCase(letra);  //La paso a mayuscula
        boolean valido = comprobarConsumoEnergetico(letra);
        if (valido == true) {
            electro.setConsumoEnergetico(letra);
        } else {
            electro.setConsumoEnergetico('F');  //Si es falso, pone letra F
        }
        
        System.out.println("Ingrese el peso.");
        electro.setPeso(leer.nextDouble());
        leer.nextLine();
        
        //double carga = 0;
        //int resolucion = 0;
        //boolean TDT = false;
        //precioFinal(electro, carga, resolucion, TDT);
        
        return electro;
    }
    
    public void precioFinal() {
        Electrodomestico ele = crearElectrodomestico();
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
    }
    
}
