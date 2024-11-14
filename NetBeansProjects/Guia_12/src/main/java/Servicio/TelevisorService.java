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
public class TelevisorService extends ElectrodomesticoService {
    
    public Televisor crearTelevisor() {
    
        Electrodomestico elect = crearElectrodomestico();  //Tengo que crear un Electrodomestico, porque eso es lo que devuelve
        
        System.out.println("Ingrese la resolución del televisor (en pulgadas).");
        int resolucion = leer.nextInt();
        leer.nextLine();
        
        boolean TDT = false;
        System.out.println("¿El televisor tiene sintonizador TDT (S/N)?");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("S")) {
            TDT = true;
        } else if (letra.equalsIgnoreCase("N")) {
            TDT = false;
        }
        
        Televisor tv = new Televisor();
        tv.setPrecio(elect.getPrecio());
        tv.setColor(elect.getColor());
        tv.setConsumoEnergetico(elect.getConsumoEnergetico());
        tv.setPeso(elect.getPeso());
        tv.setResolucion(resolucion);
        tv.setTDT(TDT);
        
        return tv;
    }
    
    @Override
    public void precioFinal() {
        Televisor tv = crearTelevisor();
        
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
    }
   
    
}
