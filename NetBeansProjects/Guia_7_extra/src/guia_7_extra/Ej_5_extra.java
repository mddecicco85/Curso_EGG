/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extra;

import Entidad.Empleado;

/**
 *
 * @author Usuario
 */
public class Ej_5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado("Juan Perez", 25, 1000);
        emp1.calcular_aumento();
        System.out.println("El salario del empleado " + emp1.getNombre() + " debe aumentar a " + emp1.getSalario());
        Empleado emp2 = new Empleado("Jose Lopez", 33, 1200);
        emp2.calcular_aumento();
        System.out.println(emp2.getNombre() + " ahora debera cobrar " + emp2.getSalario());
    }
    
}
