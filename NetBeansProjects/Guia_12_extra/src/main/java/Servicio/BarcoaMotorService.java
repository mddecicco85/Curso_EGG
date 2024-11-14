/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Barco;
import Entidad.BarcoaMotor;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class BarcoaMotorService extends BarcoService {
    
    @Override
    public double calcularModulo(ArrayList<Barco> listaBarcos, int i) {
        double modulo = super.calcularModulo(listaBarcos, i);
        BarcoaMotor b = (BarcoaMotor) listaBarcos.get(i);
        modulo = modulo + b.getPotencia();
        System.out.println(modulo);
        return modulo;
    }
    
}
