/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import libreria.entidades.Libro;

/**
 *
 * @author Usuario
 */
public class LibroDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU_bis");
    private EntityManager em = emf.createEntityManager();
    //Se puede hacer todo en una línea.
    //EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    
    
    public Libro crearLibro(Libro lib) throws Exception {
    
        try {
            if (lib == null) {
                throw new Exception("Debe ingresar un libro.");
            }
            //lib.setAlta(true); //Esto va en Servicio, no en DAO
            
            em.getTransaction().begin();
            em.persist(lib);
            em.getTransaction().commit();
            
            return lib;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public void darDeBaja(Libro book) throws Exception {
    
        try {
//            if (book == null) {
//                throw new Exception("Debe ingresar un libro.");
//            }
              
            //book.setAlta(false); //Esto hay que sacarlo para eliminar en serio.
            em.getTransaction().begin();
            //em.remove(book); //Esto es para eliminar en serio.
            em.merge(book);
            em.getTransaction().commit();
            
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
    public void darDeAlta(Libro book) throws Exception {
    
        try {
            //book.setAlta(true);
            em.getTransaction().begin();
            em.merge(book);
            em.getTransaction().commit();
            
        } catch (Exception ex) {
            throw ex;
        }
    
    }
    
    
//    public Libro buscarPorId(Long ident) throws Exception {
//        
//        Libro l = null;
//        try {
//            l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.id =:id").setParameter("id", ident).getSingleResult();
//            
////            if (l == null) {
////                System.out.println("No se encontró ningún libro con ese Id.");
////            }
//            return l;
//            
//        } catch (Exception ex) {
//            //ex.printStackTrace();
//            System.out.println(ex.getMessage());
//            throw ex;
//        }
//    
//    }
    
    public Libro buscarPorId(Long ident) throws Exception {
        
        Libro l;
        try{
            l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.id =:id").setParameter("id", ident).getSingleResult();
            
            if (l == null) {
                System.out.println("No se encontró ningún libro con ese Id.");
            }
            return l;
            
        } catch (NoResultException ex) {
            //l = null;
            return null;
            //throw ex;
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public ArrayList<Libro> buscarPorISBN(Long is) throws Exception {
        
        //Libro l = null;
        ArrayList<Libro> lista = null;
        try { //Creo que no hace falta poner estos try-catch. No puede haber más errores porque ya llega verificado el parámetro.
            //Libro l = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.ISBN = :ISBN").setParameter("ISBN", is).getSingleResult();
            Query q = em.createQuery("SELECT l FROM Libro l WHERE l.ISBN = :ISBN").setParameter("ISBN", is);
            
            //Libro book = em.find(Libro.class, is);
            
            lista = new ArrayList(q.getResultList());
            //Libro l = lista.get(0);
//            if (l == null) {
//                throw new Exception("No se encontró ningún libro con ese ISBN.");
//            }
           
            return lista;   
        } catch (Exception ex) {
            //ex.printStackTrace();
            //System.out.println("No se encontró ningún libro con ese ISBN.");
            throw ex;
        }
//        if (libro.getIsbn() == null || libro.getIsbn() < 0 || String.valueOf(libro.getIsbn()).length() != 13) {
//            throw new Exception("Ingresaste un ISBN nulo o invalido");
//        }
        
    }
    
    
    public ArrayList<Libro> buscarPorTitulo(String tit) throws Exception {
        
        ArrayList<Libro> libros = null;
        try {
        
            Query q = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").
                            setParameter("titulo", "%" + tit + "%");
            libros = new ArrayList(q.getResultList());
            
//            if (libros.isEmpty()) {
//                System.out.println("No se encontró ningún libro con ese título.");
//            }
            return libros;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
        
    }
    
    
    public ArrayList<Libro> buscarPorAutor(String nombreAutor) throws Exception {
        
        ArrayList<Libro> libros = null;
        try {
            Query q = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre").
                            setParameter("nombre", "%" + nombreAutor + "%");
            libros = new ArrayList(q.getResultList());
            
//            if (libros.isEmpty()) {
//                System.out.println("No se encontró ningún libro con ese autor.");
//            }
            return libros;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
        
    }
    
    
    public ArrayList<Libro> buscarPorEditorial(String nombreEditorial) throws Exception {
    
        ArrayList<Libro> libros = null;
        try {
             
            Query q = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre").
                            setParameter("nombre", nombreEditorial);
            
            libros = new ArrayList(q.getResultList());
            
//            if (libros == null) {
//                System.out.println("No se encontró ningún libro de esa editorial.");
//            }
            return libros;
            
        } catch (Exception ex) {
            //ex.printStackTrace();
            throw ex;
        }
    
    }
    
    
    public void prestarLibro(Libro l) throws Exception {
    
        try {
            
            l.setEjemplaresPrestados(l.getEjemplaresPrestados() + 1);
            l.setEjemplaresRestantes(l.getEjemplaresRestantes() - 1);
            
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    
    public void devolverLibro(Libro l) throws Exception {
    
        try {
            
            l.setEjemplaresRestantes(l.getEjemplaresRestantes() + 1);
            l.setEjemplaresPrestados(l.getEjemplaresPrestados() - 1);
            
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
}
