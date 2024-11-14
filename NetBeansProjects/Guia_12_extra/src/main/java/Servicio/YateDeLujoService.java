/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Barco;
import Entidad.YateDeLujo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class YateDeLujoService extends BarcoaMotorService {
    
    @Override
    public double calcularModulo(ArrayList<Barco> listaBarcos, int i) {
        double modulo = super.calcularModulo(listaBarcos, i);
        YateDeLujo y = (YateDeLujo) listaBarcos.get(i);
        modulo = modulo + y.getNumeroCamarotes();
        System.out.println(modulo);
        return modulo;
    }
    
}
