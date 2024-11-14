/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIFService {
    
    public Scanner leer = new Scanner(System.in);
    NIF doc1 = new NIF();
    String[] v = new String[23];
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    //char[] v = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H','L', 'C', 'K', 'E' };
    //Se puede definir el vector asi y ya no hace falta completarlo en cada caso
    
    public void llenaVector() {
        for (int i = 0; i < 23; i++) {
            v[i] = letras.substring(i, i+1);
        }
    }

    public void crearNIF() {
        System.out.println("Ingrese el numero de DNI");
        doc1.setNumDNI(leer.nextLong());
        calculaLetra();
    }
    
    public void calculaLetra() {
        int resto = (int) (doc1.getNumDNI() % 23);
        System.out.println(resto);
        llenaVector();  //Como hago para no completar el vector cada vez????????
        //Puedo definir el vector {'T', 'R', etc} afuera y luego asignarlo aca
        doc1.setLetra(v[resto]);
        System.out.println("La letra asignada es " + doc1.getLetra());
    }
    
    public void mostrar() {
        System.out.println("El NIF es " + doc1.getNumDNI() + "-" + doc1.getLetra());
    }
}
