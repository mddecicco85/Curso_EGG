/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import Entidad.Operacion;

/**
 *
 * @author Usuario
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println("La suma es " + op1.sumar());
        System.out.println("La resta es " + op1.restar());
        System.out.println("La multiplicacion es " + op1.multiplicar());
        System.out.println("La division es " + op1.dividir());
    }
}
