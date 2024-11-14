/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extra;

import Entidad.Cuenta;

/**
 *
 * @author Usuario
 */
public class Ej_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta("Jose Lopez", 1000.50);
        System.out.println(c1);
        c1.retirar_dinero();
        System.out.println(c1);
        c1.setSaldo(5000);
        System.out.println(c1);
        c1.setTitular("Martin De Cicco");
        System.out.println(c1.getTitular());
    }
    
}
