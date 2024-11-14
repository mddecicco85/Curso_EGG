/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList(); //Lista de tipo Integer
        int x = 20;
        numerosA.add(x); //Agregamos el numero 20 a la lista, en la posicion 0
        numerosA.add(30);
        int j = 40;
        numerosA.add(j);
        int z = 50;
        numerosA.add(z);
        numerosA.add(60);
        numerosA.add(100);
        Integer w = 200;
        numerosA.add(w);
        System.out.println(numerosA.size());
        numerosA.remove(Integer.valueOf(50)); //Lo convierte a objeto Integer. Era primitivo int
        numerosA.remove(w);  //Anda porque es Integer. Con 200 no anda
        System.out.println(numerosA.size());
        
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        numerosB.add(10);
        int i = 0;
        numerosB.add(i);
        int r = 40;
        numerosB.add(r);
        Integer e = 1;
        numerosB.add(e);
        numerosB.add(y + e);
        numerosB.remove(1); //Elimino el entero 1
        
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno); //Agregamos la llave y el valor
        alumnos.put(31642174, "Martin");
        int dni2 = 31765983;
        String nombreAlumno2 = "Pocho";
        alumnos.put(dni2, nombreAlumno2);
        alumnos.put(33273307, nombreAlumno); //El valor se puede repetir
        int dni3 = 35768092;
        alumnos.put(dni3, "Jesus");
        alumnos.put(32985467, "Martin");
        alumnos.remove(dni3); //Elimino dni3
        alumnos.remove(31642174);
    }
    
}
