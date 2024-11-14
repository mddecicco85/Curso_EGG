/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.servicios;

import biblioteca.entidades.Autor;
import biblioteca.persistencia.AutorDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AutorServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    AutorDAO adao = new AutorDAO();
    
    
    public ArrayList<Autor> buscarPorNombre(String nombre) {
    
        ArrayList<Autor> autores = adao.buscarPorNombre(nombre);
        
        return autores;
    
    }
    
    
    public Autor buscarPorId() throws Exception {
    
        try {
            System.out.println("Ingrese el ID del autor.");
            Integer id = leer.nextInt();
            leer.nextLine();
            if (id <= 0) {
                throw new Exception("El ID debe ser positivo.");
            }
            if (id == null) {
                throw new Exception("Debe ingresar un ID.");
            }
            Autor a = adao.buscarPorId(id);
            return a;
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    
    public Autor crearAutor() throws Exception {
    
        try {
            System.out.println("Ingrese el nombre del autor.");
            String nombre = leer.nextLine();
            Autor aut = new Autor();
            aut.setNombre(nombre);
            aut.setAlta(true);
            aut = adao.crearAutor(aut);
            return aut;
        } catch (Exception e) {
            throw e;
        }
    
    }
    
}
