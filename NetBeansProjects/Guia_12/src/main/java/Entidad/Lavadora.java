/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Lavadora extends Electrodomestico {
    
    private Double carga;
    
    public Lavadora() {
    }
    
    public Lavadora(Double precio, String color, char consumoEnergetico, Double peso, Double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public Double getCarga() {
        return carga;
    }

    @Override
    public String toString() {  //Lo adapte yo
        return "Lavadora{" + "precio=" + getPrecio() + ", color=" + getColor() + ", consumoEnergetico=" + getConsumoEnergetico() + ", peso=" + getPeso() + ", carga=" + carga + '}';
    }
    
    
    
}
