/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12_extra;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoaMotor;
import Entidad.Velero;
import Entidad.YateDeLujo;
import Servicio.AlquilerService;
import Servicio.BarcoService;
import Servicio.BarcoaMotorService;
import Servicio.VeleroService;
import Servicio.YateDeLujoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AlquilerService AS = new AlquilerService();  //Importo los Servicios
        BarcoService BS = new BarcoService();
        VeleroService VS = new VeleroService();
        BarcoaMotorService BMS = new BarcoaMotorService();
        YateDeLujoService YS = new YateDeLujoService();
 
        
        Alquiler alq = AS.crearAlquiler();  //Creo un Alquiler (falta el Barco)
        System.out.println("-------------------------------------------------");
        System.out.println("Elija un número de barco de la siguiente lista.");
        ArrayList<Barco> lista = BS.crearBarcos();  //Creo lista de Barcos
        for (int j = 0; j < lista.size() ; j++) {  //Muestro la lista
            System.out.print((j + 1) + "- ");
            System.out.print(lista.get(j));
            System.out.println("");
        }
        int i = 0;
        do {
            i = leer.nextInt();  //Elije un Barco de la lista
            leer.nextLine();
            if ((i < 1) || (i > lista.size())) {
                System.out.println("Elija una opción válida.");
            }
        } while ((i < 1) || (i > lista.size()));
        
        System.out.println("-------------------------------------------------");
        
        alq.setBarquito(lista.get(i - 1));  //Le agrego el Barco al Alquiler
        
        System.out.println("Estos son los datos del alquiler:");  //Muestro el Alquiler completo
        System.out.println(alq);
        
        int dias = alq.getFechaDevolucion().getDate() - alq.getFechaAlquiler().getDate();  //Calcula los días
        //System.out.println(dias);
        System.out.println("-------------------------------------------------");
        
        double modulo = 0;  //Calculo el modulo según el Barco
        if (lista.get(i - 1) instanceof Velero) {
            modulo = VS.calcularModulo(lista, i - 1);
        } else if (lista.get(i - 1) instanceof BarcoaMotor) {
            if (lista.get(i - 1) instanceof YateDeLujo) {
                modulo = YS.calcularModulo(lista, i - 1);
            } else {    
                modulo = BMS.calcularModulo(lista, i - 1);
            }
        }
        double precioAlquiler = modulo * dias;  //Calculo el precio final
        System.out.println("El precio del alquiler es de " + precioAlquiler);
        
    }
    
}
