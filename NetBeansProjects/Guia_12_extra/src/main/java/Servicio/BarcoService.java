/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Barco;
import Entidad.BarcoaMotor;
import Entidad.Velero;
import Entidad.YateDeLujo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class BarcoService {
    
    ArrayList<Barco> listaBarcos = new ArrayList();
    
    public ArrayList<Barco> crearBarcos() {
    
        Barco b1 = new Velero(354, 20, 2015, 1);
        //Velero v1 = (Velero) b1;
        Barco b2 = new BarcoaMotor(213, 30, 2020, 50);
        Barco b3 = new YateDeLujo(656, 45, 2023, 70, 10);
        Barco b4 = new BarcoaMotor(435, 35, 2017, 40);
        Barco b5 = new Velero(3414, 25, 1995, 2);
    
        listaBarcos.add(b1);
        listaBarcos.add(b2);
        listaBarcos.add(b3);
        listaBarcos.add(b4);
        listaBarcos.add(b5);
        
        //System.out.println(listaBarcos);
        return listaBarcos;
    }
    
    public double calcularModulo(ArrayList<Barco> listaBarcos, int i) {
        double modulo = listaBarcos.get(i).getEslora() * 10;
        return modulo;
    }
    
}
