/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.persistencia;

import biblioteca.entidades.Editorial;
import java.util.ArrayList;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public final class EditorialDAO extends DAO {
    
    
    public ArrayList<Editorial> buscarPorNombre(String nom) {
    
        Query q = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nom);
        
        ArrayList<Editorial> lista = new ArrayList(q.getResultList());
        
        return lista;
    
    }
    
    
    public Editorial buscarPorId(Integer ident) {
    
        try {
            //Query q = em.createQuery("SELECT e FROM Editorial e WHERE e.id =:id").setParameter("id", ident);
            
            //Editorial e = (Editorial) q.getSingleResult();
            Editorial e = em.find(Editorial.class, ident); //Así es más fácil.
            
            return e;
        } catch (NoResultException ex) {
            System.out.println("No se encontró nungún autor con ese ID.");
            return null;    
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public Editorial crearEditorial(Editorial edit) throws Exception {
    
        try {
            if (edit == null) {
                throw new Exception("Debe ingresar una editorial.");
            }
            Editorial e = (Editorial) crear(edit);

            return e;
        } catch (Exception e) {
            throw e;
        }
        
    
    }
    
}
