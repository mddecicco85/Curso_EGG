/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Usuario
 */
public class EditorialServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    EditorialDAO edao = new EditorialDAO();
    
    
    public Editorial ingresarEditorial() throws Exception {
        System.out.println("Ingrese el nombre de la editorial.");
        String nombre = leer.nextLine();
        try {
            if (nombre.equalsIgnoreCase("")) {
                throw new Exception("Debe ingresar un nombre.");
            }
            if (!buscarPorNombre(nombre).isEmpty()) {
                //System.out.println(buscarPorNombre(nombre).toString());
                throw new Exception("Ya existe una editorial con ese nombre.");
            }
            Editorial edit = new Editorial();
            edit.setNombre(nombre);
            edit.setAlta(true);
            
            edit = edao.crearEditorial(edit);
            return edit;
        } catch (Exception ex) {
            throw ex;
        }    
    }
    
    
    public void darDeBaja(Editorial edit) throws Exception {
        
        try {
            edit.setAlta(false);
            edao.darDeBaja(edit);
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public void darDeAlta(Editorial edit) throws Exception {
    
        try {
            edit.setAlta(true);
            edao.darDeAlta(edit);
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public ArrayList<Editorial> buscarPorId(Integer id) throws Exception {
   
        try {
            if (id == null) {
                throw new Exception("Debe indicar un Id.");
            }
            
            ArrayList<Editorial> editoriales = edao.buscarPorId(id);
            return editoriales;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
        
    }
    
    
    public ArrayList<Editorial> buscarPorNombre(String nombre) throws Exception {
        
        try {
            if (nombre == null) {
                throw new Exception("Debe indicar un nombre.");
            }
            
            ArrayList<Editorial> editoriales = edao.buscarPorNombre(nombre);
            return editoriales;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    
    }
    
}

//consulta, creación, modificación, eliminación