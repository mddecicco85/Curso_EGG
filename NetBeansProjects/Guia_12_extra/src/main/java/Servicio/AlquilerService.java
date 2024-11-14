/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlquilerService {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler() {
        Alquiler alq = new Alquiler();
        System.out.println("Ingrese el nombre del cliente.");
        alq.setNombreCliente(leer.nextLine());
        System.out.println("Ingrese el número de documento.");
        alq.setDocumentoCliente(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese la fecha en que comienza el alquiler:");
        //LocalDate fA = LocalDate.parse(leer.next());        
        
//        System.out.println("Año:");
//        int anio = leer.nextInt();
//        leer.nextLine();
//        System.out.println("Mes:");
//        int mes = leer.nextInt();
//        leer.nextLine();
//        System.out.println("Día:");
//        int dia = leer.nextInt();
//        leer.nextLine();
//        Date fA = new Date(anio - 1900, mes -1, dia);
        Date fA = new Date();
        alq.setFechaAlquiler(fA);
        //System.out.println(fA);
        
        System.out.println("Ingrese la fecha de devolución:");
//        System.out.println("Año:");
//        int anio2 = leer.nextInt();
//        leer.nextLine();
//        System.out.println("Mes:");
//        int mes2 = leer.nextInt();
//        leer.nextLine();
//        System.out.println("Día:");
//        int dia2 = leer.nextInt();
//        leer.nextLine();
//        Date fD = new Date(anio2 - 1900, mes2 - 1, dia2);

        Date fD = new Date(2023 - 1900, 6 - 1, 29);
        alq.setFechaDevolucion(fD);
        alq.setPosicionAmarre((int) (Math.random()*20 + 1));
        return alq;
    }
    
}
