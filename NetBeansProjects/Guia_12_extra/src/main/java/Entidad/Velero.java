/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Velero extends Barco {
    
    private int numeroMastiles;
    
    public Velero() {
    }
    
    public Velero(int matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

//    public int getMatricula() {
//        return matricula;
//    }
//
//    public void setMatricula(int matricula) {
//        this.matricula = matricula;
//    }
//
//    public double getEslora() {
//        return eslora;
//    }
//
//    public void setEslora(double eslora) {
//        this.eslora = eslora;
//    }
//
//    public int getAnioFabricacion() {
//        return anioFabricacion;
//    }
//
//    public void setAnioFabricacion(int anioFabricacion) {
//        this.anioFabricacion = anioFabricacion;
//    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + ", numeroMastiles=" + numeroMastiles + '}';
    }
    
    
    
}
