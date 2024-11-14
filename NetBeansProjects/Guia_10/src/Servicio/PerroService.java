/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PerroService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> razas = new ArrayList();
    
    public void cargarRaza() {
        System.out.println("Ingrese una raza de perro");
        razas.add(leer.nextLine());
    }
    
    public void imprimirRazas() {
        System.out.println(razas);
    }
    
    public void buscarRaza() {
        System.out.println("Ingrese una raza para buscar");
        String perro = leer.nextLine();
        boolean bandera = false;
        for (int i = 0; i < razas.size(); i++) {
            if (perro.equals(razas.get(i))) {
                razas.remove(i);
                bandera = true;
                imprimirRazas();
                break;
            }
        }
        if (bandera == false) {
            System.out.println("Esa raza no se encuentra en la lista");
            imprimirRazas();
        }
    }
    
}
