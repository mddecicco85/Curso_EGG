/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {
    
    public Scanner leer = new Scanner(System.in);
    Cadena cad = new Cadena("Hola como te va, todo bien?");
    
    public int mostrarVocales() {
        System.out.println(cad.toString());
        int cant = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((cad.getFrase().substring(i, i+1).equalsIgnoreCase("a")) || (cad.getFrase().substring(i, i+1).equalsIgnoreCase("e")) || (cad.getFrase().substring(i, i+1).equalsIgnoreCase("i")) || (cad.getFrase().substring(i, i+1).equalsIgnoreCase("o")) || (cad.getFrase().substring(i, i+1).equalsIgnoreCase("u"))) {
                cant++;
            }
        }
        System.out.println("La frase tiene " + cant + " vocales");
        return cant;
    }
    
    public String invertirFrase() {
        String invert = "";
        for (int i = 0; i < cad.getLongitud(); i++) {
            invert = invert.concat(cad.getFrase().substring(cad.getLongitud()-1-i, cad.getLongitud()-i));
        }
        //for (int j = 0; j < cad.getLongitud(); j++) {
        //    System.out.print(invert.substring(j, j+1));
        //}
        System.out.println(invert);
        return invert;
    }
    
    public int vecesRepetido(String letra) {
        int cantidad = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((cad.getFrase().substring(i, i+1).equalsIgnoreCase(letra))) {
                cantidad++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + cantidad + " veces");
        return cantidad;
    }
    
    public void compararLongitud(String frase2) {
        if (frase2.length() == cad.getFrase().length()) {
            System.out.println("Esta frase tiene la misma longitud que la original");
        } else {
            System.out.println("La nueva frase no tiene la misma longitud que la original");
        }    
    }
    
    public void unirFrases(String frase3) {
        System.out.println(cad.getFrase() + frase3);
    }
    
    public void reemplazar(String letter) {
        String fraseR = "";
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
                fraseR = fraseR.concat(letter);
            } else {
                fraseR = fraseR.concat(cad.getFrase().substring(i, i+1));
            }
        }
        System.out.println("La frase reemplazada es: " + fraseR);
    }
    
    public boolean contiene(String let) {
        boolean bandera = false;
        int c = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase(let)) {
                bandera = true;
                break;
            }
        }
        if (bandera) {
            System.out.println("La letra aparece en la frase");
        } else {
            System.out.println("La letra no aparece en la frase");
        }
        return bandera;
    }
}
