/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.persistencia;

import biblioteca.entidades.Autor;
import java.util.ArrayList;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public final class AutorDAO extends DAO {
    
    
    public ArrayList<Autor> buscarPorNombre(String nom) {
    
        Query q = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nom);
        
        ArrayList<Autor> lista = new ArrayList(q.getResultList());
        
        return lista;
    
    }
    
    
    public Autor buscarPorId(Integer ident) {
    
        try {
            //Query q = em.createQuery("SELECT a FROM Autor a WHERE a.id =:id").setParameter("id", ident);
            
            //Autor a = (Autor) q.getSingleResult();
            Autor a = em.find(Autor.class, ident); //Así es más fácil.
            
            return a;
        } catch (NoResultException e) {
            System.out.println("No se encontró nungún autor con ese ID.");
            return null;    
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    
    public Autor crearAutor(Autor aut) throws Exception {
    
        try {
            if (aut == null) {
                throw new Exception("Debe ingresar un autor.");
            }
            Autor a = (Autor) crear(aut);

            return a;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
