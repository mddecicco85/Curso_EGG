/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.persistencia;

import biblioteca.entidades.Libro;
import java.util.ArrayList;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public final class LibroDAO extends DAO {
    
    
    //@Override
    public Libro buscarPorISBN(Long is) throws Exception {
        
        try {
            Query q = em.createQuery("SELECT l FROM Libro l WHERE l.ISBN = :ISBN").setParameter("ISBN", is);

            Libro l = (Libro) q.getSingleResult();
            
            desconectar();
            return l;
        } catch (Exception e) {
            desconectar();
            throw e;
        }
        
    
    }
    
    
    public ArrayList<Libro> buscarPorTitulo(String title) {
    
        Query q = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo").setParameter("titulo", "%" + title + "%");
        
        ArrayList<Libro> lista = new ArrayList(q.getResultList());
        
        return lista;
    
    }
    
    
    public ArrayList<Libro> buscarPorAutor(String nombreAutor) {
        
        Query q = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre").setParameter("nombre", nombreAutor);
        
        ArrayList<Libro> lista = new ArrayList(q.getResultList());
        
        return lista;
    
    }
    
    
    public ArrayList<Libro> buscarPorEditorial(String nombreEdit) {
    
        Query q = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre").setParameter("nombre", "%" + nombreEdit + "%");
        
        ArrayList<Libro> lista = new ArrayList(q.getResultList());
        
        return lista;
    
    }
    
    
    public Libro crearLibro(Libro lib) {
    
        Libro l = (Libro) crear(lib);
        
        return l;
    
    }
    
    
    public void eliminarLibro(Libro lib) {
    
        eliminar(lib);
    
    }
    
//    @Override
//    protected Object modificar(Object o) {
//    
//    return o;
//    }
    
    
    //public Libro modificarTitulo() {}
    //public Libro modificarAnio() {}
    //public Libro modificarEditorial() {}
    //public Libro modficarAutor() {}
    
}
