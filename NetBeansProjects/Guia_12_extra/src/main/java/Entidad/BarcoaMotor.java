/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class BarcoaMotor extends Barco {
    
    protected double potencia;
    
    public BarcoaMotor() {
    }
    
    public BarcoaMotor(int matricula, double eslora, int anioFabricacion, double potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public double getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    @Override
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    

    @Override
    public String toString() {
        return "BarcoaMotor{" + super.toString() + ", potencia=" + potencia + '}';
    }
    
    
    
}
