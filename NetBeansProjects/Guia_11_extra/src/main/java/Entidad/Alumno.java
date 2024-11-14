/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Alumno {
    
    private String nombreCompleto;
    private int DNI;
    private int cantidadVotos;
    
    public Alumno() {
    }
    
    public Alumno(String nombreCompleto, int DNI, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = cantidadVotos;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public int getCantidadVotos() {
        return cantidadVotos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 67 * hash + this.DNI;
        hash = 67 * hash + this.cantidadVotos;  //No quiero que tenga en cuenta los votos (Ya lo cambie en el Simulador)
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        if (this.cantidadVotos != other.cantidadVotos) {
            return false;
        }
        return Objects.equals(this.nombreCompleto, other.nombreCompleto);
    }
    

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", cantidadVotos=" + cantidadVotos + '}';
    }
    
//    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>() {
//        @Override
//        public int compare(Alumno a1, Alumno a2) {
//            return Integer.valueOf(a1.getCantidadVotos().compareTo(Integer.valueOf(a2.getCantidadVotos())))
//        }
//    };
    
//    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>() {
//        @Override
//        public int compare(Alumno a1, Alumno a2) {
//            return a2.getCantidadVotos().compareTo(a1.getCantidadVotos());
//        }
//    };
    
//    Collections.sort(students, new Comparator<Alumno>() {
//        @Override
//        public int compare(Alumno a1, Alumno a2) {
//            return a2.getCantidadVotos().compareTo(a1.getCantidadVotos());
//        }
//    };
}
