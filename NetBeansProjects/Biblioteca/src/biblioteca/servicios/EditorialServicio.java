/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.servicios;

import biblioteca.entidades.Editorial;
import biblioteca.persistencia.EditorialDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EditorialServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    EditorialDAO edao = new EditorialDAO();
    
    
    public ArrayList<Editorial> buscarPorNombre(String nombre) {
    
        ArrayList<Editorial> editoriales = edao.buscarPorNombre(nombre);
        
        return editoriales;
    
    }
    
    
    public Editorial buscarPorId() throws Exception {
    
        try {
            System.out.println("Ingrese el ID de la editorial.");
            Integer id = leer.nextInt();
            leer.nextLine();
            if (id <= 0) {
                throw new Exception("El ID debe ser positivo.");
            }
            if (id == null) {
                throw new Exception("Debe ingresar un ID.");
            }
            Editorial e = edao.buscarPorId(id);
            return e;
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public Editorial crearEditorial() throws Exception {
    
        try {
            System.out.println("Ingrese el nombre de la editorial.");
            String nombre = leer.nextLine();
            Editorial edit = new Editorial();
            edit.setNombre(nombre);
            edit.setAlta(true);
            edit = edao.crearEditorial(edit);
            return edit;
        } catch (Exception e) {
            throw e;
        }
    
    }
    
}
