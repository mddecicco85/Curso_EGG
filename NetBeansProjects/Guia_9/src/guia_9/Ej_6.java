/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9;

import Entidad.Curso;
import Servicio.CursoServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CursoServicio CS = new CursoServicio();
        
        CS.crearCurso();
        CS.mostrarCurso();
        CS.calcularGanaciaSemanal();
    }
    
}
