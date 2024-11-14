/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ElectrodomesticoService2;
import Servicio.LavadoraService2;
import Servicio.TelevisorService2;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ElectrodomesticoService2 ES = new ElectrodomesticoService2();
        LavadoraService2 LS = new LavadoraService2();
        TelevisorService2 TS = new TelevisorService2();
        
        ArrayList<Electrodomestico> lista = new ArrayList();
        Electrodomestico e1 = TS.precioFinal(1000d, "negro", 'G', 50d, 0d, 30, true);
        lista.add(e1);
        Electrodomestico e2 = LS.precioFinal(1000d, "verde", 'B', 10d, 40d, 0, false);
        lista.add(e2);
        Electrodomestico e3 = TS.precioFinal(1000d, "azul", 'D', 80d, 0d, 50, false);
        lista.add(e3);
        Electrodomestico e4 = LS.precioFinal(1000d, "violeta", 'A', 30d, 30d, 0, false);
        lista.add(e4);
        
        //System.out.println(lista);
        System.out.println("-------------------------------------------------");
        System.out.println("Estos son los electrodomésticos de la lista:");
        for (Electrodomestico aux : lista) {
            System.out.println(aux);
        }
        
        int sumaT = 0;
        int sumaL = 0;
        int total;


          //Funciona pero el otro es mejor
//        for (Electrodomestico aux : lista) {
//            if ((aux.equals(e1)) || (aux.equals(e3))) {
//                sumaT += aux.getPrecio();
//            } else if ((aux.equals(e2)) || (aux.equals(e4))) {
//                sumaL += aux.getPrecio();
//            }
//        }

        //Esta es la forma correcta de hacerlo
        for (Electrodomestico aux : lista) {
            if (aux instanceof Televisor) {
                sumaT += aux.getPrecio();
            } else if (aux instanceof Lavadora) {
                sumaL += aux.getPrecio();
            }    
        }
        
        total = sumaL + sumaT;
        System.out.println("-------------------------------------------------");
        System.out.println("Estos son los precios totales:");
        System.out.println("Televisores: " + sumaT);
        System.out.println("Lavadoras: " + sumaL);
        System.out.println("Total: " + total);
    }
    
}
