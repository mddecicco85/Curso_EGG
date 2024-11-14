/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //ArrayList<Perro> adoptados = new ArrayList();
    
    public ArrayList<Persona> crearPersonas(ArrayList<Perro> mascotas) {
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;
        String elige;
        //boolean esta; 
        int cant;
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> adoptados = new ArrayList();
        do {
            Persona per = new Persona();
            System.out.println("---------------------------------------------");
            System.out.println("Ingrese el nombre de la persona");
            per.setNombre(leer.nextLine());
            System.out.println("Ingrese el apellido");
            per.setApellido(leer.nextLine());
            System.out.println("Ingrese la edad");
            per.setEdad(leer.nextInt());
            leer.nextLine();
            System.out.println("Ingrese el documento");
            per.setDocumento(leer.nextLine());
            System.out.println("Estos son los perros que tenemos:");
            System.out.println(mascotas);
            System.out.println("¿Qué perro quiere adoptar (indique el nombre)?");
            elige = leer.nextLine();
            
            //esta = false; //Esto estaba desde antes de crear el metodo verificaNombre
            elige = verificaNombre(mascotas, elige);  //Me fijo si el nombre esta en la lista
            
            if (adoptados.isEmpty()) {  //Si no hay ninguno adoptado todavia
                for (Perro aux : mascotas) {  //Recorro lista de mascotas
                    if (aux.getNombre().equalsIgnoreCase(elige)) {  //Cuando lo encuentra, se lo asigna
                        per.setMascota(aux);
                        System.out.println("La persona ha adoptado ese perro.");
                        adoptados.add(aux);  //Agrego a lista de adoptados
                        break;
                    }
                }
            } else {  //Si ya hay adoptados
                do {
                    cant = 0;
                    for (Perro adopt : adoptados) {  //Recorro la lista de adoptados
                        if (adopt.getNombre().equalsIgnoreCase(elige)) {  //Si fue adoptado
                            cant++;
                            System.out.println("Ese perro ya ha sido adoptado. Por favor indique otro nombre.");
                            elige = leer.nextLine();
                            //esta = false;
                            elige = verificaNombre(mascotas, elige);  //Me fijo si el nombre esta en la lista
                            break;
                        } 
                    }
                }  while (cant > 0);
                
                if (cant == 0) {  //Si no aparecio ninguna vez en la lista de adoptados
                    for (Perro aux : mascotas) {  //Recorro lista de mascotas
                        if (aux.getNombre().equalsIgnoreCase(elige)) {  //Cuando lo encuentra, se lo asigna
                            per.setMascota(aux);
                            System.out.println("La persona ha adoptado ese perro.");
                            adoptados.add(aux);  //Agrego a lista de adoptados
                            break;
                        }
                    }
                }
            }
            
            personas.add(per);
            System.out.println("¿Desea agregar otra persona?");
            rta = leer.nextLine();
            
        } while ((rta.equalsIgnoreCase("S")) && (personas.size() < mascotas.size()));
        
        if (personas.size() == mascotas.size()) {
            System.out.println("Ya no hay más perros disponibles.");
        }
        return personas;
    }
    
    public String verificaNombre(ArrayList<Perro> mascotas, String elige) {
        boolean esta = false;
        do {
            for (Perro aux : mascotas) {  //Primero me fijo que el nombre exista en la lista
                if (aux.getNombre().equalsIgnoreCase(elige)) {
                    esta = true;
                    break;
                }
            }
            if (esta == false) {  //Si no existe, que ponga otro
                System.out.println("No hay ningún perro con ese nombre. Por favor indique otro.");
                elige = leer.nextLine();
            }
        } while (esta == false);
        return elige;
    }
    
}
