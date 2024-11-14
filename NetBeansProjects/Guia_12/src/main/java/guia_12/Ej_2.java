/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Servicio.ElectrodomesticoService;
import Servicio.LavadoraService;
import Servicio.TelevisorService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ElectrodomesticoService ES = new ElectrodomesticoService();
        LavadoraService LS = new LavadoraService();
        TelevisorService TS = new TelevisorService();
        
        //Electrodomestico e = ES.crearElectrodomestico();
        ES.precioFinal();
        //System.out.println(e.toString());
        System.out.println("-------------------------------------------------");
        
        //Lavadora lava = LS.crearLavadora();
        //System.out.println(lava);
        
        LS.precioFinal();
        System.out.println("-------------------------------------------------");
        
        TS.precioFinal();
        System.out.println("-------------------------------------------------");
    }
    
}
