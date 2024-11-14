/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Usuario
 */
public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante f) throws Exception {
    
        try {
            
            if (f == null) {
                System.out.println("Debe ingresar un fabricante.");
            }
            
            String sql = "INSERT INTO Fabricante (codigo, nombre) "
                    + "VALUES (" + f.getCodigo() + ", '" + f.getNombre() + "');";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception ex) {
            throw ex;
        }    
    }
    
    
    public void modificarFabricante(Fabricante f) throws Exception {
    
        try {
            
            if (f == null) {
                System.out.println("Debe indicar un fabricante a modificar.");
            }
            
            String sql = "UPDATE Fabricante SET "
                    + "nombre = '" + f.getNombre() + "' WHERE codigo = " + f.getCodigo() + ";";
            //Modifico el nombre en buscando por código.
            
            insertarModificarEliminar(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    public void eliminarFabricante(int cod) throws Exception {
    
        try {
            
            String sql = "DELETE FROM Fabricante WHERE codigo = " + cod + ";";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    public Fabricante buscarPorCodigo(int codigo) throws Exception {
    
        try {
            
            String sql = "SELECT * FROM Fabricante WHERE codigo = " + codigo + ";";
            
            consultarBase(sql);
            
            Fabricante f = null;
            
            while(resultado.next()) {
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }
            
            return f;
                    
        } catch (Exception ex) {
            ex.printStackTrace();
            desconectarBase();
            throw ex;
        }
        
    }
    
}
