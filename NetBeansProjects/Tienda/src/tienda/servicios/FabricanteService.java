/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Usuario
 */
public class FabricanteService {
    
    public FabricanteDAO fdao;
    
    public FabricanteService() {
        this.fdao = new FabricanteDAO();
    }
    
    
    public void crearFabricante(int codigo, String nombre) throws Exception {
        
        try {//Validamos lo que viene por parámetro.
            if (codigo == 0) {
                throw new Exception("Debe ingresar un código.");
            }
            if (nombre == null) {
                throw new Exception("Debe igresar un nombre.");
            }
            if (buscarPorCodigo(codigo) != null) {
                throw new Exception("Ya existe un fabricante con ese código.");
            }
            
            //Creamos el fabricante.
            Fabricante f = new Fabricante();
            f.setCodigo(codigo);
            f.setNombre(nombre);
            fdao.guardarFabricante(f);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public Fabricante buscarPorCodigo(int codigo) throws Exception {
    
        try {
            //Validamos.
            if (codigo == 0) {
                throw new Exception("Debe indicar un código.");
            }
            //Creamos el producto.
            Fabricante f = fdao.buscarPorCodigo(codigo);
            return f;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
}
