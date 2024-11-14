/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import libreria.entidades.Editorial;

/**
 *
 * @author Usuario
 */
public class EditorialDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = emf.createEntityManager();
    //Se puede hacer todo en una línea.
    //EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    
    public Editorial crearEditorial(Editorial edit) throws Exception {
    
        try {
            if (edit == null) {
                throw new Exception("Debe ingresar una editorial.");
            }
        
            //edit.setAlta(true); //Esto va en el Servicio, no en el DAO.
            
            em.getTransaction().begin();
            em.persist(edit);
            em.getTransaction().commit();
            
            return edit;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
   
    }
    
    
    public void darDeBaja(Editorial edit) throws Exception {
    
        try {
            if (edit == null) {
                throw new Exception("Debe ingresar una editorial.");
            }
            
            //edit.setAlta(false);
            em.getTransaction().begin();
            em.merge(edit);
            em.getTransaction().commit();
            
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    
    public void darDeAlta(Editorial edit) throws Exception {
    
        try {
            if (edit == null) {
                throw new Exception("Debe ingresar una editorial.");
            }
            
            //edit.setAlta(true);
            em.getTransaction().begin();
            em.merge(edit);
            em.getTransaction().commit();
            
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    
    public ArrayList<Editorial> buscarPorId(Integer ident) throws Exception { //Devuelve un solo objeto porque el ID es único.
        
        ArrayList<Editorial> lista = null;
        try {
//            Editorial ed = 
//                    (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE : id").setParameter("id", ident).getSingleResult();
            
            Query q = em.createQuery("SELECT e FROM Editorial e WHERE e.id =:id").setParameter("id", ident);
            lista = new ArrayList(q.getResultList());
            
            if (lista.isEmpty()) {
                System.out.println("No se encontró ninguna editorial con ese Id.");
            }
            return lista;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            System.err.print("No se pudo realizar la operación." + ex);
            throw ex;
        }
        
    }
    
    
    public ArrayList<Editorial> buscarPorNombre(String nom) throws Exception {
        
        ArrayList<Editorial> lista = null;
        try {
            Query q = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").
                            setParameter("nombre", "%" + nom + "%");
            lista = new ArrayList(q.getResultList());
            
//            if (lista == null) {
//                System.out.println("No se encontró ninguna editorial con ese nombre.");
//            }
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
}
