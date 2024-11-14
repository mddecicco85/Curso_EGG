/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12;

import Entidad.Animalito;
import Entidad.Gatito;
import Entidad.Perrito;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Teoria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animalito> lista = new ArrayList();
        
        Animalito a = new Animalito();
        Animalito b = new Perrito();  //Perro es subclase de Animal
        Animalito c = new Gatito();  //Gato es subclase de Animal
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        for (Animalito aux : lista) {  //aux es un Animal. Puede ser Perro, Gato, o uno generico
            aux.hacerRuido();
        }
    }
    
}
