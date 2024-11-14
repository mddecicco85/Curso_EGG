/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_13;

import Entidad.PruebaVector;

/**
 *
 * @author Usuario
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] v = new int[4];
        PruebaVector p = new PruebaVector(v);
        System.out.println(p.getVector().length);
        
        //System.out.println(p.toString());
        //int[] aux = p.getVector();
        //System.out.println(aux.length);
        for (int i = 0; i < p.getVector().length; i++) {
            System.out.print("[" + p.getVector()[i] + "]");
        }
        System.out.println("");
        try {
            System.out.println(p.getVector()[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //System.out.println("No existe ese índice.");
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
    
}
