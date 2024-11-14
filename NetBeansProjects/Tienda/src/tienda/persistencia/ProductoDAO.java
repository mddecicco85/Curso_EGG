/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Producto;

/**
 *
 * @author Usuario
 */
public final class ProductoDAO extends DAO { //Quiero que herede todos los métodos de DAO
    
    public void guardarProducto(Producto p) throws Exception {
        
        try {
            
            if (p == null) {
                throw new Exception("Debe indicar un producto.");
            } //Si no se ingresó nada, lanza la excepción y se corta todo lo que sigue.
            
            //Obtengo los atributos del producto y lo plasmo en una Query.
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ('" + p.getCodigo() + "', '" + p.getNombre() + "', '" + p.getPrecio()
                    + "', '" + p.getCodigoFabricante() + "');";
            
            //Mando la Query al método de mi DAO (en realidad ProductoDAO, que heredó todos los métodos).
            insertarModificarEliminar(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    public void modificarProducto(Producto p) throws Exception {
        
        try {
            
            if (p == null) {
                throw new Exception("Debe indicar un producto a modificar.");
            }
            
            String sql = "UPDATE Producto SET "
                    + " nombre = '" + p.getNombre() + "' WHERE codigo = " + p.getCodigo() + ");";
            //Con esto sólo modifico el nombre.
            
            insertarModificarEliminar(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    public void eliminarProducto(int codigo) throws Exception {
        //Este método elimina por código del producto. Se puede hacer como yo quiera.
        try {
            
            String sql = "DELETE FROM Producto WHERE codigo = " + codigo + ";";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    public ArrayList<Producto> listarProductos() throws Exception {
    
        try {
            
            String sql = "SELECT * FROM Producto;";
            
            consultarBase(sql);
            
            Producto p = null;
            ArrayList<Producto> lista = new ArrayList();
            
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
                lista.add(p);
            }
            
            desconectarBase();
            
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
    
    
    public ArrayList<String> listarNombres() throws Exception {
    
        try {
            
            String sql = "SELECT nombre FROM Producto;";
            
            consultarBase(sql);
            
            Producto p = null;
            ArrayList<String> lista = new ArrayList();
            
            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                lista.add(p.getNombre());
            }
            
            desconectarBase();
            
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Producto> listarNombresConPrecios() throws Exception {
    
        try {
            
            String sql = "SELECT nombre, precio FROM Producto;";
            
            consultarBase(sql);
            
            Producto p = null;
            ArrayList<Producto> lista = new ArrayList();
            
            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                p.setPrecio(resultado.getDouble(2));
                lista.add(p);
            }
            
            desconectarBase();
            
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Producto> listarProductosEntrePrecios(double precio1, double precio2) throws Exception {
    
        try {
            
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN " + precio1 + " AND " + precio2 + ";";
            
            consultarBase(sql);
            
            Producto p = null;
            ArrayList<Producto> lista = new ArrayList();
            
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
                lista.add(p);
            }
            
            desconectarBase();
            
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Producto> buscarPortatiles() throws Exception {
    
        try {
            
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%Portatil%';";
            
            consultarBase(sql);
            
            Producto p = null;
            ArrayList<Producto> portatiles = new ArrayList();
            
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
                portatiles.add(p);
            }
            
            desconectarBase();
            
            return portatiles;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Producto> productoMasBarato() throws Exception { //Pongo ArrayList porque puede haber más de uno.
    
        try {
            
            String sql = "SELECT nombre, precio FROM Producto WHERE precio = (SELECT MIN(precio) FROM Producto);";
            
            consultarBase(sql);
            
            Producto p = null;
            ArrayList<Producto> lista = new ArrayList();
            
            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                p.setPrecio(resultado.getDouble(2));
                lista.add(p);
            }
            
            desconectarBase();
            
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
    
    
    public Producto buscarPorCodigo(int codigo) throws Exception {
    
        try {
            
            String sql = "SELECT * FROM Producto WHERE codigo = " + codigo + ";";
            
            consultarBase(sql);
            
            Producto p = null;
            
            while(resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
            }
            
            return p;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
    
    }
}
