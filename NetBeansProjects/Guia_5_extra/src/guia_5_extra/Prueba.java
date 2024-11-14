/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_extra;

/**
 *
 * @author Usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila = 0;
        int aux;
        for (int i = 0; i < 100; i++) {
            do {
                aux = fila;
                fila = (int) (Math.random() * 20 + 1);
                //fila = (int) ((Math.random() * 10)/2);
                System.out.println(fila);
            } while (fila == aux);
        }
    }
    
}
