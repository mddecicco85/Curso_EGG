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
public class LavadoraService extends ElectrodomesticoService {
    
    public Lavadora crearLavadora() {
        
        Electrodomestico elect = crearElectrodomestico();  //Tengo que crear un Electrodomestico, porque eso es lo que devuelve
        
        System.out.println("Ingrese la carga de la lavadora.");
        double carga = leer.nextDouble();
        leer.nextLine();

        //Tomo los atributos del electrodomestico y se los pongo al constructor
        //Lavadora lav = new Lavadora(elect.getPrecio(), elect.getColor(), elect.getConsumoEnergetico(), elect.getPeso(), carga);
        
        //Tambien se puede hacer asi. Con el de arriba me decia que lav era redundante
        Lavadora lav = new Lavadora();
        //System.out.println(lav.toString());
        lav.setPrecio(elect.getPrecio());
        lav.setColor(elect.getColor());
        lav.setConsumoEnergetico(elect.getConsumoEnergetico());
        lav.setPeso(elect.getPeso());
        lav.setCarga(carga);
        
        return lav;
    }
    
    @Override
    public void precioFinal() {
        Lavadora lav = crearLavadora();
        
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
    }
    
}
