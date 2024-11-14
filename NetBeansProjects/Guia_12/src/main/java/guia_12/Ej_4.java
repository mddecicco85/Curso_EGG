/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12;

import Entidad.Circulo;
import Servicio.CirculoService;
import Servicio.RectanguloService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CirculoService CS = new CirculoService();
        RectanguloService RS = new RectanguloService();
        
//        System.out.println("Ingrese el radio de un círculo.");
//        double radio = leer.nextDouble();
//        leer.nextLine();
//        Circulo c1 = new Circulo(radio);  //No se puede hacer así porque no le puedo pasar el radio. No puedo cambiar el método

        CS.calcularArea();
        CS.calcularPerimetro();
        
        RS.calcularArea();
        RS.calcularPerimetro();
        
    }
    
}
