/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.ArrayList;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Usuario
 */
public class ProductoService {
    
    public ProductoDAO pdao; //No lo instancio acá, sino en el constructor.
    
    public ProductoService() { //Cuando llamo al constructor en el Main, crea el ProductoDAO. No lo creo arriba en el atributo.
        this.pdao = new ProductoDAO();
    }

    
    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
    
        try {
            //Validamos lo que viene por parámetro.
            if (codigo == 0) {
                throw new Exception("Debe ingresar un código.");
            }
            if (nombre == null) {
                throw new Exception("Debe igresar un nombre.");
            }
            if (precio == 0) {
                throw new Exception("Debe ingresar un precio.");
            }
            if (codigoFabricante == 0) {
                throw new Exception("Debe indicar un código de fabricante.");
            }
            if (buscarPorCodigo(codigo) != null) {
                throw new Exception("Ya existe un producto con ese código.");
            }
            
            //Creamos el producto.
            Producto p = new Producto();
            p.setCodigo(codigo);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(codigoFabricante);
            pdao.guardarProducto(p);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        
    }
    
    
    public ArrayList<String> listarNombres() throws Exception {
    
        try {
            //Creamos la lista con nombres.
            ArrayList<String> nombres = pdao.listarNombres();            
            return nombres;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
    
    public ArrayList<Producto> listarNombresConPrecios() throws Exception {
    
        try { //Creamos la lista de productos.
            
            ArrayList<Producto> lista = pdao.listarNombresConPrecios();
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
    
    public ArrayList<Producto> listarProductosEntrePrecios(double precio1, double precio2) throws Exception {
    
        try {//Creamos la lista de productos.
            
            ArrayList<Producto> lista = pdao.listarProductosEntrePrecios(precio1, precio2);
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Producto> buscarPortatiles() throws Exception {
    
        try { //Creamos la lista de productos.
            
            ArrayList<Producto> portatiles = pdao.buscarPortatiles();
            return portatiles;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        
    }
    
    
    public ArrayList<Producto> productoMasBarato() throws Exception {
        
        try { //Creamos la lista de productos.
            
            ArrayList<Producto> listado = pdao.productoMasBarato();
            return listado;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public Producto buscarPorCodigo(int codigo) throws Exception {
    
        try {
            //Validamos.
            if (codigo == 0) {
                throw new Exception("Debe indicar un código.");
            }
            //Creamos el producto.
            Producto p = pdao.buscarPorCodigo(codigo);
            return p;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    
    }
    
}
