/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;
    
    public Producto() {
    }
    
    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
    
    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigoFabricante=" + codigoFabricante + '}';
    }
    
    
    
}
