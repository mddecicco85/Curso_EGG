/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Mascota;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MascotaServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Mascota pet = new Mascota();
    
    public void agregarMascota() {
        System.out.println("Ingrese el nombre de la mascota");
        pet.nombre = leer.nextLine();
        System.out.println("Ingrese la edad");
        pet.edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la raza");
        pet.raza = leer.nextLine();
        System.out.println("Ingrese el tipo (perro, gato, etc)");
        pet.tipo = leer.nextLine();
    }
    
    public void mostrarMascota() {
        System.out.println("Datos de la mascota:");
        System.out.println("Nombre: " + pet.nombre);
        System.out.println("Edad: " + pet.edad);
        System.out.println("Raza: " + pet.raza);
        System.out.println("Tipo: " + pet.tipo);
    }
    
    public int cumplirAnios() {
        pet.edad += 1;
        return pet.edad;
    }
}
