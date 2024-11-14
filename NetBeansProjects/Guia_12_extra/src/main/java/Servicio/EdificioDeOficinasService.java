/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EdificioDeOficinasService extends EdificioService {
    
    public Scanner leer = new Scanner(System.in);
    
    EdificioDeOficinas f;
    
    @Override
    public void crearEdificio(Edificio e) {
        super.crearEdificio(e);
        f = (EdificioDeOficinas) e;
        System.out.println("Ingrese el número de oficinas por piso.");
        f.setNumeroDeOficinas(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la cantidad de personas por oficina.");
        f.setPersonasPorOficina(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el número de pisos.");
        f.setNumeroPisos(leer.nextInt());
        leer.nextLine();
    }
    
    public void cantPersonas() {
        System.out.println("Entran " + (f.getNumeroDeOficinas() * f.getPersonasPorOficina() * f.getNumeroPisos()) + " personas en el edificio de oficinas.");
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es " + (f.getAncho() * f.getLargo() * f.getNumeroPisos()));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es " + (f.getLargo() * f.getAncho() * f.getAlto() * f.getNumeroPisos()));
    }
    
}
