/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public abstract class DAO {
    
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    protected EntityManager em = emf.createEntityManager();
    
    
    protected void conectar() {
        
        if (!em.isOpen()) {  //Si está cerrado, crea uno nuevo reescribiendo el anterior.
            em = emf.createEntityManager();
        }
    
    }
    
    
    protected void desconectar() {
    
        if (em.isOpen()) {  //Si está abierto lo cierra.
            em.close();
        }
    
    }
    
    protected Object crear(Object o) {
        
        conectar();
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        desconectar();
        
        return o;
    
    }
    
    
    protected Object modificar(Object o) {
        
        conectar();
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
        desconectar();
        
        return o;
    
    }
    
    
    protected void eliminar(Object o) {
    
        conectar();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
        desconectar();
        
    }
    
    
//    protected Object consultar(Object o) {
//        
//        conectar(); //No sé si hay que desconectarse después.
//        return o;
//    
//    }
}
