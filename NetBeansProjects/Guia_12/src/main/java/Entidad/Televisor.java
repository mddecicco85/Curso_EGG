/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean TDT;
    
    public Televisor() {
    }
    
    public Televisor(Double precio, String color, char consumoEnergetico, Double peso, int resolucion, boolean TDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    public int getResolucion() {
        return resolucion;
    }
    
    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public boolean getTDT() {
        return TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + getPrecio() + ", color=" + getColor() + ", consumoEnergetico=" + getConsumoEnergetico() + ", peso=" + getPeso() + ", resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }
    
    
    
}
