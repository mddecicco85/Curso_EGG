/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CadenaServicio CS = new CadenaServicio();
        CS.mostrarVocales();
        CS.invertirFrase();
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.nextLine();
        CS.vecesRepetido(letra);
        System.out.println("Ingrese una frase para comparar su longitud");
        String frase2 = leer.nextLine();
        CS.compararLongitud(frase2);
        System.out.println("Ingrese una frase para adicionar a la original");
        String frase3 = leer.nextLine();
        CS.unirFrases(frase3);
        System.out.println("Ingrese un caracter para reemplazar la letra a");
        String letter = leer.nextLine();
        CS.reemplazar(letter);
        System.out.println("Ingrese una letra para buscar");
        String let = leer.nextLine();
        CS.contiene(let);
    }
    
}
