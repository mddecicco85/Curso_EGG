/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Usuario
 */
public class AutorServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    AutorDAO adao = new AutorDAO();
    
    
    public Autor ingresarAutor() throws Exception {
        System.out.println("Ingrese el nombre del autor.");
        String nombre = leer.nextLine();
        try {
            if (nombre.equalsIgnoreCase("")) {
                throw new Exception("Debe ingresar un nombre.");
            }
            if (!buscarPorNombre(nombre).isEmpty()) {
                //System.out.println("Ya existe un autor con ese nombre.");
                throw new Exception("Ya existe un autor con ese nombre.");
            }
            Autor aut = new Autor();
            aut.setNombre(nombre);
            aut.setAlta(true);
            
            aut = adao.crearAutor(aut);
            return aut;
            
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public void darDeBaja(Autor aut) throws Exception {
    
        try {
            aut.setAlta(false);
            adao.darDeBaja(aut);
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public void darDeAlta(Autor aut) throws Exception {
    
        try {
            aut.setAlta(true);
            adao.darDeAlta(aut);
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public ArrayList<Autor> buscarPorId(Integer id) throws Exception { //Devuelve un solo objeto porque el ID es único.
        
        try {
            if (id == null) {
                throw new Exception("Debe indicar un Id.");
            }
            
            ArrayList<Autor> autores = adao.buscarPorId(id);
            return autores;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
    
    public ArrayList<Autor> buscarPorNombre(String nombre) throws Exception {
        
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar un nombre.");
            }
            ArrayList<Autor> autores = adao.buscarPorNombre(nombre);
            return autores;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
}

//consulta, creación, modificación, eliminación