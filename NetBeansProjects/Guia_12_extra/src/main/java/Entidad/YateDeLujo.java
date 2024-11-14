/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class YateDeLujo extends BarcoaMotor {
    
    private int numeroCamarotes;
    
    public YateDeLujo() {
    }
    
    public YateDeLujo(int matricula, double eslora, int anioFabricacion, double potencia, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion, potencia);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

//    public double getPotencia() {
//        return potencia;
//    }
//
//    public void setPotencia(double potencia) {
//        this.potencia = potencia;
//    }
//
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
        return "YateDeLujo{" + super.toString() + ", numeroCamarotes=" + numeroCamarotes + '}';
    }
    
    
    
}
