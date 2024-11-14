/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;
    
    public Jugador() {
    }
    
    public Jugador(int id, boolean mojado) {
        this.id = id;
        this.nombre = "Jugador" + id;
        this.mojado = mojado;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    //Este no lo voy a usar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //FUNCIONA PERFECTO. Lo llamo como j1.setNombre(j1.getId());
//    public void setNombre(int id) {
//        this.nombre = "Jugador" + id;
//    }
    
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean getMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    public boolean disparo(Revolver r) {
        mojado = r.mojar();
        //System.out.println(mojado);
        if (mojado == false) {
            r.siguienteChorro();
        }
        return mojado;
    }
}
