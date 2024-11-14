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
public class Ej_2_Maxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
       
       String nombre;
       String opcion;
       int edad;
            
       do
       {
        System.out.println("Ingrese Nombre:");
        nombre = leer.next();
        
        System.out.println("Ingrese edad:");
        
        edad = leer.nextInt();
        imprimirDatos(nombre,edad);
                       
        System.out.println("Desea ingresar otra persona?:S|N");
        opcion = leer.next(); 
       
        while (!opcion.equalsIgnoreCase("S")&&!opcion.equalsIgnoreCase("N"))
        {
            System.out.println("Opcion invalida.Desea ingresar otra persona?:S|N");
            opcion = leer.next();                
        }
        
        if (opcion.equalsIgnoreCase("N"))
        {
            break;
        }
         
   /*  
     if (!opcion.equalsIgnoreCase("S")&&!opcion.equalsIgnoreCase("N"))
     {
        System.out.println("Opcion invalida.");
        System.out.println("Desea ingresar otra persona?");
        opcion = leer.next();        
     }
*/
       }while(!opcion.equalsIgnoreCase("S"));

    }
    
    public static void imprimirDatos(String nombre,int edad)
    {
       
        System.out.println("El nombre ingresado es:" + nombre
        +"\nLa edad ingresada es:"+edad);       
        if (edad<18)
        {
            System.out.println("Persona menor de edad");
        }
        else
        {
            System.out.println("Persona mayor de edad");
        }
        return;
    }
    
}
