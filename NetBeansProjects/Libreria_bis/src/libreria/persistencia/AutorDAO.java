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
import libreria.entidades.Autor;

/**
 *
 * @author Usuario
 */
public class AutorDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU_bis");
    private EntityManager em = emf.createEntityManager();
    //Se puede hacer todo en una línea.
    //EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    
    public Autor crearAutor(Autor aut) throws Exception {
    
        try {
            if (aut == null) {
                throw new Exception("Debe ingresar un autor.");
            }
            
            //aut.setAlta(true);  //Esto va en el Servicio, no en DAO.
            
            em.getTransaction().begin();
            em.persist(aut);
            em.getTransaction().commit();
            
            return aut;
            
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    
    public void darDeBaja(Autor aut) throws Exception {
    
        try {
            if (aut == null) {
                throw new Exception("Debe ingresar un autor.");
            }
            
            //aut.setAlta(false);
            em.getTransaction().begin();
            em.merge(aut);
            em.getTransaction().commit();
            
        } catch (Exception e) {
        }
    
    }
    
    
    public void darDeAlta(Autor aut) throws Exception {
    
        try {
            if (aut == null) {
                throw new Exception("Debe ingresar un autor.");
            }
            
            //aut.setAlta(true);
            
            em.getTransaction().begin();
            em.merge(aut);
            em.getTransaction().commit();
            
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public ArrayList<Autor> buscarPorId(Integer id) throws Exception { //Devuelve un solo objeto porque el ID es único.
        
        ArrayList<Autor> lista = null;
        try {
//            Autor a = 
//                    (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id").setParameter("id", id).getSingleResult();
            
            Query q = em.createQuery("SELECT a FROM Autor a WHERE a.id =:id").setParameter("id", id);
            lista = new ArrayList(q.getResultList());
            
            if (lista.isEmpty()) {
                System.out.println("No se encontró ningún autor con ese Id.");
            }
            return lista;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
        
    }
    
    public ArrayList<Autor> buscarPorNombre(String nom) throws Exception {
        
        ArrayList<Autor> lista = null;
        try {
             
            Query q = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").
                            setParameter("nombre", nom);
            //No pongo ("nombre", "%" + nom + "%") porque falla al ingresar nombres que sean subconjuntos de otros nombres más largos.
            //Esa forma sirve para un buscador, para buscar una parte del nombre, no para ingresar uno nuevo.
            lista = new ArrayList(q.getResultList());
//            if (lista.isEmpty()) {
//                System.out.println("No se encontró ningún autor con ese nombre.");
//            }
            return lista;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    
}
