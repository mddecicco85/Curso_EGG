/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PerroService {
    
    public ArrayList<Perro> crearPerros() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;
        ArrayList<Perro> mascotas = new ArrayList();
        do {
            Perro p = new Perro();
            System.out.println("---------------------------------------------");
            System.out.println("Ingrese el nombre de un perro");
            p.setNombre(leer.nextLine());
            System.out.println("Ingrese la raza");
            p.setRaza(leer.nextLine());
            System.out.println("Ingrese la edad");
            p.setEdad(leer.nextInt());
            leer.nextLine();
            System.out.println("Ingrese el tamaño");
            p.setTamanio(leer.nextDouble());
            leer.nextLine();
            mascotas.add(p);
            System.out.println("¿Desea agregar otro perro?");
            rta = leer.nextLine();
        } while (rta.equalsIgnoreCase("S"));
        return mascotas;
    }
}

