/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_3_Maxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
       double euros;
       String moneda; 
       int opcion;
       moneda = "";
       
        System.out.println("Ingrese cantidad de euros:");
        euros = leer.nextDouble();
        System.out.println("A qué desea convertirlo:"
                + "\n1)Dolares"
                + "\n2)Yenes"
                + "\n3)Libras");
        opcion = leer.nextInt();
       
        switch(opcion)
        {
            case 1:
                moneda = "Dolares";
                
            break;
            case 2:
                moneda = "Yenes";
            break;
            case 3:
                moneda = "Libras";
                break;
            default:
                System.out.println("Opcion invalida");
        }
        //Llamo funcion
        convertirMoneda(euros,moneda);
    }
 
    public static void convertirMoneda (double euros, String moneda)
    {
        double cambioMoneda;
        cambioMoneda= 0;
        switch (moneda)
        {
            case "Dolares":
                cambioMoneda= euros * 1.28611;
                System.out.println("Se cambio de Euros a Dolares:" + cambioMoneda);
                break;
            case "Yenes":
                cambioMoneda= euros * 129.852;
                System.out.println("Se cambio de Euros a Yenes:" + cambioMoneda);                
                break;
            case "Libras":
                cambioMoneda= euros * 0.86;
                System.out.println("Se cambio de Euros a Libras:" + cambioMoneda);                
                break;                              
        }
        return;
    }
    
}
