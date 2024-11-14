/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class PaisService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //TreeSet<Pais> naciones = new TreeSet();
    
    public HashSet<Pais> ingresarPaises() {
        HashSet<Pais> naciones = new HashSet();
        String rta;
        do {
            Pais p = new Pais();
            System.out.println("Ingrese el nombre de un pais");
            p.setNombre(leer.nextLine());
            naciones.add(p);
            System.out.println("¿Desea ingresar otro pais (S/N)?");
            rta = leer.nextLine();
        } while (rta.equalsIgnoreCase("S"));
        return naciones;
    }
    
    public void mostrarPaises(HashSet<Pais> naciones) {
        for (Pais aux: naciones) {
            System.out.println(aux);
        }
    }  //NO los muestra en el orden en que los ingrese
    
    public void ordenarPaises(HashSet<Pais> naciones) {
        ArrayList<Pais> paises = new ArrayList(naciones);
        paises.sort(Pais.ordenarPorNombre.reversed());
        //Collections.sort(paises);  //Esto no anda, marca error
        for (Pais aux : paises) {
            System.out.println(aux);
        }
        //return paises;
    }
    
    public void buscarPais(HashSet<Pais> naciones) {
        System.out.println("Ingrese un pais a buscar");
        String busca = leer.nextLine();
        boolean estaba = false;
        Iterator<Pais> it = naciones.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(busca)) {
                it.remove();
                estaba = true;
                break;
            }
        }
        if (estaba == false) {
            System.out.println("Ese pais no se encuentra en el conjunto");
        } else {
            System.out.println("---------------------------------------------------");
            System.out.println("Ahora los paises son los siguientes");
            mostrarPaises(naciones);
        }
    }
    
}
