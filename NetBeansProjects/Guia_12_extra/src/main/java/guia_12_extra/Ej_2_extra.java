/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12_extra;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import Servicio.EdificioDeOficinasService;
import Servicio.EdificioService;
import Servicio.PolideportivoService;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ej_2_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //EdificioService ES = new EdificioService();
        EdificioService PS = new PolideportivoService();
        EdificioService OS = new EdificioDeOficinasService();
        
        ArrayList<Edificio> listado = new ArrayList();
        
        Edificio e1 = new Polideportivo();
        PS.crearEdificio(e1);
        Edificio e2 = new EdificioDeOficinas();
        Edificio e3 = new Polideportivo();
        Edificio e4 = new EdificioDeOficinas();
        
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        listado.add(e4);
        
        int cantA = 0;  //Cantidad de abiertos
        int cantT = 0;  //Cantidad de techados
        
        for (Edificio aux : listado) {
            if (aux instanceof Polideportivo) {
                PS.calcularSuperficie();
                PS.calcularVolumen();
                Polideportivo p = (Polideportivo) aux;  //Lo casteo a Polideportivo para poder usar el getTipoInstalacion
                if (p.getTipoInstalacion().equalsIgnoreCase("abierto")) {
                    cantA++;
                } else if (p.getTipoInstalacion().equalsIgnoreCase("techado")) {
                    cantT++;
                }
            }
            if (aux instanceof EdificioDeOficinas) {
                OS.calcularSuperficie();
                OS.calcularVolumen();
                //OS.cantPersonas();
            }
        }
        
        System.out.println("Hay " + cantA + " polideportivos abiertos.");
        System.out.println("Hay " + cantT + " polideportivos techados.");
    }
    
}
