/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_13;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String num1 = "a";
        String num2 = "a";
        
        try {
            System.out.println("Ingrese un número entero.");
            num1 = leer.nextLine();  //Aca no va a haber problemas
            System.out.println("Ingrese otro número entero.");
            num2 = leer.nextLine();
        } catch (InputMismatchException ex) {  //No logro que entre aca
            System.out.println("No se ingresaron valores correctos. Debe ingresar números enteros.");
        }
        
        int n1 = 1;
        int n2 = 1;
        double cociente;
        DivisionNumero div = new DivisionNumero(n1, n2);
        
        if ((!num1.equals("a")) && (!num2.equals("a"))) {
            try {
                n1 = Integer.parseInt(num1); //Puede haber problemas si ingreso una palabra
                n2 = Integer.parseInt(num2);
                cociente = n1 / n2;
                div.cociente = cociente;
                System.out.println("El cociente de los números es " + div.cociente);
            } catch (NumberFormatException ex) {
                System.out.println("No se pueden convertir a números enteros.");
            } catch (ArithmeticException ex) {
                System.out.println("No se puede dividir por cero.");
            } catch (RuntimeException ex) {
                System.out.println("Error inesperado.");
            }
        }
    }
    
}
