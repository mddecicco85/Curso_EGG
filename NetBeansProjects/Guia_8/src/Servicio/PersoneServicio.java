/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persone;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersoneServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Persone p = new Persone();
    
    public void crearPersona(Persone p, int i) {
        String sex = "";
        System.out.println("Ingrese el nombre de la persona " + (i+1));
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad");
        p.setEdad(leer.nextInt());
        leer.nextLine();
        do {
            System.out.println("Ingrese el sexo (H, M, O para otro)");
            sex = leer.nextLine();
        } while ((!sex.equalsIgnoreCase("H") && (!sex.equalsIgnoreCase("M"))) && (!sex.equalsIgnoreCase("O")));
        p.setSexo(sex);
        System.out.println("Ingrese el peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        p.setAltura(leer.nextDouble());
        leer.nextLine();
    }
    
    public boolean esMayorDeEdad(Persone p) {
        boolean mayor = false;
            if (p.getEdad() >= 18) {
                mayor = true;
            }
        return mayor;
    }
    
    public int calcularIMC(Persone p) {
        double IMC = (p.getPeso() / Math.pow(p.getAltura(), 2));
        System.out.println(IMC);
        int valor;
        if (IMC < 20) {
            valor = -1;
        } else if (IMC > 25) {
            valor = 1;
        } else {
            valor = 0;
        }
        return valor;
    }
    
    public void evaluacion(int i, int[] indice, boolean[] mayores) {
        
        if (mayores[i] == true) {
            System.out.println("La persona " + (i+1) + " es mayor de edad");
        } else {
            System.out.println("La persona " + (i+1) + " es menor de edad");
        }
        switch (indice[i]) {
            case -1:
                System.out.println("La persona " + (i+1) + " tiene bajo peso");
                break;
            case 0:
                System.out.println("La persona " + (i+1) + " esta en su peso ideal");
                break;
            case 1:
                System.out.println("La persona " + (i+1) + " tiene sobrepeso");
                break;
        }
    }
    
    public void porcentajes(int[] indice, boolean[] mayores) {
        int may = 0;
        int men = 0;
        int sobre = 0;
        int ideal = 0;
        int bajo = 0;
        for (int j = 0; j < 4; j++) {
            switch (indice[j]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    sobre++;
                    break;
            }
            if (mayores[j] == true) {
                may++;
            } else {
                men++;
            }
        }
        System.out.println("El " + 100*bajo/4 + " % tiene bajo peso");
        System.out.println("El " + 100*ideal/4 + " % tiene peso ideal");
        System.out.println("El " + 100*sobre/4 + " % tiene sobrepeso");
        System.out.println("El " + 100*men/4 + " % es menor de edad");
        System.out.println("El " + 100*may/4 + " % es mayor de edad");
    }
}
