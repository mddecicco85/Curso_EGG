/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Edificio;
import Entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PolideportivoService extends EdificioService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Polideportivo p;
    
    @Override
    public void crearEdificio(Edificio e) {
        super.crearEdificio(e);
        p = (Polideportivo) e;
        System.out.println("Ingrese el nombre del polideportivo.");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese el tipo de instalación (abierto/techado)");
        p.setTipoInstalacion(leer.nextLine());
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo es " + (p.getAncho() * p.getLargo()));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivoes " + (p.getAncho() * p.getLargo() * p.getAlto()));
    }
    
}
