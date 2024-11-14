/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11;

import Entidad.DNI;
import Entidad.Persone;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DNI doc = new DNI("003568729403", 31642174);
        DNI doc = new DNI();
        doc.setSerie("003567570543");
        doc.setNumero(31642174);
        Persone p = new Persone();
        p.setNombre("Martin");
        p.setApellido("De Cicco");
        p.setDocumento(doc);
        System.out.println("La persona " + p.getNombre() + " " + p.getApellido() + " tiene el DNI " + 
                p.getDocumento().getNumero() + " con serie " + p.getDocumento().getSerie());
    }
    
}
